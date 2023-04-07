package sample04;

import java.util.List;
import java.util.Scanner;

import lombok.Setter;

public class SungJukInput implements SungJuk{
	@Setter
	private SungJukDTO2 sungJukDTO2 = null;
	@Setter
	private List<SungJukDTO2> list = null; 
	@Override
	public void execute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		
		//데이터
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		System.out.println("국어 입력 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 입력 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 입력 : ");
		int math = sc.nextInt();
		
		System.out.println();
		
		
		int tot = kor + eng + math;
		double avg = tot/3.;
		
		sungJukDTO2.setName(name);
		sungJukDTO2.setKor(kor);
		sungJukDTO2.setEng(eng);
		sungJukDTO2.setMath(math);
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(avg);
		//ArrayList에 담기
		//List<E> list = new ArrayList();
		list.add(sungJukDTO2);
		
		//출력
		System.out.println(name + "님의 데이터를 입력하였습니다");
	}
	public SungJukDTO2 getSungJukDTO2() {
		return sungJukDTO2;
	}
	public List<SungJukDTO2> getList() {
		return list;
	}

		
	}


