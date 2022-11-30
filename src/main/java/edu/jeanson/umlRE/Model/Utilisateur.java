package edu.jeanson.umlRE.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.HashSet;
import java.util.Set;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;

    @OneToMany(mappedBy = "utilisateur")
    private Set<Ressource> listeRessources = new HashSet<>();

    @OneToMany(mappedBy = "utilisateur")
    private Set<Commentaire> listeCommentaires = new HashSet<>();

    @OneToMany(mappedBy = "utilisateur1")
    private Set<Relation> listeRelations1 = new HashSet<>();

    @OneToMany(mappedBy = "utilisateur2")
    private Set<Relation> listeRelations2 = new HashSet<>();

}
