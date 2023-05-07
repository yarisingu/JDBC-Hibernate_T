package dao;

import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/student")
public class Save_std implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String  name = req.getParameter("name");
		long	mobile=	 Long.parseLong(req.getParameter("mobile"));
		String  Email  = req.getParameter("email");
		String  date  = req.getParameter("dob");
		String  gender  = req.getParameter("gender");
		String  adress  = req.getParameter("address");
		String[]  skills  = req.getParameterValues("skills");
		String  country  = req.getParameter("country");
		
		res.getWriter().print("<h1>Name: "+name+"</h1>");
		res.getWriter().print("<h1>Mobile: "+mobile+"</h1>");
		res.getWriter().print("<h1>Email: "+Email+"</h1>");
		res.getWriter().print("<h1>date: "+date+"</h1>");
		res.getWriter().print("<h1>Gender: "+gender+"</h1>");
		res.getWriter().print("<h1>Adress: "+adress+"</h1>");
		res.getWriter().print("<h1>Skills: "+Arrays.toString(skills)+"</h1>");
		res.getWriter().print("<h1>Skills: "+country+"</h1>");
		
		Students std = new Students();
		std.setName(name);
		std.setMobile(mobile);
		std.setEmail(Email);
		std.setDate( Date.valueOf(date));
		std.setGender(gender);
		std.setAdress(adress);
		std.setSkills(skills);
		std.setCountry(country);
		
		S_conroller.save(std);
		
		res.getWriter().print("<h1> Data added sucessfully</h1>");
	
	}

	

}
