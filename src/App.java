public class App {
    
    public static void main(String[] args) {
        RegistroStudenti bept4 = new RegistroStudenti();
        Studente davide = new Studente("Davide", "Blaffard", 26);
        Studente danilo = new Studente("Danilo", "Pirro", 34);
        Studente lucrezia = new Studente("Lucreiza", "Scaffidi", 96);
        Studente paolo = new Studente("Paolo", "Fabris", 9);

        bept4.addStudent(davide);
        System.out.println(bept4.getStudents());
        davide.getBankAccount().deposit(100000);
        System.out.println("il salldo del conto in banca di davide è di " + davide.getBankAccount().getBalace() + "$");
    }
}
