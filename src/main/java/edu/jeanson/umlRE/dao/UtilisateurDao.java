package edu.jeanson.umlRE.dao;

import edu.jeanson.umlRE.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Integer> {
    Utilisateur findByNom(String nom);

}
