package ashwin.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class SBIStockDetails {
    @Id
    int id;
    String symbol;
    String series;
    long open;
    long high;
    long low;
    long close;
    long last;
    long previousClose;
    long totalTradedQty;
    long totalTradedValue;
    Timestamp timestamp;
    long totalTrades;
    String isin;
    Date createdDate;
}
