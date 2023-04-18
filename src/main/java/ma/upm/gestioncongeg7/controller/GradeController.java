package ma.upm.gestioncongeg7.controller;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.upm.gestioncongeg7.model.Grade;
import ma.upm.gestioncongeg7.service.facade.GradeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("conge/grade")
@AllArgsConstructor
@Slf4j
public class GradeController {
    final GradeService gradeService;

    @ApiOperation("create a new grade")
    @PostMapping("/")
    public int create(@RequestBody Grade grade) {
        return gradeService.create(grade);
    }

    @ApiOperation("find a grade")
    @GetMapping("/{libelle}")
    public Grade findByLibelle(@PathVariable String libelle) {
        return gradeService.findByLibelle(libelle);
    }

    @ApiOperation("update a  grade")
    @PutMapping("/{libelle}")
    public int update(@PathVariable String libelle, @RequestBody Grade grade) {
        return gradeService.update(libelle,grade);
    }

    @ApiOperation("find all")
    @GetMapping("/")
    public List<Grade>  findAll() {
        return gradeService.findAll();
    }


}
