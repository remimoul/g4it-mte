/*
 * G4IT
 * Copyright 2023 Sopra Steria
 *
 * This product includes software developed by
 * French Ecological Ministery (https://gitlab-forge.din.developpement-durable.gouv.fr/pub/numeco/m4g/numecoeval)
 */ 
package com.soprasteria.g4it.backend.apidigitalservice.repository;

import com.soprasteria.g4it.backend.apidigitalservice.modeldb.referential.NetworkTypeRef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Network Type Referential repository.
 */
@Repository
public interface NetworkTypeRefRepository extends JpaRepository<NetworkTypeRef, Long> {

    /**
     * Find ref by code.
     *
     * @param code the network type code.
     * @return the network type.
     */
    Optional<NetworkTypeRef> findByReference(final String code);
}

