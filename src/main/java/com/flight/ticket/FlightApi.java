package com.flight.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ma.glasnost.orika.MapperFacade;

@RestController
public class FlightApi implements ErrorController{
	
    private final static String PATH = "/error";
    private final static String ERROR_MESSAGE = "No Flight Found";
    @Override
    @RequestMapping(PATH)
    @ResponseBody
    public String getErrorPath() {
        return ERROR_MESSAGE;
    }
    
	@Autowired
	FlightService flightService;
	
	@GetMapping(value="/getflight/{id}")
    public Flight getById(@PathVariable int id){
		
		return flightService.findById(id);
		
	}
    
    @RequestMapping(value="/newflight", method=RequestMethod.POST)
    public void save(@RequestBody FlightDTO flightRequest){
    	
    	MapperFacade mapper = OrikaFlightMapper.getMapperFacade();
    	
    	Flight flight = mapper.map(flightRequest, Flight.class);
    	
    	flightService.save(flight);

    }

}
