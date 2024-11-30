package com.Student.studentRegisteration.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter @Setter
@Component
public class User {

    private String id;

    private String name ;

    private String email;

    private String phoneNo;

}
