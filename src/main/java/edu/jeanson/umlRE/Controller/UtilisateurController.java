package edu.jeanson.umlRE.Controller;

import edu.jeanson.umlRE.Model.Utilisateur;
import edu.jeanson.umlRE.dao.UtilisateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UtilisateurController {

    @Autowired
    private UtilisateurDao utilisateurDao;

    @GetMapping("/utilisateur/{id}")
    public Utilisateur getUtilisateurById(@PathVariable int id) {

        return utilisateurDao.findById(id).orElse(null);
    }
}
