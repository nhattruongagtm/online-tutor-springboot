package com.example.tutoronline.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

    @Id
    @Column
    private Long postID;

    @Column
    private Long accountID;

    public Cart(Long postID, Long accountID) {
        this.postID = postID;
        this.accountID = accountID;
    }

    public Cart() {

    }

    @Override
    public String toString() {
        return "Cart{" +
                "postID=" + postID +
                ", accountID=" + accountID +
                '}';
    }
}
