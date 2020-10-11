package ru.kenzer.api.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String heading;
    private String newsbody;

    @CreationTimestamp
    private Date newsdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getNewsbody() {
        return newsbody;
    }

    public void setNewsbody(String newsbody) {
        this.newsbody = newsbody;
    }

    public Date getNewsdate() {
        return newsdate;
    }

    public void setNewsdate(Date newsdate) {
        this.newsdate = newsdate;
    }
}
