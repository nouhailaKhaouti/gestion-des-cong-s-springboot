package ma.upm.gestioncongeg7.controller;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.upm.gestioncongeg7.model.Grade;
import ma.upm.gestioncongeg7.model.Service;
import ma.upm.gestioncongeg7.service.facade.ServiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("conge/service")
@AllArgsConstructor
@Slf4j
public class ServiceController {
    final ServiceService serviceService;

    @ApiOperation("create a new service")
    @PostMapping("/")
    public int create(@RequestBody Service service) {
        return serviceService.create(service);
    }

    @ApiOperation("find a service")
    @GetMapping("/{libelle}")
    public Service findByLibelle(@PathVariable String libelle) {
        return serviceService.findByLibelle(libelle);
    }

    @ApiOperation("update a  service")
    @PutMapping("/{libelle}")
    public int update(@PathVariable String libelle, @RequestBody Service service) {
        return serviceService.update(libelle,service);
    }

    @ApiOperation("find all")
    @GetMapping("/")
    public List<Service>  findAll() {
        return serviceService.findAll();
    }


}
