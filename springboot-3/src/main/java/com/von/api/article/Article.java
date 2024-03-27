package com.von.api.article;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = "id")

@Entity(name = "articles")

public class Article {

    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    private String writer;
    private String postdate;

    @Builder(builderMethodName = "builder")
    public Article(Long id, String title, String content, String writer, String postdate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.postdate = postdate;
    }
}
