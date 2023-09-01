package be.technifutur.spring.demo.repository;

import be.technifutur.spring.demo.models.entity.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface GamerRepository extends JpaRepository<Gamer, Long> {
    Optional<Gamer> getGamerByPseudo(String pseudo);

    boolean existsByPseudo(String pseudo);
    boolean existsByEmail(String email);

}
