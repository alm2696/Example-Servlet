package mod04_01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Example servlet that handles HTTP GET and POST requests.
 * 
 * This servlet demonstrates basic functionality by responding to both 
 * GET and POST requests with a message containing the context path.
 * 
 * @author angel
 * @version 1.0
 */
@WebServlet("/Example")
public class Example extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * Default constructor.
     * 
     * Calls the superclass constructor and initializes the servlet.
     */
    public Example() {
        super();
    }

    /**
     * Handles HTTP GET requests.
     * 
     * Responds with a message that includes the context path of the servlet.
     * 
     * @param request  the HttpServletRequest object containing the client request
     * @param response the HttpServletResponse object for sending the response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the response content type to text/html
        response.setContentType("text/html");

        // Write a message containing the context path to the response
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * Handles HTTP POST requests.
     * 
     * Forwards the POST request to the doGet method, so POST and GET behave similarly.
     * 
     * @param request  the HttpServletRequest object containing the client request
     * @param response the HttpServletResponse object for sending the response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward POST requests to the doGet method
        doGet(request, response);
    }
}
