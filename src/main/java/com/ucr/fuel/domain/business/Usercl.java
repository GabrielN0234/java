package com.ucr.fuel.domain.business;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "usercl")
public class Usercl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "Name")
    @NotNull
    private String Name;

    @Column(name = "Password")
    @NotNull
    @Size(max = 100)
    private String Password;

    @Column(name = "Firstsurname")
    @NotNull
    @Size(max = 100)
    private String Firstsurname;

    @Column(name = "Secondsurname")
    @NotNull
    @Size(max = 100)
    private String Secondsurname;

    @Column(name = "Address")
    @NotNull
    @Size(max = 100)
    private String Address;

    @Column(name = "phone")
    @Size(max = 100)
    private String phone;

    @Column(name = "Secondcontact")
    @NotNull
    @Size(max = 100)
    private String Secondcontact;

    @Column(name = "Email")
    @Email
    @NotNull
    private String Email;

    @OneToMany(mappedBy = "usercl", fetch = FetchType.LAZY)
    private List<Issuecl> issues;

    public List<Issuecl> getIssues() {
        return issues;
    }

    public void setIssues(List<Issuecl> issues) {
        this.issues = issues;
    }



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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usercl)) return false;
        Usercl usercl = (Usercl) o;
        return getId().equals(usercl.getId()) &&
                getName().equals(usercl.getName()) &&
                getPassword().equals(usercl.getPassword()) &&
                getFirstsurname().equals(usercl.getFirstsurname()) &&
                getSecondsurname().equals(usercl.getSecondsurname()) &&
                getAddress().equals(usercl.getAddress()) &&
                getPhone().equals(usercl.getPhone()) &&
                getSecondcontact().equals(usercl.getSecondcontact()) &&
                getEmail().equals(usercl.getEmail()) &&
                getIssues().equals(usercl.getIssues());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPassword(), getFirstsurname(), getSecondsurname(), getAddress(), getPhone(), getSecondcontact(), getEmail(), getIssues());
    }

    @Override
    public String toString() {
        return "Usercl{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Password='" + Password + '\'' +
                ", Firstsurname='" + Firstsurname + '\'' +
                ", Secondsurname='" + Secondsurname + '\'' +
                ", Address='" + Address + '\'' +
                ", phone='" + phone + '\'' +
                ", Secondcontact='" + Secondcontact + '\'' +
                ", Email='" + Email + '\'' +
                ", issues=" + issues +
                '}';
    }
}