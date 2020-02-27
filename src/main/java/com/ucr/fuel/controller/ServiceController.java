package com.ucr.fuel.controller;


import com.ucr.fuel.converter.ServiceRestConverter;
import com.ucr.fuel.domain.business.Servicecl;
import com.ucr.fuel.dto.ServiceDTO;
import com.ucr.fuel.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/serivices")
@CrossOrigin
public class ServiceController {

    @Autowired
    private ServiceService service;

    @Autowired
    private ServiceRestConverter converter;

    @RequestMapping(path = "/{Id}", method = RequestMethod.GET)
    public ServiceDTO.ServiceResponse findById(
            @PathVariable("Id") Integer id) {
        return converter.toResponse(service.find(id));
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public ServiceDTO.ServiceResponse save(@RequestBody ServiceDTO.ServiceRequest servic) {
        return converter.toResponse(service.save(converter.fromRequest(servic)));
    }

    @RequestMapping(path = "/{Id}", method = RequestMethod.PUT)
    public ServiceDTO.ServiceResponse update(@PathVariable("Id") Integer id,
                                             @RequestBody ServiceDTO.ServiceRequest servic) {
        Servicecl toUpdate = converter.fromRequest(servic);
        toUpdate.setId(id);
        return converter.toResponse(service.update(toUpdate));
    }

    @RequestMapping(path = "/{Id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("Id") Integer id) {
        service.delete(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<ServiceDTO.ServiceResponse> findAll() {
        return service.findAll().stream().map(it -> converter.toResponse(it))
                .collect(Collectors.toList());
    }


}
