package demojsonbpostgresql.domain.service;

import javax.validation.constraints.NotNull;

import demojsonbpostgresql.domain.model.Review;

public interface TeacherService {
    /**
     *
     * @param teacherID
     * @param review
     * @throws javax.persistence.EntityNotFoundException
     */
    void addReview(@NotNull String teacherID, @NotNull Review review);
}