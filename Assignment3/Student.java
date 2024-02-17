package assignment33;

public class Student {
    
    private int prn;
    private String dob; 
    private String name;
    private double marks; 

    public Student(int prn, String name, String dob) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;        
    }

    public int getPrn() {
        return prn;
    }

    public void setPrn(int prn) {
        this.prn = prn;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
