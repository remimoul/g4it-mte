/*
 * G4IT
 * Copyright 2023 Sopra Steria
 *
 * This product includes software developed by
 * French Ecological Ministery (https://gitlab-forge.din.developpement-durable.gouv.fr/pub/numeco/m4g/numecoeval)
 */ 
package com.soprasteria.g4it.backend.common.filesystem.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum FileFolder {
    INPUT("input"),
    OUTPUT("output"),
    WORK("work"),
    EXPORT("export"),
    TEMPLATE("template");

    @Getter
    private final String folderName;
}
