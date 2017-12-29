package game.user;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UtilisateurRepo extends MongoRepository<Utilisateur, String> {

	List<Utilisateur> findByNom(@Param("name") String name);
	List<Utilisateur> findByPrenom(@Param("name") String name);
	List<Utilisateur> findByNomUtilisateur(@Param("name") String name);
}