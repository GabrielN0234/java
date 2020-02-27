package com.ucr.fuel.service;


import com.ucr.fuel.domain.business.Servicecl;
import com.ucr.fuel.exceptions.RecordNotFoundException;
import com.ucr.fuel.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {
    @Autowired
    private ServiceRepository repository;

    public Servicecl save(Servicecl service) {
        return repository.save(service);
    }

    public Servicecl update(Servicecl service) {
        find(service.getId());
        return repository.save(service);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Servicecl> findAll() {
        return repository.findAll();
    }


    public Servicecl find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(Servicecl.class, id));
    }
}









