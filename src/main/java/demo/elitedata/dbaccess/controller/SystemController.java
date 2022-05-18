package demo.elitedata.dbaccess.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.elitedata.dbaccess.entity.SystemEntity;
import demo.elitedata.dbaccess.service.SystemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("system")
@RequiredArgsConstructor
public class SystemController {
    private final SystemService service;

    @PostMapping
    public SystemEntity postSystem(@RequestBody SystemEntity system) {
        log.info("Received: {}", system);
        return service.saveSystem(system);
    }

    @GetMapping
    public SystemEntity getSystem(@RequestParam String name) {
        return service.getSystem(name);
    }
}