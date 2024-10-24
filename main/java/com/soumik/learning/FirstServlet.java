package com.soumik.learning;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String name=request.getParameter("username");
//		String address=request.getParameter("useraddr");
//		String phNumber=request.getParameter("usernumber");
//		
//		System.out.println(name+":"+address+":"+phNumber);
		
		//response.sendRedirect("/DispatchWithForward/first.html");
		
		RequestDispatcher rd=request.getRequestDispatcher("/second");
		rd.forward(request, response);
		
		
		
	}

}
