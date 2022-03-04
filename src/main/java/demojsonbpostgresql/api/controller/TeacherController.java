package demojsonbpostgresql.api.controller;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demojsonbpostgresql.domain.model.Review;
import demojsonbpostgresql.domain.model.Teacher;
import demojsonbpostgresql.domain.repository.TeacherRepository;
import demojsonbpostgresql.domain.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherRepository teacherRepository;

	/*
	 * @GetMapping("/teachers") public List<Teacher> list() { List<Teacher> teachers
	 * = teacherRepository.findAll();
	 * 
	 * return teachers; }
	 */

	/*
	 * @PostMapping("/teachers/{id}/review") public ResponseEntity<?>
	 * addReview(@RequestBody Review review, @PathVariable("id") String teacherID) {
	 * try { teacherService.addReview(teacherID, review); return
	 * ResponseEntity.ok().build(); } catch (EntityNotFoundException e) { return
	 * ResponseEntity.notFound().build(); } }
	 */

}