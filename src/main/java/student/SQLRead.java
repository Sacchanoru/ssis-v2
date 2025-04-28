package student;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SQLRead {
    private static final String username = "root";
    private static final String password = "1234";
    private static final String dataConn = "jdbc:mysql://localhost:3306/ssis";
    private static final int ITEMS_PER_PAGE = 15;

    public void displaySQLtable(String query, JTable table) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dataConn, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();

            int cols = rsmd.getColumnCount();
            String[] colname = new String[cols];

            for (int i = 0; i < cols; i++) {
                colname[i] = rsmd.getColumnName(i + 1);
            }

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            model.setColumnIdentifiers(colname);

            while (rs.next()) {
                String[] row = new String[cols];
                for (int i = 0; i < cols; i++) {
                    row[i] = rs.getString(i + 1);
                }
                model.addRow(row);
            }

            st.close();
            rs.close();
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void update_table(
        JTable table, JTextField current_page, JLabel max_page_label,
        String tableName, int page, String sortColumn,
        String searchColumn, String keyword, String[] searchableColumns
    ) {
        int offset = (page - 1) * ITEMS_PER_PAGE;
        boolean hasSort = sortColumn != null && !sortColumn.equals("Sort by") && !sortColumn.isEmpty();
        boolean hasSearch = keyword != null && !keyword.isEmpty();
        StringBuilder query = new StringBuilder("SELECT * FROM " + tableName);

        if (hasSearch) {
            query.append(" WHERE ");
            if (searchColumn == null || searchColumn.isEmpty()) {
                for (int i = 0; i < searchableColumns.length; i++) {
                    query.append(searchableColumns[i]).append(" LIKE '%").append(keyword).append("%'");
                    if (i < searchableColumns.length - 1) {
                        query.append(" OR ");
                    }
                }
            } else {
                query.append(searchColumn).append(" LIKE '%").append(keyword).append("%'");
            }
        }

        if (hasSort) {
            query.append(" ORDER BY ").append(sortColumn).append(" ASC");
        }

        query.append(" LIMIT ").append(ITEMS_PER_PAGE).append(" OFFSET ").append(offset);
        System.out.println("Final query: " + query);
        displaySQLtable(query.toString(), table);

        try {
            int total_rows = get_rows_count(tableName, searchColumn, keyword, searchableColumns);
            int total_pages = (int) Math.ceil((double) total_rows / ITEMS_PER_PAGE);
            max_page_label.setText("/" + total_pages);
            current_page.setText(String.valueOf(page));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error counting rows: " + e.getMessage());
        }
    }

    public int get_rows_count(String tableName, String search_column, String keyword, String[] searchable_column) throws SQLException {
        int total_rows = 0;
        StringBuilder query = new StringBuilder("SELECT COUNT(*) FROM " + tableName);

        if (keyword != null && !keyword.isEmpty()) {
            query.append(" WHERE ");
            if (search_column == null || search_column.isEmpty()) {
                for (int i = 0; i < searchable_column.length; i++) {
                    query.append(searchable_column[i]).append(" LIKE '%").append(keyword).append("%'");
                    if (i < searchable_column.length - 1) {
                        query.append(" OR ");
                    }
                }
            } else {
                query.append(search_column).append(" LIKE '%").append(keyword).append("%'");
            }
        }

        try (Connection con = DriverManager.getConnection(dataConn, username, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query.toString())) {
            if (rs.next()) {
                total_rows = rs.getInt(1);
            }
        }

        return total_rows;
    }

    public int get_total_rows(String tableName) throws SQLException {
        int total_rows = 0;
        String countQuery = "SELECT COUNT(*) FROM " + tableName;
        try (Connection con = DriverManager.getConnection(dataConn, username, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(countQuery)) {
            if (rs.next()) {
                total_rows = rs.getInt(1);
            }
        }
        return total_rows;
    }

    public static void main(String[] args) {
        System.out.println("working");
    }
}