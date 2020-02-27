package com.ucr.fuel.service;


import com.ucr.fuel.domain.business.Issuecl;
import com.ucr.fuel.exceptions.RecordNotFoundException;
import com.ucr.fuel.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {
    @Autowired
    private IssueRepository repository;

    public Issuecl save(Issuecl issue) {
        return repository.save(issue);
    }

    public Issuecl update(Issuecl issue) {
        find(issue.getId());
        return repository.save(issue);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Issuecl> findAll() {
        return repository.findAll();
    }


    public Issuecl find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(Issuecl.class, id));
    }
}









