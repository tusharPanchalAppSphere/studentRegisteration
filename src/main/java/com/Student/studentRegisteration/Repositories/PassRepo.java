package com.Student.studentRegisteration.Repositories;

import com.Student.studentRegisteration.Entity.Password;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassRepo extends JpaRepository<Password,String> {
}
