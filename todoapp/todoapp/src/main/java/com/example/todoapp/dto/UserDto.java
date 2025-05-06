package com.example.todoapp.dto;

import com.example.todoapp.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private  String userName;

    private String password;

    @JsonIgnore
    private List<CategoryDto> category;

    public static User toEntity(UserDto userDto){
        final User user = new User();

        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(user.getLastName());
        user.setEmail(user.getEmail());
        user.setUserName(user.getUserName());
    }
}
