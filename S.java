class Student{
    int rollno;
    int mark;
}

public class S {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 1;
        s1.mark = 95;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.mark = 88;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.mark = 92;

        System.out.println("Student 1: " + s1.rollno + " " + s1.mark);
        System.out.println("Student 2: " + s2.rollno + " " + s2.mark);
        System.out.println("Student 3: " + s3.rollno + " " + s3.mark);
    }
}