package com.Student.studentRegisteration.Entity.Requests;

import com.Student.studentRegisteration.Entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserReq extends User {
    private String pwd;
}
