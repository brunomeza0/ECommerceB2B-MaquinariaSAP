/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce.repository;

import com.ecommerce.model.ErrorLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Administrator
 */
@Repository
public interface ErrorLogRepository extends JpaRepository<ErrorLog, Integer> {
    // Puedes definir métodos personalizados si lo necesitas
}
