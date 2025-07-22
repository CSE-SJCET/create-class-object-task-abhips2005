class Student {
    String name;
    int rollNumber;
    char grade;
     
    public void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Grade : " + grade);
    }
}


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
         s1.name = "Abhijith";
         s1.rollNumber = 03;
         s1.grade = 'A';
           
        s1.displayDetails();
    }
}
