package demo.elitedata.dbaccess.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "system", schema = "ed")
public class SystemEntity {
    @Id
    @Column(name = "systemName")
    private String name;

    private BigDecimal posX;
    private BigDecimal posY;
    private BigDecimal posZ;

    @OneToMany
    @JoinColumn(name = "systemName", insertable = false, updatable = false)
    private List<Station> stations;
}
