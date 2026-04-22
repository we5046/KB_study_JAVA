package ch12.sec03.exam05;

import lombok.Data;
import lombok.NonNull;

@Data
public class Member {
    private String id;
    @NonNull    // Null이 되면 안된다 -> java의 anotation | 필수항목
    private String name;
    private int age;
}