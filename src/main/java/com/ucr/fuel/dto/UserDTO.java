package com.ucr.fuel.dto;

import javax.validation.constraints.NotNull;


public class UserDTO {

    public static class UserRequest {
        @NotNull
        private String Name;
        @NotNull
        private String Password;
        @NotNull
        private String Firstsurname;
        @NotNull
        private String Secondsurname;
        @NotNull
        private String Address;
        @NotNull
        private String phone;
        @NotNull
        private String Secondcontact;
        @NotNull
        private String Email;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getPassword() {
            return Password;
        }

        public void setPassword(String password) {
            Password = password;
        }

        public String getFirstsurname() {
            return Firstsurname;
        }

        public void setFirstsurname(String firstsurname) {
            Firstsurname = firstsurname;
        }

        public String getSecondsurname() {
            return Secondsurname;
        }

        public void setSecondsurname(String secondsurname) {
            Secondsurname = secondsurname;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getSecondcontact() {
            return Secondcontact;
        }

        public void setSecondcontact(String secondcontact) {
            Secondcontact = secondcontact;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }
    }

    public static class UserResponse {
        private Integer id;



        private String Name;
        private String Password;
        private String Firstsurname;
        private String Secondsurname;
        private String Address;
        private String phone;
        private String Secondcontact;
        private String Email;


        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getPassword() {
            return Password;
        }

        public void setPassword(String password) {
            Password = password;
        }

        public String getFirstsurname() {
            return Firstsurname;
        }

        public void setFirstsurname(String firstsurname) {
            Firstsurname = firstsurname;
        }

        public String getSecondsurname() {
            return Secondsurname;
        }

        public void setSecondsurname(String secondsurname) {
            Secondsurname = secondsurname;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getSecondcontact() {
            return Secondcontact;
        }

        public void setSecondcontact(String secondcontact) {
            Secondcontact = secondcontact;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }
    }


}
