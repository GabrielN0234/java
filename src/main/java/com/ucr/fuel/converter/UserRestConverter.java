package com.ucr.fuel.converter;

import com.ucr.fuel.domain.business.Usercl;
import com.ucr.fuel.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserRestConverter implements RestConverter<Usercl, UserDTO.UserResponse, UserDTO.UserRequest> {

    @Override
    public UserDTO.UserResponse toResponse(Usercl usercl) {
        UserDTO.UserResponse dto = new UserDTO.UserResponse();
        dto.setId(usercl.getId());
        dto.setName(usercl.getName());
        dto.setPassword(usercl.getPassword());
        dto.setFirstsurname(usercl.getFirstsurname());
        dto.setSecondsurname(usercl.getSecondsurname());
        dto.setAddress(usercl.getAddress());
        dto.setPhone(usercl.getPhone());
        dto.setSecondcontact(usercl.getSecondcontact());
        dto.setEmail(usercl.getEmail());
        return dto;
    }

    @Override
    public Usercl fromRequest(UserDTO.UserRequest dto) {
        Usercl entity = new Usercl();
        entity.setName(dto.getName());
        entity.setPassword(dto.getPassword());
        entity.setFirstsurname(dto.getFirstsurname());
        entity.setSecondsurname(dto.getSecondsurname());
        entity.setAddress(dto.getAddress());
        entity.setPhone(dto.getPhone());
        entity.setSecondcontact(dto.getSecondcontact());
        entity.setEmail(dto.getEmail());
        return entity;
    }
}
