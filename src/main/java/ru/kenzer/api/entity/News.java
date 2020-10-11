package ru.kenzer.api.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String heading;
    private String newsbody;
    private Date newsdate;

}
