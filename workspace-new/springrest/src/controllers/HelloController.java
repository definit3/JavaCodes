package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

		@RequestMapping(value="/hello")
		public String sayHello()
		{
			return "hello world";
		}
		
		@RequestMapping(value="/welcome")
		public String welcome()
		{
			return "welcome";
		}
}
