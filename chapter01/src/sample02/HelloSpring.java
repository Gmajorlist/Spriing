package sample02;

public class HelloSpring {

	public static void main(String[] args) {
		//MessageBeanKo messageBeanKo = new MessageBeanKo(); //1:1관계, 결합도 100%
		
		
		
		//다형성 ㅡ 부모 - 자식 , 결합도 낮음
		MessageBean messageBean = new MessageBeanKo();
		messageBean.sayHello("Spring");
	}

}
