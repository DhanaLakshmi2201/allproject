package com.tvm.policicue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvm.policicue.model.VehicleDetails;
@Repository
public interface VehicleDetailsRepository extends JpaRepository<VehicleDetails, Long> {
	

}
