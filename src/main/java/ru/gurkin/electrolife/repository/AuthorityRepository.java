package ru.gurkin.electrolife.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gurkin.electrolife.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
