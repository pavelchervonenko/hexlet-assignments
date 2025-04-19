package exercise;

import java.util.stream.Collectors;
import java.util.Map;
import java.util.LinkedHashMap;

// BEGIN
public class Tag {
    private String nameTag;
    private Map<String, String> attributesOfTag;

    public Tag(String nameTag, Map<String, String> attriburesOfTag) {
        this.nameTag = nameTag;
        this.attributesOfTag = new LinkedHashMap<>(attriburesOfTag);
    }

    public String getNameTag() {
        return nameTag;
    }

    public Map<String, String> getAttributesOfTag() {
        return attributesOfTag;
    }

    public String processingMap(String nameTag, Map<String, String> map) {
        var entries = map.entrySet();

        String current = "";
        String result = "";

        for (var entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            current = current + " " + key + "=\"" + value + "\"";
        }

        result = "<" + nameTag + current + ">";

        return result;
    }
}
// END
