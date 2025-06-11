package via.doc1.spring_boot_docker_app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApp1Application {

	@RequestMapping("/") 
	public String index() { 
		return "<body bgcolor=\"#9FE2BF\">"+
		"<h1>DevOps and Cloud</h1> " + 
		"<h2>Dockerizing Spring Boot Application.</h2>" + 
		"</body>"; 
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApp1Application.class, args);
	}

}
