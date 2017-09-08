package shiyan7;


public class MyDate {
   private int month;
   private int day;
   private int year;
   public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String toDateString(){
	   return year+"Äê"+month+"ÔÂ"+day+"ÈÕ";
   }
}
