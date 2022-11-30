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
@Inheritance(strategy = InheritanceType.JOINED)
public class Ressource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titre;
    private String langue;

    @ManyToOne
    @JsonIgnore
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "ressource")
    private Set<Commentaire> listeCommentaires = new HashSet<>();


}
