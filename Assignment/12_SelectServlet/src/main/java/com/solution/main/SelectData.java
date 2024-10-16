package com.solution.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.solution.controller.StudentApp;
import com.solution.dao.Student;


@WebServlet("/select")
public class SelectData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       static {
    	   System.out.println("Select Data is loading");
       }
   
    public SelectData() {
        super();
        System.out.println("Select data is instantion");
    }

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String id = request.getParameter("id");
		   
		   Integer id1 = Integer.parseInt(id);
		   StudentApp app=new StudentApp();
		   Student std = app.selectData(id1);
		   
		 
		   PrintWriter out = response.getWriter();
		   out.println("<html><head><title>Result</title></head><body>");
			  out.println("<center>");
			  out.println("<h1>Employee Data</h1>");
			  out.println("<table border='1'>");
			  out.println("<tr> <th>ID</th>  <td>"+std.getId()+"</td> </tr>");
			  out.println("<tr> <th>Name</th>  <td>"+std.getName()+"</td> </tr>");
			  out.println("<tr> <th>Age</th>  <td>"+std.getAge()+"</td> </tr>");
			  out.println("<tr> <th>City</th>  <td>"+std.getCity()+"</td> </tr>");
			  out.println("</table>");
			  out.println("</br><button> <a href='index.html'> home page</a></button> ");

			  out.println("</center></body></html>");
			  
			   
		
	}

}
