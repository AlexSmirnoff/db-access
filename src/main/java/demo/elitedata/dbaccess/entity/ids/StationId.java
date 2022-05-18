package demo.elitedata.dbaccess.entity.ids;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StationId implements Serializable{
    private String systemName;
    private String stationName;
}
