package muheto.lab.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
@WebServlet("/Lab")
public class Lab extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Lab() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * response.setContentType("text/html"); response.setCharacterEncoding("UTF-8");
		 * 
		 * PrintWriter out = response.getWriter(); out.println("Bite Muhe!");
		 * 
		 */
		///assuming request as the object of the HttpServletRequest Class.
		//retriving & storing the values from the textboxes into the String Variables.
		
		String n1=request.getParameter("fnum");
		int num1 = Integer.parseInt(n1); //converting string into integer variable
		String n2 = request.getParameter("snum");
		int num2 = Integer.parseInt(n2);
		int ans=0;
		
		// Now time to calculate according to selection:
		
		if (request.getParameter("calc").equals("Add"))
			ans=num1+num2;
		if (request.getParameter("calc").equals("Sub"))
			ans=num1-num2;
		if (request.getParameter("calc").equals("Div"))
			ans=num1/num2;
		if (request.getParameter("calc").equals("Multi"))
			ans=num1*num2;
		
		//display the answer to the user
		
		response.getWriter().println(ans);
		
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Mwiriwe.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
