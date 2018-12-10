package com.example.springboot_demo.domain;

import java.util.List;

public class Book {

    private int id;
    private String name;
    private String author;
    private String pubtime;
    private String kind;
    private String introduce;
    private String recommed;
    private String bookimage;
    private int recommentnum;

    private List<Recomment> recomments;

    public List<Recomment> getRecomments() {
        return recomments;
    }

    public void setRecomments(List<Recomment> recomments) {
        this.recomments = recomments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubtime() {
        return pubtime;
    }

    public void setPubtime(String pubtime) {
        this.pubtime = pubtime;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getRecommed() {
        return recommed;
    }

    public void setRecommed(String recommed) {
        this.recommed = recommed;
    }

    public String getBookimage() {
        return bookimage;
    }

    public void setBookimage(String bookimage) {
        this.bookimage = bookimage;
    }

    public int getRecommentnum() {
        return recommentnum;
    }

    public void setRecommentnum(int recommentnum) {
        this.recommentnum = recommentnum;
    }
}
