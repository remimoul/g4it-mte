/*
 * G4IT
 * Copyright 2023 Sopra Steria
 *
 * This product includes software developed by
 * French Ecological Ministery (https://gitlab-forge.din.developpement-durable.gouv.fr/pub/numeco/m4g/numecoeval)
 */
package com.soprasteria.g4it.backend.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class G4itRestException extends RuntimeException {

    private String code;

    private String message;

    private Throwable cause;

    public G4itRestException(final String code) {
        super();
        this.code = code;
    }

    public G4itRestException(final String code, final String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public G4itRestException(final String code, final String message, final Throwable cause) {
        super();
        this.code = code;
        this.message = message;
        this.cause = cause;
    }
}
