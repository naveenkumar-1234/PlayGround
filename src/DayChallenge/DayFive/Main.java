package DayChallenge.DayFive;

public class Main {
    public static void main(String[] args) {
        Student.setCollegeName("xxx");
        Student st1 = new Student();
        Student st2 = new Student();

        st1.setStudentName("John");
        System.out.println(Student.getCollegeName());
        st2.setStudentName("Parker");
        Student.setCollegeName("yyy");
        System.out.println(Student.getCollegeName());

    }
}

class Student{
    private static String collegeName;
    private String studentName;

    public static String getCollegeName() {
        return collegeName;
    }

    public static void setCollegeName(String collegeName) {
        Student.collegeName = collegeName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
