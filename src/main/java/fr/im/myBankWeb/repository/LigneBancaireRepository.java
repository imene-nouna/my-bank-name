package fr.im.myBankWeb.repository;

import fr.im.myBankWeb.entity.LigneBancaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneBancaireRepository extends JpaRepository<LigneBancaire, Integer> {
}