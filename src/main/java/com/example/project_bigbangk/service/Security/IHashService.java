package com.example.project_bigbangk.service.Security;
/**
 * created by Pieter Jan Bleichrodt
 */
public interface IHashService {
    String hash(String password);

    Boolean hashCheck(String password, String hashedPassword);
}
