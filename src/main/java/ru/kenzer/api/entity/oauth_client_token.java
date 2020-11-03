package ru.kenzer.api.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
public class oauth_client_token {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid" )
    private String authentication_id;

    @Column(length=256)
    private String token_id;
    @Lob
    private byte[] token;
    @Column(length=256)
    private String user_name;
    @Column(length=256)
    private String client_id;
}
