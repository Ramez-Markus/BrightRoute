package com.brightroute.brightroute.model;

// Lecture.java
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @OneToMany(mappedBy = "lecture")
    private List<LecturePart> parts;

    // ✅ Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<LecturePart> getParts() {
        return parts;
    }

    public void setParts(List<LecturePart> parts) {
        this.parts = parts;
    }
}
