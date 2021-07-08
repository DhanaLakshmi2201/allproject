package com.tvm.policicue.service;

import com.tvm.policicue.model.VehicleDetails;

public interface VehicleDetailsService {
	
	VehicleDetails saveVehicleDetails(VehicleDetails vehicleDetails);
	VehicleDetails getVehicleDetails(Long id);
	
	

}
