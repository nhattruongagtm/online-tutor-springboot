package com.example.tutoronline.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="replyComment")
public class ReplyCommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long commentID;

    @Column
    private Long accountID;

    @Column
    private Long postID;

    @Column
    private Date createdDate;

    @Column
    private Integer like;

    @Column
    private String content;

    public ReplyCommentEntity(Long id, Long commentID, Long accountID, Long postID, Date createdDate, Integer like, String content) {
        this.id = id;
        this.commentID = commentID;
        this.accountID = accountID;
        this.postID = postID;
        this.createdDate = createdDate;
        this.like = like;
        this.content = content;
    }

    public ReplyCommentEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommentID() {
        return commentID;
    }

    public void setCommentID(Long commentID) {
        this.commentID = commentID;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ReplyCommentEntity{" +
                "id=" + id +
                ", commentID=" + commentID +
                ", accountID=" + accountID +
                ", postID=" + postID +
                ", createdDate=" + createdDate +
                ", like=" + like +
                ", content='" + content + '\'' +
                '}';
    }
}
