package esb.api.service.info.types;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -273503803172892740L;

	private double lon;
	
	private double lat;

}
