package com.ucr.fuel.domain.business;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Issuecl")
public class Issuecl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "Description")
    @NotNull
    private String Descriptionme;

    @Column(name = "Reportnumber")
    @NotNull
    @Size(max = 100)
    private String ReportNumber;

    @Column(name = "Registedtimestamp")
    @NotNull
    @Size(max = 100)
    private String Registedtimestamp;

    @Column(name = "Address")
    @NotNull
    @Size(max = 100)
    private String Address;

    @Column(name = "Contactphone")
    @NotNull
    @Size(max = 100)
    private String Contactphone;

    @Column(name = "Contactemail")
    @Email
    @NotNull
    private String Contactemail;

    @Column(name = "Status")
    @NotNull
    @Size(max = 100)
    private String Status;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Userid", nullable = false)
    private Usercl usercl;

    public Usercl getUsercl() {
        return usercl;
    }

    public void setUsercl(Usercl usercl) {
        this.usercl = usercl;
    }



    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDescriptionme() {
        return Descriptionme;
    }

    public void setDescriptionme(String descriptionme) {
        Descriptionme = descriptionme;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Issuecl)) return false;
        Issuecl issuecl = (Issuecl) o;
        return getReportNumber() == issuecl.getReportNumber() &&
                getId().equals(issuecl.getId()) &&
                getDescriptionme().equals(issuecl.getDescriptionme()) &&
                getRegistedtimestamp().equals(issuecl.getRegistedtimestamp()) &&
                getAddress().equals(issuecl.getAddress()) &&
                getContactphone().equals(issuecl.getContactphone()) &&
                getContactemail().equals(issuecl.getContactemail()) &&
                getStatus().equals(issuecl.getStatus()) &&
                getUsercl().equals(issuecl.getUsercl());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescriptionme(), getReportNumber(), getRegistedtimestamp(), getAddress(), getContactphone(), getContactemail(), getStatus(), getUsercl());
    }

    @Override
    public String toString() {
        return "Issuecl{" +
                "Id=" + Id +
                ", Descriptionme='" + Descriptionme + '\'' +
                ", ReportNumber=" + ReportNumber +
                ", Registedtimestamp=" + Registedtimestamp +
                ", Address='" + Address + '\'' +
                ", Contactphone='" + Contactphone + '\'' +
                ", Contactemail='" + Contactemail + '\'' +
                ", Status='" + Status + '\'' +
                ", usercl=" + usercl +
                '}';
    }
}