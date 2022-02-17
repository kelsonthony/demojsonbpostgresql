package demojsonbpostgresql.domain.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demojsonbpostgresql.domain.model.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, UUID> {

}
