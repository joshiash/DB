package ashwin.request;

import ashwin.dao.SBIStockDetails;

import java.util.List;


public class RequestJson {
    String message;
    String status;
    List<SBIStockDetails> nseEqs;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<SBIStockDetails> getNseEqs() {
        return nseEqs;
    }

    public void setNseEqs(List<SBIStockDetails> nseEqs) {
        this.nseEqs = nseEqs;
    }
}
