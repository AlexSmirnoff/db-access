package demo.elitedata.dbaccess.service;

import org.springframework.stereotype.Service;

import demo.elitedata.dbaccess.entity.Station;
import demo.elitedata.dbaccess.entity.ids.StationId;
import demo.elitedata.dbaccess.mapper.UpdateMapper;
import demo.elitedata.dbaccess.repository.StationRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StationService {
	private final StationRepository repository;
    private final UpdateMapper updateMapper;

    public Station saveStation(Station station) {
        var stationEntity = repository.findById(new StationId(station.getSystemName(), station.getStationName())).orElse(new Station());
        return repository.save(updateMapper.updateStation(station, stationEntity));
    }

    public Station getStation(StationId id) {
        return repository.findById(id).orElse(null);
    }
}