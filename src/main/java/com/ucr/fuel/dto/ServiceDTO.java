package com.ucr.fuel.dto;

import javax.validation.constraints.NotNull;


public class ServiceDTO {

    public static class ServiceRequest {
        @NotNull
        private String Name;
        @NotNull
        private int Userid;
        @NotNull
        private int Issueid;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getUserid() {
            return Userid;
        }

        public void setUserid(int userid) {
            Userid = userid;
        }

        public int getIssueid() {
            return Issueid;
        }

        public void setIssueid(int issueid) {
            Issueid = issueid;
        }
    }

    public static class ServiceResponse {
        private Integer Id;
        private String Name;
        private UserDTO.UserResponse user;
        private IssueDTO.IssueResponse issue;

        public Integer getId() {
            return Id;
        }

        public void setId(Integer id) {
            Id = id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public UserDTO.UserResponse getUser() {
            return user;
        }

        public void setUser(UserDTO.UserResponse user) {
            this.user = user;
        }

        public IssueDTO.IssueResponse getIssue() {
            return issue;
        }

        public void setIssue(IssueDTO.IssueResponse issue) {
            this.issue = issue;
        }
    }


}
