package sample04;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class CalcAdd implements Calc{

	@Override
	public void calculate(int x, int y) {
		System.out.println(x+y);
		System.out.println(x+ "+" + y + "=" + x+y);
	}

	
	}

