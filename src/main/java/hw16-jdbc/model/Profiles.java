package model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Profiles implements Table {
    private Integer id;
    private String username;
    private String job_title;
    private String department;
    private String company;
    private String skill;


}


