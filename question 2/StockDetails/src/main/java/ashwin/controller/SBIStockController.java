package ashwin.controller;


import ashwin.Service.SBIStockDetailsService;
import ashwin.dao.SBIStockDetails;
import ashwin.request.RequestJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/sbistock")
public class SBIStockController {
    @Autowired
    SBIStockDetailsService sbiStockDetailsService;

    @PostMapping
    public void postSBIStockDetails(@RequestBody RequestJson requestJson)
    {
        List<SBIStockDetails> stockDetailsList = requestJson.getNseEqs();
        for(SBIStockDetails sbiStockDetails : stockDetailsList){
            sbiStockDetailsService.addSBIStockDetails(sbiStockDetails);
        }

    }

}
