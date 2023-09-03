package controller;

import dto.UserDto;
import entity.UserEntity;
import service.UserService;

public class UserController {
UserService service=new UserService();
    public String saveUser(UserDto dto) {
     return service.saveUser(dto);
    }
}
