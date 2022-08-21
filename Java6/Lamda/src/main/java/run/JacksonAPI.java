package run;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import entity.Contact;
import entity.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JacksonAPI {
    public static void main(String[] args) throws IOException {
        demo6();
    }

    private static void demo1() throws IOException {
        String json = "C:\\Users\\ADMIN\\Desktop\\Java6\\Lamda\\src\\main\\resources\\json\\user.json";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(new File(json));

        jsonNode.iterator().forEachRemaining(student -> {
            System.out.println("Name: " + student.get("name").asText());
            System.out.println("Marks: " + student.get("marks").asText());
            System.out.println("Gender: " + student.get("gender").asText());
            System.out.println("Email: " + student.get("contact").get("email").asText());
            System.out.println("Phone: " + student.get("contact").get("phone").asText());
            student.get("subjects").iterator().forEachRemaining(subject -> {
                System.out.println("Subject: " + subject);
            });
        });
    }

    private static void demo2() throws IOException {
        String json = "C:\\Users\\ADMIN\\Desktop\\Java6\\Lamda\\src\\main\\resources\\json\\user.json";

        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> listUsers = mapper.readValue(new File(json), List.class);

        listUsers.forEach(student -> {
            System.out.println("Name: " + student.get("name"));
        });

    }

    private static void demo3() throws IOException {
        String json = "C:\\Users\\ADMIN\\Desktop\\Java6\\Lamda\\src\\main\\resources\\json\\user.json";

        TypeReference<List<Student>> type = new TypeReference<List<Student>>() {
        };
        ObjectMapper mapper = new ObjectMapper();
        List<Student> listStudents = (List<Student>) mapper.readValue(new File(json), type);

        listStudents.forEach(student -> {
            System.out.println("Name: " + student.getName());
        });

    }

    private static void demo4() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode studentNode = mapper.createObjectNode();

        studentNode.put("name", "Nguyen Minh Phuong");
        studentNode.put("marks", 10);
        studentNode.put("gender", 0);

        ObjectNode contactNode = studentNode.putObject("contact");
        contactNode.put("email", "phuongnm@gmail.com");
        contactNode.put("phone", "123");

        ArrayNode subjectArray = studentNode.putArray("subjects");
        subjectArray.add("VIE1012");
        subjectArray.add("VIE1013");


        String json = mapper.writeValueAsString(studentNode);  //Chuyển đổi thành kiểu String
        mapper.writeValue(System.out, studentNode); //In xuống màn hình console
        mapper.writeValue(new File("C:\\Users\\ADMIN\\Desktop\\Java6\\Lamda\\src\\main\\resources\\json\\user.json"), studentNode);
    }

    private static void demo5() throws IOException {
        Map<String, Object> contact = new HashMap<>();
        contact.put("email", "phuong@gmail.com");
        contact.put("phone", "123");

        List<String> subject = Arrays.asList("Subject1", "Subject2");

        Map<String, Object> student = new HashMap<>();
        student.put("name", "Name1");
        student.put("marks", 1);
        student.put("gender", 1);
        student.put("contact", contact);
        student.put("subject", subject);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("C:\\Users\\ADMIN\\Desktop\\Java6\\Lamda\\src\\main\\resources\\json\\user.json"), student);

    }

    private static void demo6() throws IOException {
        Contact contact = new Contact("email@game.com", "122", null);
        List<String> subject = Arrays.asList("Subject1", "Subject2");
        Student student = new Student("Phuong", 1, 1.1, contact, subject);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(System.out, student);
        mapper.writeValue(new File("C:\\Users\\ADMIN\\Desktop\\Java6\\Lamda\\src\\main\\resources\\json\\user.json"), student);

    }
}
