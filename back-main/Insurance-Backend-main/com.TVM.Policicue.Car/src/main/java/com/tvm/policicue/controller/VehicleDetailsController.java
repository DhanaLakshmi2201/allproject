package com.tvm.policicue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tvm.policicue.model.VehicleDetails;
import com.tvm.policicue.service.VehicleDetailsService;

@RestController
public class VehicleDetailsController {
	
	@Autowired
	private VehicleDetailsService vehicleDetailsService;
	
	@PostMapping("/VehicleDetails")
	public ResponseEntity<VehicleDetails> saveVehicleDetails( @RequestBody VehicleDetails vehicleDetails){
	return new ResponseEntity<VehicleDetails>(vehicleDetailsService.saveVehicleDetails(vehicleDetails),HttpStatus.CREATED);

}
 	@PostMapping("/SingleVehicleDetails")
 	public ResponseEntity<VehicleDetails> getVehicleDetails(@RequestBody VehicleDetails vehicleDetails){
   		return new ResponseEntity<VehicleDetails>(vehicleDetailsService.getVehicleDetails(vehicleDetails.getId()),HttpStatus.OK);
 	}
	
	
	
}
