public class Teacher extends Person{
    private Degree degree;
    private String spec;

    public Teacher(String name, Sex sex, String dep, Degree degree, String spec) {
        super(name, sex, dep, "teacher");
        setDegree(degree);
        setSpec(spec);
    }

    public Degree getDegree() {
        return degree;
    }

    public String getSpec() {
        return spec;
    }

    public void setDegree(Degree degree) {
        if (degree == null)
            throw new IllegalArgumentException("degree can't be null");
        this.degree = degree;
    }

    public void setSpec(String spec) {
        if (spec == null)
            throw new IllegalArgumentException("spec can't be null");
        this.spec = spec;
    }

    @Override
    public String getDetailInfo() {
        return getSex().getPronoun() + " has " + degree + " in " + spec + ".";
    }
}
