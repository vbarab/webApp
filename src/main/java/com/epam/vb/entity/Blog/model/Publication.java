package com.epam.vb.entity.Blog.model;

import java.util.Date;
import java.util.UUID;

public abstract class Publication extends BaseEntity {

    private String bodyText;
    private Authorized authorName;
    private Date creationDate;
    private int like;
    private String title;

    public Publication() {
    }

    public Publication(UUID uuid) {
        super(uuid);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public Authorized getAuthorName() {
        return authorName;
    }

    public void setAuthorName(Authorized authorName) {
        this.authorName = authorName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
