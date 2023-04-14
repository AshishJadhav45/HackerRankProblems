import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class RegistrationServlet extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    
    // Get the data from the request
    String name = request.getParameter("name");
    String studentClass = request.getParameter("class");
    String gender = request.getParameter("gender");
    String activity = request.getParameter("activity");

    // Store the data in the database
    Connection conn = null;
    PreparedStatement stmt = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost/mydatabase", "username", "password");
      stmt = conn.prepareStatement("INSERT INTO participants (name, class, gender, activity) VALUES (?, ?, ?, ?)");
      stmt.setString(1, name);
      stmt.setString(2, studentClass);
      stmt.setString(3, gender);
      stmt.setString(4, activity);
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      if (stmt != null) {
        try {
          stmt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (conn != null) {
        try {
          conn.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }

    // Send a response back to the client
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Registration Complete</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Registration Complete</h1>");
    out.println("<p>Thank you for registering for the " + activity + " activity.</p>");
    out.println("</body>");
    out.println("</html>");
  }
}
