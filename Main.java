public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                //Leo Wilkinson M Computer science Bachelor III
                //Anna Cunningham F World economy Bachelor I
                //Jill Lundqvist F Jurisprudence Master I
                //Ronald Correa M Computer science Design of a functional programming language.
            new Teacher("Ronald Turner", Sex.MALE,"Computer science",Degree.PHD, "Programming paradigms"),
            new Teacher("Ruth Hollings", Sex.FEMALE, "Jurisprudence", Degree.DOCTOR, "Domestic arbitration"),
            new RegularStudent("Leo Wilkinson", Sex.MALE, "Computer science", 3, Stage.BACHELOR),
                new RegularStudent("Jill Lundqvist", Sex.FEMALE, "World economy", 1, Stage.BACHELOR),
                new RegularStudent("Anna", Sex.FEMALE, "Computer science", 1, Stage.MASTER),
                new PhdStudent("Ronald Correa", Sex.MALE, "Computer science", "Design of a functional programming language")
        };
        Person.printAll(persons);
    }
}
