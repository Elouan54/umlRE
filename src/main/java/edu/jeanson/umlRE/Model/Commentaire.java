package edu.jeanson.umlRE.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String commentaire;

    @Column(name = "Datetime")
    private Date date_commentaire;

    @ManyToOne
    @JsonIgnore
    private Utilisateur utilisateur;

    @ManyToOne
    @JsonIgnore
    private Ressource ressource;
}
