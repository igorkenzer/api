package ru.kenzer.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Data
@Entity
public class oauth_refresh_token {
    @Id
    @Column(length=256)
    private String token_id;
    @Lob
    private byte[] token;
    @Lob
    private byte[] authentication;
}
