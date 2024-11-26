public class Studente {
    

    private String name;
    private String surname;
    private int age;
    private ContoBancario banckAccount;
    private RegistroStudenti registroStudenti;

    public Studente (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.banckAccount = new ContoBancario();
    }

    public Studente(String name, String surname, int age, RegistroStudenti registro){
        this(name, surname, age);
        this.addToRegistroStudenti(registro);
    }

    public void addToRegistroStudenti(RegistroStudenti registro){
        this.registroStudenti = registro;
        this.registroStudenti.addStudent(this);
    }

    public String getDetails(){
        return this.name + " " + this.surname + " " + this.age;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getAge(){
        return this.age;
    }

    public ContoBancario getBankAccount(){
        return this.banckAccount;
    }

}
