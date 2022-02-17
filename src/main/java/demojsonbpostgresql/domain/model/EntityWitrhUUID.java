package demojsonbpostgresql.domain.model;

import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@MappedSuperclass
@TypeDefs({
    @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class EntityWitrhUUID {

	@Id
	@Type(type = "pg-uuid")
	private UUID id;
	
	public EntityWitrhUUID() {
		this.id = UUID.randomUUID();
	}
}
