package java_based_bean_configuration;

// USE THE RIGHT IMPORT!!! or else you get NullExceptionError
import org.springframework.beans.factory.annotation.Configurable; 
import org.springframework.context.annotation.Bean;

@Configurable
public class BeanConfiguration {
	
	@Bean(name="person")
	public Person getPerson()
	{
		Person person = new Person();
		person.setId(9999);
		person.setName("Frank");
		person.setAge(20);
		return person;
	}

	@Bean(name="product")
	public Product getProduct()
	{
		Product product = new Product();
		product.setId(1001);
		product.setName("Chips");
		product.setPrice(3.99f);
		return product;
	}
	
}
