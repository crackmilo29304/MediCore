package com.medicore.app.utils;

public class UserSession {
    private static String selectedRole; // "ADMIN", "PACIENTE", "MEDICO"
    private static String documentNumber;
    
    public static void setRol(String role) {
        selectedRole = role;
    }

    public static String getRol() {
        return selectedRole;
    }

    public static String getDocumentNumber() {
        return documentNumber;
    }

    public static void setDocumentNumber(String numero_documento) {
        UserSession.documentNumber = numero_documento;
    }
}
