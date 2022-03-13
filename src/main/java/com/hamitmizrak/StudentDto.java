package com.hamitmizrak;

//Data Transfer Object =DTO

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {

    private Long studentId;
    private String studentName;
    private String studentSurname;
}
