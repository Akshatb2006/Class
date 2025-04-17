/*: Design a class Student with private fields studentId, name, and marks.
Implement methods to get and set these fields. Create a method calculateGrade() that
returns "A" if marks are greater than or equal to 90, "B" for marks above 75, and "C" for
marks below 75. Instantiate a Student object and print the grade.
 */

 class Student {
    private int StudentId;
    private String name;
    private int marks;

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getStudentId(){
        return StudentId;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public String calculateGrade(){
        if(marks>=90){
            return "A";
        }else if(marks>75){
            return "B";
        }else{
            return "C";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(23);
        student.setName("john");
        student.setMarks(80);
        String grade = student.calculateGrade();
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Grade: " + grade);
    }
 }