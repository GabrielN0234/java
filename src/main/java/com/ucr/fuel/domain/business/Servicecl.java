package com.ucr.fuel.domain.business;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "Servicecl")
public class Servicecl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "Name")
    @NotNull
    private String Name;

    @OneToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "Userid", nullable = false)
    private Usercl user;

    @OneToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "Issueid", nullable = false)
    private Issuecl issue;

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

    public Usercl getUser() {
        return user;
    }

    public void setUser(Usercl user) {
        this.user = user;
    }

    public Issuecl getIssue() {
        return issue;
    }

    public void setIssue(Issuecl issue) {
        this.issue = issue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Servicecl)) return false;
        Servicecl service = (Servicecl) o;
        return getId().equals(service.getId()) &&
                getName().equals(service.getName()) &&
                getUser().equals(service.getUser()) &&
                getIssue().equals(service.getIssue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getUser(), getIssue());
    }

    @Override
    public String toString() {
        return "Service{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", user=" + user +
                ", issue=" + issue +
                '}';
    }
}