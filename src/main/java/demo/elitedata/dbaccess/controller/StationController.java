package demo.elitedata.dbaccess.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.elitedata.dbaccess.entity.Station;
import demo.elitedata.dbaccess.entity.ids.StationId;
import demo.elitedata.dbaccess.service.StationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("station")
@RequiredArgsConstructor
public class StationController {
    private final StationService service;

	@PostMapping
    public Station postStation(@RequestBody Station station) {
        log.info("Received: {}", station);
        return service.saveStation(station);
    }

    @GetMapping
    public Station getStation(@RequestParam String systemName, @RequestParam String stationName) {
        return service.getStation(new StationId(systemName, stationName));
    }
}