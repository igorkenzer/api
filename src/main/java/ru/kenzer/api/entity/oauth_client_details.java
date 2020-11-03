package ru.kenzer.api.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class oauth_client_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long client_id;
    @Column(length=256)
    private String resource_ids;
    @Column(length=256)
    private String client_secret;
    @Column(length=256)
    private String scope;
    @Column(length=256)
    private String authorized_grant_types;
    @Column(length=256)
    private String web_server_redirect_uri;
    @Column(length=256)
    private String authorities;
    private int access_token_validity;
    private int refresh_token_validity;
    @Column(length=256)
    private String additional_information;
    @Column(length=256)
    private String autoapprove;
}
