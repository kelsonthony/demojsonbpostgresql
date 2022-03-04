package demojsonbpostgresql.domain.service;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;

import demojsonbpostgresql.domain.model.Review;

@Service
public interface TeacherService {
    /**
     *
     * @param teacherID
     * @param review
     * @throws javax.persistence.EntityNotFoundException
     */
    void addReview(@NotNull String teacherID, @NotNull Review review);
}