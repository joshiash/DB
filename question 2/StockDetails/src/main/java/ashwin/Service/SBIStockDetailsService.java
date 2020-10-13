package ashwin.Service;


import ashwin.dao.SBIStockDetails;
import ashwin.repository.SBIStockDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SBIStockDetailsService {
    @Autowired
    SBIStockDetailsRepository repository;

    public void addSBIStockDetails(SBIStockDetails sbiStockDetails){
        repository.save(sbiStockDetails);
    }
}
