package demo.elitedata.dbaccess.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import demo.elitedata.dbaccess.entity.Station;
import demo.elitedata.dbaccess.entity.ids.StationId;

public interface StationRepository extends PagingAndSortingRepository<Station, StationId> {
}
