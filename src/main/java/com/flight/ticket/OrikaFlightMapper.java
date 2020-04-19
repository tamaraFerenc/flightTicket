package com.flight.ticket;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class OrikaFlightMapper {

	private static final MapperFactory mapperFactory;

    static {
        mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.classMap(Flight.class, FlightDTO.class)
                .byDefault()
                .register();
    }

    private OrikaFlightMapper() {
    }

    public static MapperFacade getMapperFacade() {
        return mapperFactory.getMapperFacade();
    }
    
}
