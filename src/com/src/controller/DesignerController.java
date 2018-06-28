package com.src.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.model.Designer;

/**
 * Servlet implementation class DesignerController
 */
@WebServlet("/Designer")
public class DesignerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DesignerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirm = request.getParameter("cpassword");
		String email = request.getParameter("email");
		String usertype = request.getParameter("usertype");
		
		
		
		Designer d=new Designer();
		d.setUsername(username);
		d.setUsertype(usertype);
		d.setPassword(password);
		d.setEmail(email);
		
		
		
		request.setAttribute("name", username);
		request.getRequestDispatcher("WEB-INF/Welcome.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
