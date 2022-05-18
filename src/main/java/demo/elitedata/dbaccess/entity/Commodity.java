package demo.elitedata.dbaccess.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import demo.elitedata.dbaccess.entity.ids.CommodityId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "listing", schema = "ed")
@IdClass(CommodityId.class)
public class Commodity {
    @Id
    private String systemName;
    @Id
    private String stationName;
    @Id
    private String commodityName;
    private Long demand;
    private BigDecimal sellPrice;
    private Long supply;
    private BigDecimal buyPrice;
}
