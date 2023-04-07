package sample03;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SungJukImpl implements SungJuk{ //new를 쓰면 의존관계가 안된다
	@Autowired
	private SungJukDTO sungjukDTO = null;
	// 생성한 Bean들 중에서 SungJukDTO를 찾아서 자동으로 값을 얻어오기
	// 
	
	
	//DTO에서 kor,eng등등을 가져오겠다
//	public SungJukImpl(SungJukDTO sungjukDTO) { // 우클릭 Constructor user fields
//	this.sungjukDTO = sungjukDTO;
//}

	@Override
	public void calcTot() {//총점 계산
		sungjukDTO.setTot(sungjukDTO.getKor() + sungjukDTO.getEng() + sungjukDTO.getMath());
		
	}

	@Override
	public void calcAvg() {//평균 계산
		sungjukDTO.setAvg(sungjukDTO.getTot() / 3.);
	}

	@Override
	public void display() {// 출력
		System.out.println(sungjukDTO);
		
	}

	@Override
	public void modify() {//수정
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		sungjukDTO.setName(sc.next());
		System.out.print("국어 입력 : ");
		sungjukDTO.setKor(sc.nextInt());
		System.out.print("영어 입력 : ");
		sungjukDTO.setEng(sc.nextInt());
		System.out.print("수학 입력 : ");
		sungjukDTO.setMath(sc.nextInt());
		
	}

}
