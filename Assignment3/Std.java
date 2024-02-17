package assignment33;

public class Std {
	
    public static void main(String [] args)
    {
    	StudentInfo studentInfo = new StudentInfo(); 
        //Student b = new Student();
        studentInfo.addStudent();
        studentInfo.printStudentDetails();
        studentInfo.deleteStudent();
        studentInfo.printStudentDetails();
    }
}


