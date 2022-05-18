package demo.elitedata.dbaccess.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import demo.elitedata.dbaccess.entity.SystemEntity;


public interface SystemRepository extends PagingAndSortingRepository<SystemEntity, String> {
}
