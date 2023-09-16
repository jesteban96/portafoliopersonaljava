package com.portafolio.personal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {

    private int id;
    private String skill;
    private String level;
    private String tools;
    private String experience;
}
