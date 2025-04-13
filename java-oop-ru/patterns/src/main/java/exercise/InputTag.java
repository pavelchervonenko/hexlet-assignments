package exercise;

// BEGIN
public class InputTag implements TagInterface {
    private String type;
    private String value;

    public InputTag (String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String render() {
        String result = "<input type=\"" + type + "\" value=\"" + value + "\">";
        return result;
    }
}
// END
