package com.ucr.fuel.domain.business;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "Comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "Description")
    @NotNull
    private String Descriptionme;


    @Column(name = "Timestamp")
    @NotNull
    private String Timestamp;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Issueid", nullable = false)
    private Issuecl issuecl;

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

    public String getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(String timestamp) {
        Timestamp = timestamp;
    }

    public Issuecl getIssuecl() {
        return issuecl;
    }

    public void setIssuecl(Issuecl issuecl) {
        this.issuecl = issuecl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;
        Comment comment = (Comment) o;
        return getId().equals(comment.getId()) &&
                getDescriptionme().equals(comment.getDescriptionme()) &&
                getTimestamp().equals(comment.getTimestamp()) &&
                getIssuecl().equals(comment.getIssuecl());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescriptionme(), getTimestamp(), getIssuecl());
    }

    @Override
    public String toString() {
        return "Comment{" +
                "Id=" + Id +
                ", Descriptionme='" + Descriptionme + '\'' +
                ", Timestamp='" + Timestamp + '\'' +
                ", issucl=" + issuecl +
                '}';
    }
}