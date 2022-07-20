package rs.edu.code.springgitdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGitDemoApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringGitDemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Runnable runableObject = () -> System.out.println("Executing runable in thread: " + Thread.currentThread().getName());
//		Thread thread1 = new Thread(runableObject);
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		executor.execute(runableObject);
		
	}

}
