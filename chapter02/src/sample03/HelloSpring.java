package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample03.SungJukImpl;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
		SungJukImpl sungJukImpl = (SungJukImpl) context.getBean("sungJukImpl");
		sungJukImpl.calcTot();
		sungJukImpl.calcAvg();
		sungJukImpl.display();
		System.out.println();
		
		sungJukImpl.modify();
		sungJukImpl.calcTot();
		sungJukImpl.calcAvg();
		sungJukImpl.display();
	}

}
