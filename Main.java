import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Person[] persons = {
            new Teacher("Ronald Turner", Sex.MALE,"Computer science",Degree.PHD, "Programming paradigms"),
            new Teacher("Ruth Hollings", Sex.FEMALE, "Jurisprudence", Degree.DOCTOR, "Domestic arbitration"),
            new RegularStudent("Leo Wilkinson", Sex.MALE, "Computer science", 3, Stage.BACHELOR),
                new RegularStudent("Jill Lundqvist", Sex.FEMALE, "World economy", 1, Stage.BACHELOR),
                new RegularStudent("Anna", Sex.FEMALE, "Computer science", 1, Stage.MASTER),
                new PhdStudent("Ronald Correa", Sex.MALE, "Computer science", "Design of a functional programming language")
        };


        List<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ruth Hollings", Sex.FEMALE, "Jurisprudence", Degree.DOCTOR, "Domestic arbitration"));
        persons.add( new RegularStudent("Jill Lundqvist", Sex.FEMALE, "World economy", 1, Stage.BACHELOR));

        Person.printAll(persons);

        RegularStudent[] studs = new RegularStudent[]{
                new RegularStudent("Anna", Sex.FEMALE, "Computer science", 1, Stage.MASTER),
                new RegularStudent("Anna", Sex.FEMALE, "Computer science", 1, Stage.MASTER),
        };

        Person.printAll(studs);
        System.out.println("+++++++++++++++++++++++");

         */
        /*  Если коллекция является производителем(потребителем) чего то, то эту коллекцию мы можем параметризовать или обобщить
                            тоесть extends или super
        PECS:
        Producer
        Extends
        Consumer
        Super
         */

        List<RegularStudent> studs2 = new ArrayList<>();
        studs2.add(new RegularStudent("Anna", Sex.FEMALE, "Computer science", 1, Stage.MASTER));
        studs2.add(new RegularStudent("Anna", Sex.FEMALE, "Computer science", 1, Stage.MASTER));

        Person.printAll(studs2);

        System.out.println("---------------------------------------------------");
        studs2.clear();
        RegularStudent.loadStudents(studs2);
        Person.printAll(studs2);

        System.out.println("---------------------------------------------------");

        List<Person> persons = new ArrayList<>();
        RegularStudent.loadStudents(persons);
        Person.printAll(persons);

    }
}
