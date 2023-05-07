package servlet_demo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Dynamic1 implements Servlet{

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
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String s= arg0.getParameter("firstname");
		String s1= arg0.getParameter("lastname");
		String s2=arg0.getParameter("father");
		System.out.println("Full Name"+s+" "+s1+"Father Name: "+s2);
		arg1.getWriter().print(" <h1 style='color:red';>Full Name"+s+" "+s1+ " Father Name  "+s2+"</h1>");
	}

}
