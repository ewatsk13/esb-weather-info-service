package esb.api.service.info.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import esb.api.service.info.types.Location;
import esb.api.service.info.types.Temperature;
import esb.api.service.info.types.Weather;
import esb.api.service.info.types.WeatherInfoResponse;

@RestController
@RequestMapping("weather")
public class WeatherInfoController {

	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public HttpEntity<List<WeatherInfoResponse>> getInfo(@RequestParam(value="cities", required=true) List<String> cities) {
		System.out.println("testing!!!" + cities.size());
		
		WeatherInfoResponse response = new WeatherInfoResponse();
		
		Location l = new Location();
		l.setLon(-0.13);
		l.setLat(51.51);
		
		Weather w = new Weather();
		w.setId(300);
		w.setMain("Drizzle");
		w.setDescription("light intensity drizzle");
		w.setIcon("09d");
		
		List<Weather> ws = new ArrayList<>();
		ws.add(w);
		
		Temperature t = new Temperature();
		t.setTemp(280.32);
		t.setPressure(1012);
		t.setHumidity(81);
		t.setTemp_min(279.15);
		t.setTemp_max(281.15);
		
		
		response.setLocation(l);
		response.setWeather(ws);
		response.setTemperature(t);
		
		List<WeatherInfoResponse> result = new ArrayList<>();
		result.add(response);
		
		return new ResponseEntity<>(result,HttpStatus.OK);

	}

}
