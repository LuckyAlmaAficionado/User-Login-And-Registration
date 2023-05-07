package com.security.backend.email;

public interface EmailSender {
    void send(String to, String email);
}