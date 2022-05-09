package com.example.tutoronline.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="comment")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long accountID;

    @Column
    private Long postID;

    @Column
    private Integer like;

    @Column
    private Date createdDate;

    @Column
    private String content;


    public CommentEntity(Long id, Long accountID, Long postID, Integer like, Date createdDate, String content) {
        this.id = id;
        this.accountID = accountID;
        this.postID = postID;
        this.like = like;
        this.createdDate = createdDate;
        this.content = content;
    }

    public CommentEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public Long getPostID() {
        return postID;
    }

    public void setPostID(Long postID) {
        this.postID = postID;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CommentEntity{" +
                "id=" + id +
                ", accountID=" + accountID +
                ", postID=" + postID +
                ", like=" + like +
                ", createdDate=" + createdDate +
                ", content='" + content + '\'' +
                '}';
    }
}
