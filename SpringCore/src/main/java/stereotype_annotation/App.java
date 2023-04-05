package stereotype_annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		ChatService chatService = context.getBean(ChatService.class);
		
		chatService.chat();
		context.close();
		
	}	
	
}
