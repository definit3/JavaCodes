package hsbc.customer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressFactory {

	@Bean(name="add1")	
	public Address getAdd1()
		{
			return new Address("Building","Street1","City1");
		}
		@Bean(name="add2")
		public Address getAdd2()
		{
			return new Address("building2","Street2","city2");
		}
}
