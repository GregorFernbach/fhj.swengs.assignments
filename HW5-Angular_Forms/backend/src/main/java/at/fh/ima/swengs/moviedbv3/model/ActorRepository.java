package at.fh.ima.swengs.moviedbv3.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource()
public interface ActorRepository extends PagingAndSortingRepository<Actor,Long>, JpaRepository<Actor, Long>, CrudRepository<Actor, Long> {

    //This would be exposed under the URL: http://localhost:8080/actors/search/findByFirstNameAndLastName
    public List<Actor> findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName")String lastName);

    public Actor findByFirstName(@Param("firstName") String firstName);

}
