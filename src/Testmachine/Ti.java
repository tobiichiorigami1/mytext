package Testmachine;

public class Ti {
	public String getTiGan() {
		return tiGan;
	}
	public void setTiGan(String tiGan) {
		this.tiGan = tiGan;
	}
	public String getXuanXiang() {
		return xuanXiang;
	}
	public void setXuanXiang(String xuanXiang) {
		this.xuanXiang = xuanXiang;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	// 题干
	// 选项
	// 标准答案
	private String tiGan;
	private String xuanXiang;
	private String answer;
	public Ti(String tiGan, String xuanXiang, String answer) {
		super();
		this.tiGan = tiGan;
		this.xuanXiang = xuanXiang;
		this.answer = answer;
	}
    
	
    

}
