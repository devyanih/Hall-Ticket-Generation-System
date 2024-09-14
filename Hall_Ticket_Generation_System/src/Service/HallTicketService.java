package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HallTicketService {
    public void addStudent(String name, String rollNumber) throws SQLException {
        String sql = "INSERT INTO Student (name, roll_number) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, rollNumber);
            stmt.executeUpdate();
        }
    }

    public void generateHallTicket(int studentId) throws SQLException {
        String sql = "INSERT INTO HallTicket (student_id, issue_date) VALUES (?, CURDATE())";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, studentId);
            stmt.executeUpdate();
        }
    }
}

