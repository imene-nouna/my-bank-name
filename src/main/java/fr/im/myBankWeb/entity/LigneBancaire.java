package fr.im.myBankWeb.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

import java.math.BigDecimal;

@Entity
public class LigneBancaire {

    @Id
    private Integer id;

    private String user;

    private BigDecimal montant;

    private String libelle;

    private String password;

    private Integer compteNum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCompteNum() {
        return compteNum;
    }

    public void setCompteNum(Integer id) {
        this.compteNum = compteNum;
    }
}