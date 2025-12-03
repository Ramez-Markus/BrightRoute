package com.brightroute.brightroute.controller;

import com.brightroute.brightroute.model.Lecture;
import com.brightroute.brightroute.service.LectureService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/lectures")
public class LectureController {
    private final LectureService service;

    public LectureController(LectureService service) {
        this.service = service;
    }

    @GetMapping
    public List<Lecture> getAll() {
        return service.getAllLectures();
    }

    @PostMapping
    public Lecture addLecture(@RequestBody Lecture lecture) {
        return service.saveLecture(lecture);
    }
}
