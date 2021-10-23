public class PhdStudent extends AbstractStudent{
    private String thesisTopic;

    public PhdStudent(String name, Sex sex, String dep, String thesisTopic) {
        super(name, sex, dep);
        setThesisTopic(thesisTopic);
    }

    @Override
    public String getDetailInfo() {
        return getSex().getPronounGen() + " thesis title is \"" + thesisTopic + "\".";
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        if (thesisTopic == null)
            throw new IllegalArgumentException("thesis can't be null");
        this.thesisTopic = thesisTopic;
    }
}
