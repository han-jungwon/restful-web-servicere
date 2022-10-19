package com.example.restfulwebservice.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
//@JsonIgnoreProperties(value = {"password", "ssn"})
@NoArgsConstructor
//@JsonFilter("UserInfo")
//@ApiModel(description = "사용자 상세 정보를 위한 도메인 객체")
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(min=2, message = "Name은 2글자 이상 입력해 주세요.")
  //  @ApiModelProperty(notes = "사용자 이름을 입력해 주세요.")
    private String name;
    @Past
   // @ApiModelProperty(notes = "사용자 회원가입일 입력해 주세요.")
    private Date joinDate;

   // @ApiModelProperty(notes = "사용자 비밀번호 입력해 주세요.")
    private String password;
   // @ApiModelProperty(notes = "사용자 주민등록번호 입력해 주세요.")
    private String ssn;



}
