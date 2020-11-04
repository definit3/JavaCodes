package hsbc.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
//		Customer c1=(Customer)ctx.getBean("cust2");
//		System.out.println(c1);
		Address a1=(Address)ctx.getBean("add2");
		System.out.println(a1);
	}

}
 