package task1;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.List;


@Builder @ToString
@Getter
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;

    @Singular(value = "job")
    private List<String> occupations;
}