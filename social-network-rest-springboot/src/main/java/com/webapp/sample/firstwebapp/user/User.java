package com.webapp.sample.firstwebapp.user;


import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private int id;
    private String name;
    private LocalDate birthdate;

}
