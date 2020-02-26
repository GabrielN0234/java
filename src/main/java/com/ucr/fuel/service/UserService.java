package com.ucr.fuel.service;


import com.ucr.fuel.domain.business.Usercl;
import com.ucr.fuel.exceptions.RecordNotFoundException;
import com.ucr.fuel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public Usercl save(Usercl usercl) {
        return repository.save(usercl);
    }

    public Usercl update(Usercl usercl) {
        find(usercl.getId());
        return repository.save(usercl);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Usercl> findAll() {
        return repository.findAll();
    }


    public Usercl login(String email, String pass) {
        List<Usercl> users = findAll();
        for (int i = 0; i<users.size(); i++){
            if(users.get(i).getEmail().equals(email)  && users.get(i).getPassword().equals(pass) ){
                return find(users.get(i).getId());
            }
        }
       return null;
    }


    public Usercl find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(Usercl.class, id));
    }
}









