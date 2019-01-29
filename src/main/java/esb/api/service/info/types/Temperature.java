package esb.api.service.info.types;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Temperature implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double temp;
	
	private Integer pressure;
	
	private Integer humidity;
	
	private double temp_min;;
	
	private double temp_max;

}
