package ru.kenzer.api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class users {
    @Id
    @GeneratedValue(strategy = auto)
            private int id;
    username VARCHAR(256) NOT NULL,
    password VARCHAR(256) NOT NULL,
    enabled TINYINT(1),
    UNIQUE KEY unique_username(username)
}
