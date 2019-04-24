package ssm.service;

import ssm.pojo.Airport;

import java.util.List;

public interface AirportService {

    List<Airport> selTakePort();
    List<Airport> selLandPort();
    List<Airport>selAll();
}
