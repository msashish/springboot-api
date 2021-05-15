package learn.basic.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
@SpringBootApplication internally is a combination of the following 3 annotations

@Configuration: Needed for Manual Spring configurations. Adding this annotation ensures that configuration can be done in a java class
				itself instead of using a separate xml file.
@EnableAutoConfiguration: Spring needs a lot of configuration to be done. This annotation ensures that a lot of the configuration is
				done automatically.
@ComponentScan: This tells Spring, where all to scan for components.
 */

@SpringBootApplication
public class SpringbootApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootApiApplication.class, args);
	}

}
