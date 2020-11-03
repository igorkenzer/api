package ru.kenzer.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Data
@Entity
public class oauth_access_token {
    @Id
    @Column(length=256)
    private String token_id;
    @Lob
    private byte[] token;
    @Column(length=256)
    private String authentication_id;
    @Column(length=256)
    private String user_name;
    @Column(length=256)
    private String client_id;
    @Lob
    private byte[] authentication;
    @Column(length=256)
    private String refresh_token;
}
