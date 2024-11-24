public class App {
    
    public static void main(String[] args) {
        RegistroStudenti bept4 = new RegistroStudenti();
        Studente davide = new Studente("Davide", "Blaffard", 26);
        Studente danilo = new Studente("Danilo", "Pirro", 34);
        Studente lucrezia = new Studente("Lucreiza", "Scaffidi", 96);
        Studente paolo = new Studente("Paolo", "Fabris", 9);

        bept4.addStudent(davide);
        System.out.println(bept4.getStudents());
        bept4.addStudent(danilo);
        System.out.println(bept4.getStudents());
        bept4.addStudent(lucrezia);
        System.out.println(bept4.getStudents());
        bept4.addStudent(paolo);
        System.out.println(bept4.getStudents());

    }
}
