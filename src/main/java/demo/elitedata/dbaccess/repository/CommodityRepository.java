package demo.elitedata.dbaccess.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import demo.elitedata.dbaccess.entity.Commodity;
import demo.elitedata.dbaccess.entity.ids.CommodityId;

public interface CommodityRepository extends PagingAndSortingRepository<Commodity, CommodityId>{
}