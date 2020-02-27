package com.ucr.fuel.converter;

import com.ucr.fuel.domain.business.Comment;
import com.ucr.fuel.dto.CommentDTO;
import com.ucr.fuel.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentRestConverter implements RestConverter<Comment,
        CommentDTO.CommentResponse,
        CommentDTO.CommentRequest> {
    @Autowired
    private IssueService issueService;
    @Autowired
    private IssueRestConverter issueConverter;

    @Override
    public CommentDTO.CommentResponse toResponse(Comment entity) {
        CommentDTO.CommentResponse response = new CommentDTO.CommentResponse();
        response.setId(entity.getId());
        response.setDescription(entity.getDescriptionme());
        response.setTimestamp(entity.getTimestamp());
        response.setIssue(issueConverter.toResponse(entity.getIssuecl()));
        return response;

    }

    @Override
    public Comment fromRequest(CommentDTO.CommentRequest request) {
        Comment entity = new Comment();
        entity.setDescriptionme(request.getDescription());
        entity.setTimestamp(request.getTimestamp());
        entity.setIssuecl(issueService.find(request.getIssueid()));
        return entity;
    }
}
