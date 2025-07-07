/*
 * G4IT
 * Copyright 2023 Sopra Steria
 *
 * This product includes software developed by
 * French Ecological Ministery (https://gitlab-forge.din.developpement-durable.gouv.fr/pub/numeco/m4g/numecoeval)
 */

package com.soprasteria.g4it.backend.common.utils;

public class SanitizeUrl {
    private SanitizeUrl() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    /**
     * Returns the url without encoding %5C and %2F
     * Truncate to the first '?' character
     */
    public static String removeTokenAndEncoding(String url) {
        String res = url;
        if (res.contains("?")) {
            res = res.substring(0, res.indexOf("?"));
        }
        return res
                .replace("%5C", "/")
                .replace("%2F", "/");
    }
}
