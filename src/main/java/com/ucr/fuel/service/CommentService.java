package com.ucr.fuel.service;


import com.ucr.fuel.domain.business.Comment;
import com.ucr.fuel.exceptions.RecordNotFoundException;
import com.ucr.fuel.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository repository;

    public Comment save(Comment comment) {
        return repository.save(comment);
    }

    public Comment update(Comment comment) {
        find(comment.getId());
        return repository.save(comment);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Comment> findAll() {
        return repository.findAll();
    }


    public Comment find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(Comment.class, id));
    }
}









