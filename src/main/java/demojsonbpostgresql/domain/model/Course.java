package demojsonbpostgresql.domain.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Course  extends EntityWitrhUUID{

	/*
	 * public Course(String string, int i, short s, Teacher pj) { // TODO
	 * Auto-generated constructor stub }
	 */

	private String name;
	private int workload;
	private short rate;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_course_teacher"))
	private Teacher teacher;
}
