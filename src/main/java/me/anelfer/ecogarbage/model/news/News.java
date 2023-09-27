package me.anelfer.ecogarbage.model.news;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "news")
@Getter
@Setter
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String text;
    @Column(name = "preview_img")
    private String previewImgUrl;
    @CreationTimestamp
    private Timestamp createdAt;

}
