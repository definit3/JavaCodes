package com.hsbc.trg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	HashMap<Integer,Employee>data=new HashMap<Integer,Employee>();
	
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Object Created");
		data.put(100,new Employee(100,"Suresh",70000,"1998-01-01"));
		data.put(101,new Employee(101,"Person1",80000,"2001-02-02"));
		data.put(102,new Employee(102,"Person3",15000,"1991-03-03"));
		data.put(103,new Employee(103,"Person4",80000,"1992-04-04"));
	}

	public void destroy() {
		System.out.println("Servlet Object Destroyed");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String s=request.getParameter("empid");
		
		int empId=Integer.parseInt(s);
		Employee e = data.get(empId);
		PrintWriter pw = response.getWriter();
		response.setContentType("text/json");
		if(e==null)
		{
			pw.println("<HTML>");
			pw.println("<head>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<H1>Employee Not found!!"+ "</H1>");
			pw.println("</body>");
			pw.println("</HTML>");
		}
		else
		{
//			String name=e.getName();
//			String dob=e.getDob();
//			float salary=e.getSalary();
//			String sal=Float.toString(salary);
//			int empid=e.getEmpId();
//			String eid=Integer.toString(empid);
//			pw.println("<HTML>");
//			pw.println("<head>");
//			pw.println("</head>");
//			pw.println("<body>");
//			pw.println("<H1> Employee Found.."+" </H1>");
//			pw.println("<H2> Name: "+name+" </H1>");
//			pw.println("<H2> DOB: "+dob+" </H1>");
//			pw.println("<H2> Salary: "+ sal +" </H1>");
//			pw.println("<H2> Emp ID: "+ eid +" </H1>");
//			pw.println("</body>");
//			pw.println("</HTML>");
			
			
//			String output="<Employee>";
//			output+="<empid>"+e.getEmpId()+"</empid>";
//			output+="<name>"+e.getName()+"</name>";
//			output+="<salary>"+e.getSalary()+"</salary>";
//			output+="<dob>"+e.getDob()+"</dob>";
//			output+="</Employee";
//			pw.print(output);
//			
			String output="{\"empid\":";
			output+=e.getEmpId();
			output+=",\"name\":\""+e.getName()+"\"}";
			pw.print(output);
		}

	}

}
