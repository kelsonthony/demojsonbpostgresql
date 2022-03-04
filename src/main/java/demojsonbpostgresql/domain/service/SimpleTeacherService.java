package demojsonbpostgresql.domain.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import demojsonbpostgresql.domain.model.Review;
import demojsonbpostgresql.domain.model.Teacher;
import demojsonbpostgresql.domain.repository.TeacherRepository;

@Service
public class SimpleTeacherService implements TeacherService {
	
	private final TeacherRepository teacherRepository;

	public SimpleTeacherService(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}

	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void addReview(String teacherID, Review review) {
		Objects.requireNonNull(teacherID);
		Objects.requireNonNull(review);
		Teacher teacher = teacherRepository.findById(UUID.fromString(teacherID))
				.orElseThrow(() -> new EntityNotFoundException(teacherID));
		review.setDate(LocalDate.now());
		if (teacher.getReviews() == null) {
			teacher.setReviews(new ArrayList<>());
		}
		teacher.getReviews().add(review);
		teacherRepository.save(teacher);
	}

}
