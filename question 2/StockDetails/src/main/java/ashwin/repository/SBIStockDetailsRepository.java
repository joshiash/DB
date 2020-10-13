package ashwin.repository;

import ashwin.dao.SBIStockDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SBIStockDetailsRepository extends CrudRepository<SBIStockDetails, Integer> {
}
