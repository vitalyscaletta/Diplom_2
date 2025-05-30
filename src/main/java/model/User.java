package model;

import lombok.Data;

@Data
public class User {
    private String name;
    private String email;
    private String password;
    private String accessToken;
}
