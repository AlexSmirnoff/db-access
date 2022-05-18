package demo.elitedata.dbaccess.service;

import org.springframework.stereotype.Service;

import demo.elitedata.dbaccess.entity.SystemEntity;
import demo.elitedata.dbaccess.mapper.UpdateMapper;
import demo.elitedata.dbaccess.repository.SystemRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SystemService {
	private final SystemRepository repository;
    private final UpdateMapper updateMapper;

    public SystemEntity saveSystem(SystemEntity system) {
        var systemEntity = repository.findById(system.getName()).orElse(new SystemEntity());
        return repository.save(updateMapper.updateSystem(system, systemEntity));
    }

    public SystemEntity getSystem(String name) {
        return repository.findById(name).orElse(null);
    }
}