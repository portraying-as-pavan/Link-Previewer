package com.example.linkpreviewer.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Link {
    @Id
    private String domain;

    private String url;

    private String title;

    private String descr;

    private String image;
}
