package com.adso.aprendiz.controller;

import com.adso.aprendiz.entity.AprendizEntity;
import com.adso.aprendiz.service.AprendizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/aprendiz")
public class AprendizController {

    @Autowired
    private AprendizService aprendizService;

    @PostMapping
    public void crearAprendiz(@RequestBody AprendizEntity aprendiz){
        aprendizService.crearAprendiz(aprendiz);
    }
    @GetMapping
    public List<AprendizEntity> obtenerAprendices(){
        return aprendizService.obtenerApprendices();
    }
    @GetMapping("/{id}")
    public AprendizEntity buscarPorId(@PathVariable long id){
        return aprendizService.burcarPorId(id);
    }
    @DeleteMapping("/{id}")
    public void elimiarAprendiz(@PathVariable long id){
        aprendizService.eliminarAprendiz(id);
    }
    @PutMapping("/{id}")
    public AprendizEntity actualizarAprendiz(@PathVariable long id, @RequestBody AprendizEntity aprendiz){
        return aprendizService.actualizarAprendiz(id, aprendiz);
    }

}
