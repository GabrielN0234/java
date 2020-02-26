package com.ucr.fuel.controller;


import com.ucr.fuel.converter.UserRestConverter;
import com.ucr.fuel.domain.business.Usercl;
import com.ucr.fuel.dto.UserDTO;
import com.ucr.fuel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private UserRestConverter converter;

    @RequestMapping(path = "/{Id}", method = RequestMethod.GET)
    public UserDTO.UserResponse findById(
            @PathVariable("Id") Integer id) {
        return converter.toResponse(service.find(id));
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public UserDTO.UserResponse save(@RequestBody UserDTO.UserRequest user) {

        return converter.toResponse(service.save(converter.fromRequest(user)));
    }

    @RequestMapping(path = "/{Id}", method = RequestMethod.PUT)
    public UserDTO.UserResponse update(@PathVariable("Id") Integer id,
                                       @RequestBody UserDTO.UserRequest user) {
        Usercl toUpdate = converter.fromRequest(user);
        toUpdate.setId(id);
        return converter.toResponse(service.update(toUpdate));
    }

    @RequestMapping(path = "/{Id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("Id") Integer id) {
        service.delete(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<UserDTO.UserResponse> findAll() {
        return service.findAll().stream().map(it -> converter.toResponse(it))
                .collect(Collectors.toList());
    }



}
