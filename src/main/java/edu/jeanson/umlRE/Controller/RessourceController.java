package edu.jeanson.umlRE.Controller;

import edu.jeanson.umlRE.dao.UtilisateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RessourceController {
    @Autowired
    private UtilisateurDao utilisateurDao;
}
