package com.Student.studentRegisteration.Repositories;

import com.Student.studentRegisteration.Entity.Requests.UserReq;
import com.Student.studentRegisteration.Entity.User;
import com.Student.studentRegisteration.Exception.UserAlreadyExistsException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  {

    public String singUp(UserReq user) throws UserAlreadyExistsException;
}
