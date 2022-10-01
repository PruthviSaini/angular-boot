package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	for(int i=0;i<9;i++)
        {
            mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
        }
	return "Greetings from Spring!"+index;
	}
	
	@GetMapping("/sub")
	public String index(sub) {
		return "Greetings from Spring!"+sub;
	}
	
	@PostMapping("/mul")
	public String index(index) {
		return "Greetings from Spring!"+mul;
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");
			string getUserName(){
			return "getUserName";
			}
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
				System.out.println(bean.Os.getUserName());
			}

		};
	}

}
