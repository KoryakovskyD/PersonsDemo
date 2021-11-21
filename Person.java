public abstract class Person {
    private String name;
    private Sex sex;
    private String dep;
    private String verb;

    public Person(String name, Sex sex, String dep, String verb) {
        this.name = name;
        this.sex = sex;
        this.dep = dep;
        if (verb == null)
            throw new IllegalArgumentException("verb can't be null");
        this.verb = verb;
    }

    public String getName() {
        return name;
    }

    public String getDep() {
        return dep;
    }

    public Sex getSex() {
        return sex;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("name can't be null.");
        this.name = name;
    }

    public void setSex(Sex sex) {
        if (sex == null)
            throw new IllegalArgumentException("sex can't be null.");
        this.sex = sex;
    }

    public void setDep(String dep) {
        if (dep == null)
            throw new IllegalArgumentException("dep can't be null.");
        this.dep = dep;
    }

    public void print() {
        System.out.println("This is " + name + ". " + sex.getPronoun() + " " + verb + " at " + dep + ".");
        System.out.println(getDetailInfo());
    }

    public abstract String getDetailInfo();

    public static void printAll(Person[] persons) {
        for (Person p : persons) {
            p.print();
            System.out.println();
        }
    }

    public static void printAll(Iterable<? extends Person> persons) {
        for (Person p : persons) {
            p.print();
            System.out.println();
        }
    }
}
