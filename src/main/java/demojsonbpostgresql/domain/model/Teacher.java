package demojsonbpostgresql.domain.model;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends EntityWitrhUUID {

	private String name;
	private String pictureURL;
	private String email;

	@Type(type = "jsonb")
	@Column(columnDefinition = "jsonb")
	@Basic(fetch = FetchType.LAZY)
	private List<Review> reviews;

}
