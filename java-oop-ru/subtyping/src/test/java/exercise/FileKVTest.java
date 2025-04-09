//package exercise;
//
//import java.util.HashMap;
//import org.junit.jupiter.api.BeforeEach;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.Path;
//import java.nio.file.StandardOpenOption;
//import com.fasterxml.jackson.databind.ObjectMapper;
//// BEGIN
//
//// END
//
//
//class FileKVTest {
//
//    private static Path filepath = Paths.get("src/test/resources/file").toAbsolutePath().normalize();
//
//    @BeforeEach
//    public void beforeEach() throws Exception {
//        ObjectMapper mapper = new ObjectMapper();
//        String content = mapper.writeValueAsString(new HashMap<String, String>());
//        Files.writeString(filepath, content, StandardOpenOption.TRUNCATE_EXISTING);
//    }
//
//    // BEGIN
//    @Test
//    void testSwapKV() {
//        KeyValueStorage storage = new FileKV(filepath, Map.of("key1", "value1", "key2", "value2"));
//
//        assertEquals("value1", storage.get("key1", "default"));
//        assertEquals("value2", storage.get("key2", "default"));
//    }
//
//    @Test
//    void testGetNonExistingKey() {
//        KeyValueStorage storage = new FileKV(filepath, Map.of("key1", "value1", "key2", "value2"));
//        assertEquals("default", storage.get("nonexistent", "default"));
//    }
//
//    @Test
//    void testSetNewKey() {
//        KeyValueStorage storage = new FileKV(filepath, Map.of("key1", "value1", "key2", "value2"));
//        storage.set("key3", "value3");
//        assertEquals("value3", storage.get("key3", "default"));
//    }
//
//    @Test
//    void testUnsetKey() {
//        KeyValueStorage storage = new FileKV(filepath, Map.of("key1", "value1", "key2", "value2св"));
//        storage.unset("key1");
//        assertEquals("default", storage.get("key1", "default"));
//    }
//
//    @Test
//    void testToMap() {
//        KeyValueStorage storage = new FileKV(filepath, Map.of("key1", "value1", "key2"));
//        Map<String, String> expected = Map.of("key1", "value1", "key2", "value2");
//        assertEquals(expected, storage.toMap());
//    }
//    // END
//}
