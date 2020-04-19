package com.flight.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

	@Autowired
    FlightRepository dao;
     
    public Flight save(Flight flight){
        return dao.saveAndFlush(flight);
    }

	public Flight findById(int id) {
		return dao.findById(id).get();
	}
    
}

    