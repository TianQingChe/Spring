package guru.springframework.joke;

import guru.springframework.joke.controllers.JokeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class JokeappApplication {
    @Autowired
    Environment env;

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(JokeappApplication.class, args);
		JokeController c=ctx.getBean("jokeController",JokeController.class);
		System.out.print(c.showName());
	}
}
