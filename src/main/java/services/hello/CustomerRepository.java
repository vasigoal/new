package services.hello;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by anva on 17/10/2015.
 */
@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(@Param("firstName") String firstName);
    public List<Customer> findByLastName(@Param("lastName") String lastName);

}
