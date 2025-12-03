package com.brightroute.brightroute.service;

// LectureService.java
import com.brightroute.brightroute.model.Lecture;
import com.brightroute.brightroute.repository.LectureRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.lang.NonNull;

@Service
public class LectureService {
    private final LectureRepository lectureRepository;

    public LectureService(LectureRepository lectureRepository) {
        this.lectureRepository = lectureRepository;
    }

    public List<Lecture> getAllLectures() {
        return lectureRepository.findAll();
    }
    @SuppressWarnings("null")
    @NonNull
    public Lecture saveLecture(Lecture lecture) {
        return lectureRepository.save(lecture);
    }
}
