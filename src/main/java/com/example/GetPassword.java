package com.example;

import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

public class GetPassword {
    public static void main(String[] args) {
        System.out.printf(new Pbkdf2PasswordEncoder().encode("demo2"));
    }
}
