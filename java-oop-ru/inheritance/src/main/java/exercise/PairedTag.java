package exercise;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String bodyTag;
    private List<Tag> detailsOfTag;

    public PairedTag(String nameTag, Map<String, String> attributesOfTag, String bodyTag, List<Tag> detailsOfTag) {
        super (nameTag, attributesOfTag);
        this.bodyTag = bodyTag;
        this.detailsOfTag = new ArrayList<>(detailsOfTag);
    }

    public String toString() {
        String result = "";

        String currentResult = super.processingMap(super.getNameTag(), super.getAttributesOfTag());
        result = currentResult + bodyTag;

        for (var detail : detailsOfTag) {
            result = result + detail.processingMap(detail.getNameTag(), detail.getAttributesOfTag());
        }

        result = result + "</" + super.getNameTag() + ">";

        return result;
    }
}
// END
