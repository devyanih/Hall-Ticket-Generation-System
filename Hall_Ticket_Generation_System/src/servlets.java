import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddStudentServlet extends HttpServlet {
    private HallTicketService hallTicketService = new HallTicketService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String rollNumber = request.getParameter("rollNumber");

        try {
            hallTicketService.addStudent(name, rollNumber);
            response.getWriter().println("Student added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Error adding student");
        }
    }
}

