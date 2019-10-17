//package com.ga.entity;
//
//import java.util.List;
////
//import javax.persistence.*;
////
////import com.fasterxml.jackson.annotation.JsonIgnore;
////
//@Entity
//@Table(name = "song")
//public class Song {
////
////    @Id
////    @Column(name = "song_id")
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    private int id;
////
////    @Column(unique = true, nullable = false)
////    private String Title;
////
////    @Column
////    private int Length;
////    
////    public Song() { }
////    
////    @JsonIgnore
////    @ManyToMany(fetch = FetchType.LAZY,
////            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
////    @JoinTable(name = "user_song",
////            joinColumns = {@JoinColumn(name = "song_id")},
////            inverseJoinColumns = @JoinColumn(name = "user_id"))
////    private List<User> users;
////    
////    public List<User> getUsers() { return users; }
////
////    public void setUsers(List<User> users) { this.users = users; }
////    
////    public int getId() {
////        return id;
////    }
////
////    public void setId(int id) {
////        this.id = id;
////    }
////
////    public String getTitle() {
////        return title;
////    }
////
////    public void setTitle(String title) {
////        this.title = title;
////    }
////
////    public int getLength() {
////        return length;
////    }
////
////    public void setLength(int length) {
////        this.length = length;
////    }
//}