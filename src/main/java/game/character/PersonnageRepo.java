package game.character;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "character", path = "character")
public interface PersonnageRepo extends MongoRepository<Personnage, String> {

	List<Personnage> findByNom(@Param("name") String name);
	List<Personnage> findByPrenom(@Param("name") String name);
	List<Personnage> findByClasse(@Param("name") String name);

}