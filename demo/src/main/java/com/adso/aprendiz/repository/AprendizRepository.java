package com.adso.aprendiz.repository;

import com.adso.aprendiz.entity.AprendizEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AprendizRepository extends JpaRepository<AprendizEntity, Long> {
}
