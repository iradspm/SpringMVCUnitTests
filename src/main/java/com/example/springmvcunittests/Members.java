package com.example.springmvcunittests;

import javax.persistence.*;

@Entity
@Table(name="members")
public class Members {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int member_id;
    private String member_name;
    private String member_email;

    public Members() {
    }

    public Members(String member_name, String member_email) {
        this.member_name = member_name;
        this.member_email = member_email;
    }

    public Members(int member_id, String member_name, String member_email) {
        this.member_id = member_id;
        this.member_name = member_name;
        this.member_email = member_email;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getMember_email() {
        return member_email;
    }

    public void setMember_email(String member_email) {
        this.member_email = member_email;
    }
}
