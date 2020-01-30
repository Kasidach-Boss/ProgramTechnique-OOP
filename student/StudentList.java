import java.util.ArrayList;

class StudentList {
    private ArrayList<Student> Students;
    public StudentList(){
        Students = new ArrayList<Student>();
    }
    public void addStudent(Student student) {//    add Student object to ArrayList() 
       Students.add(student);
    }  
    public void removeStudentBystCode(String stCode){ // remove Student (given stCode) object from Arraylist
        for(int p=0; p< Students.size(); p++){
            if (Students.get(p).GetCode().equals(stCode)){
                Students.remove(p);
            }
        }
       
    }
    public void showAllStudentInfo() {
        for (Student All : Students) {
            System.out.println(All);
          }
    }  
    public int searchStudentBystCode(String stCode){
        
        for(int p=0; p< Students.size(); p++){
            if(Students.get(p).GetCode().equals(stCode)){
                return p;
            }
        }
        return -1;
    }
    public int getNumberOfStudent(){
        int numStudent=Students.size();

        return numStudent;

    }
}
