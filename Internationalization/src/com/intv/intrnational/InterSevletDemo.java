package com.intv.intrnational;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;
import com.intv.resource.bundle.DemoBundle_en_US;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InterSevletDemo
 */
@WebServlet("/InterSevletDemo")
public class InterSevletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InterSevletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ResourceBundle resourceBunndle=ResourceBundle.getBundle("com.intv.resource.bundle.DemoBundle", request.getLocale());
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println(resourceBunndle.getString("SIGN_IN"));
		writer.println("<br>");
		writer.println(resourceBunndle.getString("USERNAME"));
		writer.println("<input type=text name=username>");
		writer.println("<br>");
		writer.println(resourceBunndle.getString("PASSWORD"));
		writer.println("<input type=password name=password>");
		writer.println("<br>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
