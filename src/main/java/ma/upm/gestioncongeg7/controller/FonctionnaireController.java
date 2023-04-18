package ma.upm.gestioncongeg7.controller;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.upm.gestioncongeg7.model.Grade;
import ma.upm.gestioncongeg7.model.Service;
import ma.upm.gestioncongeg7.model.Fonctionnaire;
import ma.upm.gestioncongeg7.service.facade.FonctionnaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("conge/fonctionnaire")
@AllArgsConstructor
@Slf4j
public class FonctionnaireController {
    final FonctionnaireService fonctionnaireService;

    @ApiOperation("create a new fonctionnaire")
    @PostMapping("/")
    public int create(@RequestBody Fonctionnaire fonctionnaire) {
        return fonctionnaireService.create(fonctionnaire);
    }

    @ApiOperation("find a fct")
    @GetMapping("/{ppr}")
    public Fonctionnaire findByPpr(@PathVariable  String ppr) {
        return fonctionnaireService.findByPpr(ppr);
    }

    @ApiOperation("update a  fct")
    @PutMapping("/{ppr}")
    public int update(@PathVariable String ppr, @RequestBody Fonctionnaire fonctionnaire ) {
        return fonctionnaireService.update(ppr,fonctionnaire);
    }

    @ApiOperation("find all")
    @GetMapping("/")
    public Fonctionnaire findByGrade(@PathVariable Grade grade) {
        return fonctionnaireService.findByGrade(grade);
    }

    @ApiOperation("find by  service")
    @GetMapping("/")
    public Fonctionnaire  findByService( @PathVariable Service service) {
        return fonctionnaireService.findByService(service);
    }


    @ApiOperation("find all")
    @GetMapping("/")
    public List<Fonctionnaire>  findAll() {
        return fonctionnaireService.findAll();
    }

}
