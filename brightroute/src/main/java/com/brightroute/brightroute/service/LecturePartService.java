package com.brightroute.brightroute.service;

// LecturePartService.java
import com.brightroute.brightroute.model.LecturePart;
import com.brightroute.brightroute.repository.LecturePartRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LecturePartService {
    private final LecturePartRepository repository;

    public LecturePartService(LecturePartRepository repository) {
        this.repository = repository;
    }

    public List<LecturePart> getAllParts() {
        return repository.findAll();
    }

    @SuppressWarnings("null")
    public LecturePart savePart(LecturePart part) {
        return repository.save(part);
    }
}

