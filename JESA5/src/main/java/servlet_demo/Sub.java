package servlet_demo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Sub implements Servlet{

	public static void main(String[] args) {
		

	}

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
		int num1=  Integer.parseInt(req.getParameter("first"));
		int num2=  Integer.parseInt(req.getParameter("second"));
		res.getWriter().print("<h1 style=color:blue;> The subtraction of two numbers is "+num1+"-"+num2+" = "+(num1-num2)+"</h1>");
		System.out.println(num1-num2);
		
	}

}
