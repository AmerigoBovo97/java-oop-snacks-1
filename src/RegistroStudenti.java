public class RegistroStudenti {
    
    private Studente[] students;

    public RegistroStudenti(){
        this.students = new Studente[0];
    }

    public void addStudent(Studente student){

        Studente[] newArray = new Studente[this.students.length + 1];

        int registroLengh = this.students.length; 
        for(int i = 0; i < registroLengh; i++){
            newArray[i] = this.students[i];
        }

        newArray[registroLengh] = student;
        
        this.students = newArray;

    }

    public Studente[] getStudents(){
        for(Studente student: this.students){
            System.out.println(student.getName());
        }
        return this.students;
    }
}
