package ohtu;



public class Course {

private String name;
private String term;
private int week1;
private int week2;
private int week3;
private int week4;

 public void setName(String name) {
   this.name = name;
 }

 public String getName() {
   return name;
 }

 public void setTerm(String term) {
   this.term = term;
 }

 public String getTerm() {
   return term;
 }

 public void setWeek1(int value) {
   this.week1 = value;
 }

 public Integer getWeek1() {
   return week1;
 }

 public void setWeek2(int value) {
   this.week2 = value;
 }

 public Integer getWeek2() {
   return week2;
 }

 public void setWeek3(int value) {
   this.week3 = value;
 }

 public Integer getWeek3() {
   return week3;
 }

 public void setWeek4(int value) {
   this.week4 = value;
 }

 public Integer getWeek4() {
   return week4;
 }

 @Override
 public String toString() {
   return "Kurssi: " + name + ", " + term;
 }
}
