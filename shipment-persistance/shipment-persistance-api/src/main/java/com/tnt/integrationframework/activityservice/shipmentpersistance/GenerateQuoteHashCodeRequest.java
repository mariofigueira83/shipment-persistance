package com.tnt.integrationframework.activityservice.shipmentpersistance;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name ="employee")
public class GenerateQuoteHashCodeRequest {

/*@GeneratedValue(generator = "uuid")
@GenericGenerator(name = "uuid", strategy = "uuid")*/
	@Id

	
	 public String id;
	    public GenerateQuoteHashCodeRequest( ) {
	    }
	    public GenerateQuoteHashCodeRequest(String string) {
	        this.id = string;
	    }
	
		/*private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	*/
		public String getId() {
			return id;
		}

}
