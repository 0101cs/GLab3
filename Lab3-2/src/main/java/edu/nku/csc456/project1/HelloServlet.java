package edu.nku.csc456.project1;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Arrays;
import java.util.stream.*;

public class HelloServlet extends HttpServlet {

	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws IOException {
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String color = request.getParameter("color");
		String food[] = request.getParameterValues("food");
		String course = request.getParameter("course");
		String weather = request.getParameter("weather");
		out.println("<html> " +
			    "<body>"+
			    "<h1 align=center>Hello!  " + firstName + "  " + lastName + "</h1>" + "<br/>" +
				"<b>Favorite color: </b>" + color + "<br/>" +
				"<b>Food you like: </b>" + Arrays.asList(food).stream().collect(Collectors.joining(", ")) + "<br/>" +
				"<b>Number of courses your signed up for: </b>" + course + "<br/>" +
				"<b>Weather you like: </b>" + weather + "<br/>" +				
			    "</body>"+"</html>");
	}

}
