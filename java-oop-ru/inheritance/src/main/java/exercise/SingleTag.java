package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {

    public SingleTag(String nameTag, Map<String, String> attributesOfTag) {
        super (nameTag, attributesOfTag);
    }

    public String toString() {
        return super.processingMap(super.getNameTag(), super.getAttributesOfTag());
    }
}
// END
