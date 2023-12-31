package com.platform.match.repository;

import com.platform.match.domain.ClientVisitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientVisitorRepository extends JpaRepository<ClientVisitor, Long> {
    ClientVisitor findByUuid(String uuid);
    ClientVisitor getReferenceByUuid(String uuid);
}