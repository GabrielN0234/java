package com.ucr.fuel.converter;

import com.ucr.fuel.domain.business.Servicecl;
import com.ucr.fuel.dto.ServiceDTO;
import com.ucr.fuel.service.IssueService;
import com.ucr.fuel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRestConverter implements RestConverter<Servicecl,
        ServiceDTO.ServiceResponse,
        ServiceDTO.ServiceRequest> {
    @Autowired
    private UserService userService;
    @Autowired
    private IssueService issueService;
    @Autowired
    private UserRestConverter userConverter;
    @Autowired
    private IssueRestConverter issueConverter;

    @Override
    public ServiceDTO.ServiceResponse toResponse(Servicecl entity) {
        ServiceDTO.ServiceResponse response = new ServiceDTO.ServiceResponse();
        response.setId(entity.getId());
        response.setName(entity.getName());
        response.setUser(userConverter.toResponse(entity.getUser()));
        response.setIssue(issueConverter.toResponse(entity.getIssue()));
        return response;
    }

    @Override
    public Servicecl fromRequest(ServiceDTO.ServiceRequest request) {
        Servicecl entity = new Servicecl();
        entity.setName(request.getName());
        entity.setUser(userService.find(request.getUserid()));
        entity.setIssue(issueService.find(request.getIssueid()));
        return entity;
    }
}
