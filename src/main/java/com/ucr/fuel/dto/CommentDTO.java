package com.ucr.fuel.dto;

import javax.validation.constraints.NotNull;


public class CommentDTO {

    public static class CommentRequest {
        @NotNull
        private String Description;
        @NotNull
        private String Timestamp;
        @NotNull
        private int Issueid;

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public String getTimestamp() {
            return Timestamp;
        }

        public void setTimestamp(String timestamp) {
            Timestamp = timestamp;
        }

        public int getIssueid() {
            return Issueid;
        }

        public void setIssueid(int issueid) {
            Issueid = issueid;
        }
    }

    public static class CommentResponse {
        private Integer id;
        private String Description;
        private String Timestamp;
        private IssueDTO.IssueResponse issue;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public String getTimestamp() {
            return Timestamp;
        }

        public void setTimestamp(String timestamp) {
            Timestamp = timestamp;
        }

        public IssueDTO.IssueResponse getIssue() {
            return issue;
        }

        public void setIssue(IssueDTO.IssueResponse issue) {
            this.issue = issue;
        }
    }


}
