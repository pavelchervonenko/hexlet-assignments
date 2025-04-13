package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String label;
    private TagInterface input;

    public LabelTag(String label, TagInterface input) {
        this.label = label;
        this.input = input;
    }

    @Override
    public String render() {
        String result = "<label>" + label + input.render() + "</label>";
        return result;
    }
}
// END
