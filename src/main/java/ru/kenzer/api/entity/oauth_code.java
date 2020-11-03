package ru.kenzer.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Data
@Entity
public class oauth_code {
    @Id
    @Column(length=256)
    private String code;
    @Lob
    private byte[] authentication;
}
