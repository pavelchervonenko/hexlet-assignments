package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    public static List<String> validate(Object obj) {
        List<String> notValidFields = new ArrayList<>();

        var fields = obj.getClass().getDeclaredFields();

        for (var field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                try {
                    field.setAccessible(true);

                    Object value = field.get(obj);

                    if (value == null) {
                        notValidFields.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Fail");
                }
            }
         }
         return notValidFields;
    }
}
// END
