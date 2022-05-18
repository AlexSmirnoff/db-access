package demo.elitedata.dbaccess.entity.ids;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommodityId implements Serializable {
    private String systemName;
    private String stationName;
    private String commodityName;
}
