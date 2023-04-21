package com.icia.ex1.dto;

import lombok.*;

@Getter // 모든 getter 생성
@Setter // 모든 setter 생성
@ToString // tostring 생성
@NoArgsConstructor // 기본 생성자 생성
@AllArgsConstructor // 모든 매개변수를 가진 생성자 생성
public class StudentDTO {
    private Long id;
    private String studentName;
    private String studentNumber;

}
