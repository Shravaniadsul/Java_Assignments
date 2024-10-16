package com.solution.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   static {
	   System.out.println("Servlet is loading");
   }
    public ReadServlet() {
        super();
 	   System.out.println("Servlet is instantation");

    }

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("html/text");
		String name= request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>"+name+"</h1>");
		   System.out.println(name);
		   
		   out.close();

	}

}
