package com.ucr.fuel.converter;

import com.ucr.fuel.domain.business.Issuecl;
import com.ucr.fuel.dto.IssueDTO;
import com.ucr.fuel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueRestConverter implements RestConverter<Issuecl,
        IssueDTO.IssueResponse,
        IssueDTO.IssueRequest> {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRestConverter userConverter;

    @Override
    public IssueDTO.IssueResponse toResponse(Issuecl entity) {
        IssueDTO.IssueResponse response = new IssueDTO.IssueResponse();
        response.setId(entity.getId());
        response.setDescription(entity.getDescriptionme());
        response.setReportNumber(entity.getReportNumber());
        response.setRegistedtimestamp(entity.getRegistedtimestamp());
        response.setAddress(entity.getAddress());
        response.setContactphone(entity.getContactphone());
        response.setContactemail(entity.getContactemail());
        response.setStatus(entity.getStatus());
        response.setUser(userConverter.toResponse(entity.getUsercl()));
        return response;
    }

    @Override
    public Issuecl fromRequest(IssueDTO.IssueRequest request) {
        Issuecl entity = new Issuecl();
        entity.setDescriptionme(request.getDescription());
        entity.setReportNumber(request.getReportNumber());
        entity.setRegistedtimestamp(request.getRegistedtimestamp());
        entity.setAddress(request.getAddress());
        entity.setContactphone(request.getContactphone());
        entity.setContactemail(request.getContactemail());
        entity.setStatus(request.getStatus());
        entity.setUsercl(userService.find(request.getUserid()));
        return entity;
    }
}
