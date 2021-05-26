package fr.im.myBankWeb.service;

import fr.im.myBankWeb.entity.LigneBancaire;
import fr.im.myBankWeb.repository.LigneBancaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public class LigneBancaireService {

    @Autowired
    LigneBancaireRepository ligneBancaireRepository;

}