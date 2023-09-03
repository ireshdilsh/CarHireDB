package service;

import dao.UserRepository;
import dto.UserDto;
import entity.UserEntity;
import org.hibernate.Transaction;

public class UserService {
    UserRepository  repository= new UserRepository();
    public String saveUser(UserDto dto) {
        UserEntity entity=new UserEntity(dto.getId(),dto.getName(),dto.getEmail(),dto.getMobileno(),dto.getUsername(),dto.getPassword());
        if (entity!=null){return "Success";}else {return "Fail";}
    }
}
