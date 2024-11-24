public class Studente {
    

    private String name;
    private String surname;
    private int age;

    public Studente (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
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

}
