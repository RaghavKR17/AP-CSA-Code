public class MyDate {
 int day;
 int month;
 int year;

 public MyDate(){
	 day = 01;
	 year = 2000;
	 month = 1;
	 
 }
 
 public MyDate(int m, int d, int y){
	 setDate(m, d, y);
 }

 public String toString(){
	 return month + "/" + day + "/" + year;
 }
 public void setDate(int m, int d, int y){
	 day = d;
	 year = y;
	 month = m;
 }
}