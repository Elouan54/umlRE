package edu.jeanson.umlRE.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Relation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String Type;

    @ManyToOne
    @JsonIgnore
    private Utilisateur utilisateur1;

    @ManyToOne
    @JsonIgnore
    private Utilisateur utilisateur2;
}
