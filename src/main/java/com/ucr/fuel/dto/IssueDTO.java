package com.ucr.fuel.dto;

import javax.validation.constraints.NotNull;
import java.util.Date;


public class IssueDTO {

    public static class IssueRequest {
        @NotNull
        private String Description;
        @NotNull
        private String ReportNumber;
        @NotNull
        private String Registedtimestamp;
        @NotNull
        private String Address;
        @NotNull
        private String Contactphone;
        @NotNull
        private String Contactemail;
        @NotNull
        private String Status;
        @NotNull
        private int Userid;

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public String getReportNumber() {
            return ReportNumber;
        }

        public void setReportNumber(String reportNumber) {
            ReportNumber = reportNumber;
        }

        public String getRegistedtimestamp() {
            return Registedtimestamp;
        }

        public void setRegistedtimestamp(String registedtimestamp) {
            Registedtimestamp = registedtimestamp;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public String getContactphone() {
            return Contactphone;
        }

        public void setContactphone(String contactphone) {
            Contactphone = contactphone;
        }

        public String getContactemail() {
            return Contactemail;
        }

        public void setContactemail(String contactemail) {
            Contactemail = contactemail;
        }

        public String getStatus() {
            return Status;
        }

        public void setStatus(String status) {
            Status = status;
        }

        public int getUserid() {
            return Userid;
        }

        public void setUserid(int userid) {
            Userid = userid;
        }
    }

    public static class IssueResponse {
        private Integer Id;
        private String Description;
        private String ReportNumber;
        private String Registedtimestamp;
        private String Address;
        private String Contactphone;
        private String Contactemail;
        private String Status;
        private UserDTO.UserResponse user;

        public Integer getId() {
            return Id;
        }

        public void setId(Integer id) {
            Id = id;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public String getReportNumber() {
            return ReportNumber;
        }

        public void setReportNumber(String reportNumber) {
            ReportNumber = reportNumber;
        }

        public String getRegistedtimestamp() {
            return Registedtimestamp;
        }

        public void setRegistedtimestamp(String registedtimestamp) {
            Registedtimestamp = registedtimestamp;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public String getContactphone() {
            return Contactphone;
        }

        public void setContactphone(String contactphone) {
            Contactphone = contactphone;
        }

        public String getContactemail() {
            return Contactemail;
        }

        public void setContactemail(String contactemail) {
            Contactemail = contactemail;
        }

        public String getStatus() {
            return Status;
        }

        public void setStatus(String status) {
            Status = status;
        }

        public UserDTO.UserResponse getUser() {
            return user;
        }

        public void setUser(UserDTO.UserResponse user) {
            this.user = user;
        }
    }


}
