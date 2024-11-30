package com.Student.studentRegisteration.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@Component
public class Image {
    private String id;
    private MultipartFile image;
    private String reportId;
}
