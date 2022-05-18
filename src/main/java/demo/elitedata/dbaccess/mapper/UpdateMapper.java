package demo.elitedata.dbaccess.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import demo.elitedata.dbaccess.entity.Commodity;
import demo.elitedata.dbaccess.entity.Station;
import demo.elitedata.dbaccess.entity.SystemEntity;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UpdateMapper {
    SystemEntity updateSystem(SystemEntity source, @MappingTarget SystemEntity target);

    Station updateStation(Station source, @MappingTarget Station target);
    
    Commodity updateCommodity(Commodity source, @MappingTarget Commodity target);
}