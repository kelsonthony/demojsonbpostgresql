package demojsonbpostgresql.domain.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demojsonbpostgresql.domain.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, UUID>{

}
