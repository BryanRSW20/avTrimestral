package br.trimestral.senai.trimestral.repository;

import br.trimestral.senai.trimestral.model.Filiais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiliaisRepository extends JpaRepository <Filiais, Long> {

    public Filiais findByNome (String nome);
    public Filiais findByLocalizacao (String localizacao);
    public Filiais findByRazaosocial (String razaoSocial);
}
