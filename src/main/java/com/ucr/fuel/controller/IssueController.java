package com.ucr.fuel.controller;


import com.ucr.fuel.converter.IssueRestConverter;
import com.ucr.fuel.converter.RouteRestConverter;
import com.ucr.fuel.domain.business.Issuecl;
import com.ucr.fuel.domain.business.Route;
import com.ucr.fuel.dto.IssueDTO;
import com.ucr.fuel.dto.RouteDTO;
import com.ucr.fuel.service.IssueService;
import com.ucr.fuel.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/issues")
@CrossOrigin
public class IssueController {

    @Autowired
    private IssueService service;

    @Autowired
    private IssueRestConverter converter;

    @RequestMapping(path = "/{Id}", method = RequestMethod.GET)
    public IssueDTO.IssueResponse findById(
            @PathVariable("Id") Integer id) {
        return converter.toResponse(service.find(id));
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public IssueDTO.IssueResponse save(@RequestBody IssueDTO.IssueRequest issue) {
        return converter.toResponse(service.save(converter.fromRequest(issue)));
    }

    @RequestMapping(path = "/{Id}", method = RequestMethod.PUT)
    public IssueDTO.IssueResponse update(@PathVariable("Id") Integer id,
                                    @RequestBody IssueDTO.IssueRequest issue) {
        Issuecl toUpdate = converter.fromRequest(issue);
        toUpdate.setId(id);
        return converter.toResponse(service.update(toUpdate));
    }

    @RequestMapping(path = "/{Id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("Id") Integer id) {
        service.delete(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<IssueDTO.IssueResponse> findAll() {
        return service.findAll().stream().map(it -> converter.toResponse(it))
                .collect(Collectors.toList());
    }


}
