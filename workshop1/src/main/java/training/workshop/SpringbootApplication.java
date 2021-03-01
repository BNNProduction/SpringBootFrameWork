package training.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static java.lang.System.out;


@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		// IoC Container, Bean => Spring
		// DI (Dependency Injection)
		// IoC (Inversion of Control)
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
		String[] beans = context.getBeanDefinitionNames();
		for (String bean : beans) {
			out.println(bean);
		}
		out.println(context.getBeanDefinitionCount());
		
		User u1 = context.getBean(User.class);
		u1.setName("Bua");
		System.out.println(u1.getName());
		User u2 = context.getBean(User.class);
		u2.setName("GG");
		System.out.println(u2.getName());
		System.out.println(u1.getName());
	}

}
