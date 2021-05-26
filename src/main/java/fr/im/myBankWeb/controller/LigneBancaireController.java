package fr.im.myBankWeb.controller;

import fr.im.myBankWeb.entity.LigneBancaire;
import fr.im.myBankWeb.repository.LigneBancaireRepository;
import fr.im.myBankWeb.service.LigneBancaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/ligne-bancaire")

public class LigneBancaireController {

    LigneBancaireService ligneService;

  //  @GetMapping
//    public List<LigneBancaire> lignes() { return ligneService.findAll(); }

//    public List<LigneBancaire> queryForCompte( String id){
//        return ligneService.fin
//    }

}
