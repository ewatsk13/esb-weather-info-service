package esb.api.service.info.types;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherInfoResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Location location;
	
	private List<Weather> weather;
	
	private Temperature temperature;

}
