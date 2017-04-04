package ohtu;

import java.util.ArrayList;

public class Submission {
    private String student_number;
    private Integer week;
    private Integer hours;
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    private boolean a12;
    private ArrayList<Integer> exercises = new ArrayList();
    private Integer max = 0;



    public String getStudent_number() {
        return student_number;
    }


    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public Integer getWeek() {
      return week;
    }

    public void setWeek(Integer week) {
      this.week = week;
    }

    public Integer getHours() {
      return hours;
    }

    public void setHours(Integer hours) {
      this.hours = hours;
    }

    public void setA1(boolean a1) {
      this.a1 = a1;
    }

    public boolean getA1() {
      if (a1) {
        exercises.add(1);
      }
      max++;
      return a1;
    }

    public void setA2(boolean a1) {
      this.a2 = a1;
    }

    public boolean getA2() {
      if (a2) {
        exercises.add(2);
      }
      max++;
      return a2;
    }

    public void setA3(boolean a1) {
      this.a3 = a1;
    }

    public boolean getA3() {
      if (a3) {
        exercises.add(3);
      }
      max++;
      return a3;
    }

    public void setA4(boolean a1) {
      this.a4 = a1;
    }

    public boolean getA4() {
      if (a4) {
        exercises.add(4);
      }
      max++;
      return a4;
    }

    public void setA5(boolean a5) {
      this.a5 = a5;
    }

    public boolean getA5() {
      if (a5) {
        exercises.add(5);
      }
      max++;
      return a5;
    }

    public void setA6(boolean a1) {
      this.a6 = a1;
    }

    public boolean getA6() {
      if (a6) {
        exercises.add(6);
      }
      max++;
      return a6;
    }

    public void setA7(boolean a1) {
      this.a7 = a1;
    }

    public boolean getA7() {
      if (a7) {
        exercises.add(7);
      }
      max++;
      return a7;
    }

    public void setA8(boolean a1) {
      this.a8 = a1;
    }

    public boolean getA8() {
      if (a8) {
        exercises.add(8);
      }
      max++;
      return a8;
    }

    public void setA9(boolean a1) {
      this.a9 = a1;
    }

    public boolean getA9() {
      if (a9) {
        exercises.add(9);
      }
      max++;
      return a9;
    }

    public void setA10(boolean a1) {
      this.a10 = a1;
    }

    public boolean getA10() {
      if (a10) {
        exercises.add(10);
      }
      max++;
      return a10;
    }

    public void setA11(boolean a1) {
      this.a11 = a1;
    }

    public boolean getA11() {
      if (a11) {
        exercises.add(11);
      }
      max++;
      return a11;
    }

    public void setA12(boolean a12) {
      if (a12 == null) {
        System.out.println("JEEEE");
      }
      this.a12 = a12;
    }

    public boolean getA12() {
      System.out.println(a12);
      if (a12) {
        exercises.add(12);
      }
      max++;
      return a12;
    }

  public String doneExercises() {
    String all = "";
    for (Integer exercise : exercises) {
      all += exercise + " ";
    }
    return all;
  }





    public Integer amountOfExercises() {
      return exercises.size();
    }


    @Override
    public String toString() {
      getA1();
      getA2();
      getA3();
      getA4();
      getA5();
      getA6();
      getA7();
      getA8();
      getA9();
      getA10();
      getA11();
      getA12();
        return "viikko " + getWeek() +  ": tehtyjä tehtäviä yhteensä: " + amountOfExercises() +
                 " (maksimi " + max + ") " +
               ", aikaa kului " +   getHours() + ", tehdyt tehtävät " + doneExercises() ;

    }

}
