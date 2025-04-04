import java.sql.*;

public class StudentDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database"; // Replace with your database name
        String user = "your_username"; // Replace with your database username
        String password = "your_password"; // Replace with your database password

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            
            // Create student table
            String createTable = "CREATE TABLE IF NOT EXISTS students (" +
                    "Name VARCHAR(50), " +
                    "RollNo INT PRIMARY KEY, " +
                    "CGPA FLOAT, " +
                    "Branch VARCHAR(10))";
            stmt.executeUpdate(createTable);

            // Insert records
            String insertQuery = "INSERT INTO students (Name, RollNo, CGPA, Branch) VALUES " +
                    "('Alice', 1, 8.2, 'CSE'), " +
                    "('Bob', 2, 7.0, 'ECE'), " +
                    "('Charlie', 3, 9.1, 'CSCE'), " +
                    "('David', 4, 6.8, 'MECH'), " +
                    "('Eve', 5, 7.4, 'CSE'), " +
                    "('Frank', 6, 8.7, 'CSCE'), " +
                    "('Grace', 7, 9.0, 'CSE'), " +
                    "('Hank', 8, 7.9, 'EEE'), " +
                    "('Ivy', 9, 6.5, 'CIVIL'), " +
                    "('Jack', 10, 8.9, 'CSE')";
            stmt.executeUpdate(insertQuery);
            
            // a. Display students with CGPA < 7.5
            System.out.println("Students with CGPA < 7.5:");
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM students WHERE CGPA < 7.5");
            printResults(rs1);
            
            // b. Display students from CSE/CSCE with CGPA > 8.5
            System.out.println("\nCSE/CSCE students with CGPA > 8.5:");
            ResultSet rs2 = stmt.executeQuery("SELECT * FROM students WHERE Branch IN ('CSE', 'CSCE') AND CGPA > 8.5");
            printResults(rs2);
            
            // c. Display top 5 students of CSE/CSCE (ordered by CGPA descending)
            System.out.println("\nTop 5 students of CSE/CSCE:");
            ResultSet rs3 = stmt.executeQuery("SELECT * FROM students WHERE Branch IN ('CSE', 'CSCE') ORDER BY CGPA DESC LIMIT 5");
            printResults(rs3);
            
            // Close resources
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printResults(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println("Name: " + rs.getString("Name") + ", Roll No: " + rs.getInt("RollNo") + ", CGPA: " + rs.getFloat("CGPA") + ", Branch: " + rs.getString("Branch"));
        }
    }
}
