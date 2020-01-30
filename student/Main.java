public class Main {
    public static void main (String args[]) {
        StudentList stlist = new StudentList();
        Student S1,S2,S3,S4;
            S1 = new Student("001","Yuki",3.5);
            S2 = new Student("002","Mayuri",3.8);
            S3 = new Student("003","Miku",3.9);
            S4 = new Student("004","Ryo",3.2);

        stlist.addStudent(S1);
        stlist.addStudent(S2);
        stlist.addStudent(S3);
        stlist.addStudent(S4);

        System.out.println("Number Of Student(Before remove student)" + " is " +  stlist.getNumberOfStudent());
        stlist.removeStudentBystCode("004"); //remove stCode"004"
        stlist.showAllStudentInfo(); //show all of student after remove "004"
        System.out.println("Your result " + " is " +  stlist.searchStudentBystCode("003")); // search stCode"003"
        System.out.println("Number Of Student" + " is " +  stlist.getNumberOfStudent()); //numberofstudent
    }
}
