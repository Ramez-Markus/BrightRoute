package com.brightroute.brightroute.controller;

import com.brightroute.brightroute.model.LecturePart;
import com.brightroute.brightroute.service.LecturePartService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/parts")
public class LecturePartController {
    private final LecturePartService service;

    public LecturePartController(LecturePartService service) {
        this.service = service;
    }

    @GetMapping
    public List<LecturePart> getAll() {
        return service.getAllParts();
    }

    @PostMapping
    public LecturePart addPart(@RequestBody LecturePart part) {
        return service.savePart(part);
    }
}
