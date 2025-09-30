package com.adso.aprendiz.service;

import com.adso.aprendiz.entity.AprendizEntity;
import com.adso.aprendiz.repository.AprendizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AprendizService {

    @Autowired
    private AprendizRepository aprendizRepository;

    public void crearAprendiz(AprendizEntity aprendizEntity){
        aprendizRepository.save(aprendizEntity);
    }

    public List<AprendizEntity> obtenerApprendices(){
        return aprendizRepository.findAll();
    }

    public AprendizEntity burcarPorId(Long id){
        return aprendizRepository.findById(id).orElse(null);
    }

    public void eliminarAprendiz(Long id){
        aprendizRepository.deleteById(id);
    }

    public AprendizEntity actualizarAprendiz(Long id, AprendizEntity aprendizEntity){
        aprendizEntity.setId(id);
        return aprendizRepository.save(aprendizEntity);
    }




}