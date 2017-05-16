import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ymtz.spring.helloworld.HelloWorld;
import com.ymtz.spring.helloworld.HelloWorldService;

public class HelloWorldProgram {

	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		HelloWorldService service=(HelloWorldService) context.getBean("helloWorldService");
		
		HelloWorld helloWorld=service.getmHelloWorld();
		
		helloWorld.sayHello();
	}
	
	
}
