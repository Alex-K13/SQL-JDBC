package model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Accounts implements Table {
    private Integer id;
    private String first_name;
    private String last_name;
    private String city;
    private String gender;
    private String username;
}
