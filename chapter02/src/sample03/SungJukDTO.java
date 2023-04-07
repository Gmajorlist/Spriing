package sample03;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter      //방법2
public class SungJukDTO {
	private int kor, eng, math, tot;
	private double avg;
	private String name;
	
	@Override
	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + String.format("%.3f",avg);
	}
	//Setter 방법 1
	/*
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setName(String name) {
		this.name = name;
	}
	*/
}
