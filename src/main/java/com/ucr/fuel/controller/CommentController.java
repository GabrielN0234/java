package com.ucr.fuel.controller;


import com.ucr.fuel.converter.CommentRestConverter;
import com.ucr.fuel.domain.business.Comment;
import com.ucr.fuel.dto.CommentDTO;
import com.ucr.fuel.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/comments")
@CrossOrigin
public class CommentController {

    @Autowired
    private CommentService service;

    @Autowired
    private CommentRestConverter converter;

    @RequestMapping(path = "/{Id}", method = RequestMethod.GET)
    public CommentDTO.CommentResponse findById(
            @PathVariable("Id") Integer id) {
        return converter.toResponse(service.find(id));
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public CommentDTO.CommentResponse save(@RequestBody CommentDTO.CommentRequest comment) {
        return converter.toResponse(service.save(converter.fromRequest(comment)));
    }

    @RequestMapping(path = "/{Id}", method = RequestMethod.PUT)
    public CommentDTO.CommentResponse update(@PathVariable("Id") Integer id,
                                             @RequestBody CommentDTO.CommentRequest comment) {
        Comment toUpdate = converter.fromRequest(comment);
        toUpdate.setId(id);
        return converter.toResponse(service.update(toUpdate));
    }

    @RequestMapping(path = "/{Id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("Id") Integer id) {
        service.delete(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<CommentDTO.CommentResponse> findAll() {
        return service.findAll().stream().map(it -> converter.toResponse(it))
                .collect(Collectors.toList());
    }


}
