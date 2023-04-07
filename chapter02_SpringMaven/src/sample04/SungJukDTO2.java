package sample04;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SungJukDTO2 {
	private int kor, eng, math, tot;
	private double avg;
	private String name;
	
	@Override
	public String toString() {
		
	return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t"+ String.format("%.3f",avg);
	}
	
	public void calc() {
		tot =kor + eng + math;
		avg =tot/3.0; 
	}
	
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
