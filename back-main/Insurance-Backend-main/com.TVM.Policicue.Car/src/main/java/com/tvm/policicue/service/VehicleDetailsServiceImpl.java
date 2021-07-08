package com.tvm.policicue.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvm.policicue.model.VehicleDetails;
import com.tvm.policicue.repository.VehicleDetailsRepository;

@Service
public class VehicleDetailsServiceImpl implements VehicleDetailsService {
	
	@Autowired
	private VehicleDetailsRepository vehicleDetailsRepository;

	@Override
	public VehicleDetails saveVehicleDetails(VehicleDetails vehicleDetails) {
	return vehicleDetailsRepository.save(vehicleDetails);
	}

	@Override
	public VehicleDetails getVehicleDetails(Long id) {
	Optional<VehicleDetails> vehicleDetails = vehicleDetailsRepository.findById(id);
	if(vehicleDetails.isPresent()) {
		return vehicleDetails.get();
	}
	throw new RuntimeException("Vehicle Details is not Found for the id " +id);
	}

}
