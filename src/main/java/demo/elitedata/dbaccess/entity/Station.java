package demo.elitedata.dbaccess.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import demo.elitedata.dbaccess.entity.ids.StationId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "station", schema = "ed")
@IdClass(StationId.class)
public class Station {
    @Id
    private String systemName;
    @Id
    private String stationName;

    private BigDecimal distFromStarLs;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "systemName", referencedColumnName = "systemName", insertable = false, updatable = false)
    @JoinColumn(name = "stationName", referencedColumnName = "stationName", insertable = false, updatable = false)
    private List<Commodity> commodities;
}
