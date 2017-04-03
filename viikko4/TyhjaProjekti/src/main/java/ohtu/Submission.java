package ohtu;

public class Submission {
    private String student_number;
    private Integer week;

    public String getStudent_number() {
        return student_number;
    }

    public Integer getWeek() {
      return week;
    }

    public void setWeek(Integer week) {
      this.week = week;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    @Override
    public String toString() {
        return "viikko " + week;
    }

}
