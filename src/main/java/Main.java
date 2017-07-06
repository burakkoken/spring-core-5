import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
	
	
		Person person1 = context.getBean("person1", Person.class);
		System.out.println(person1);
		Employee employee1 = context.getBean("employee1", Employee.class);
		System.out.println(employee1);
	}

}
