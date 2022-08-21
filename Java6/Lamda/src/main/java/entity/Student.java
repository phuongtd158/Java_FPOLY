package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private Integer gender;
    private Double marks;
    private Contact contact;
    List<String> subjects;
}
