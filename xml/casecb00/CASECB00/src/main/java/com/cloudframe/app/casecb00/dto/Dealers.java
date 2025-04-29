package com.cloudframe.app.casecb00.dto;

/**
*  The class Dealers is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:45. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


@Data
public class Dealers extends DealersSerialized { 
   

						@Getter @Setter private char[] dealername = Field.fillLowValue(30);
			@Getter @Setter private List<Locations> locations = new ArrayList<>();
    	

								@Getter @Setter private short makecounter;
			@Getter @Setter private List<Manufacturers> manufacturers = new ArrayList<>();
    	
	
	/**
	* Constructor for Dealers
	**/
    public Dealers() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dealers. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dealers(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < LOCATIONS_SIZE;arrayIndex++) {
						getLocations().add(new Locations(this, beginLocations + 
						arrayIndex * Locations.getLocationsFieldLength()));
				}
				for (int arrayIndex = 0; arrayIndex < MANUFACTURERS_SIZE;arrayIndex++) {
						getManufacturers().add(new Manufacturers(this, beginManufacturers + 
						arrayIndex * Manufacturers.getManufacturersFieldLength()));
				}
								setMakecounter((short)0);
			for (int arrayIndex = 0; arrayIndex < MANUFACTURERS_SIZE;arrayIndex++) {
					getManufacturers().add(new Manufacturers(this, beginManufacturers + 
						arrayIndex * Manufacturers.getManufacturersFieldLength()));
			}
    } 

	/**
	 * 	initializes Dealers
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDealername(CONSTANTS.SPACE_30);
     if (locations.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  LOCATIONS_SIZE;index++) {
              Locations  newElement = new Locations(this,beginLocations + index * Locations.getLocationsFieldLength());
              newElement.initialize();
              getLocations().add(newElement);
          }
     } else {
        if (locations.size() < LOCATIONS_SIZE) {
          // prefill it first
          for (int index = locations.size();index <  LOCATIONS_SIZE;index++) {
              Locations  newElement = new Locations(this,beginLocations + index * Locations.getLocationsFieldLength());
              getLocations().add(newElement);
          }
        }
        
     	for (int index = 0;index <  LOCATIONS_SIZE;index++) {
     		Locations locationsVar = locations.get(index);
 			if (locationsVar == null) {
                locationsVar = new Locations(this,beginLocations + index * Locations.getLocationsFieldLength());
                  getLocations().set(index, locationsVar);
			} 
			locationsVar.initialize();
		}
     }
         	setMakecounter((short)0);
     if (manufacturers.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  MANUFACTURERS_SIZE;index++) {
              Manufacturers  newElement = new Manufacturers(this,beginManufacturers + index * Manufacturers.getManufacturersFieldLength());
              newElement.initialize();
              getManufacturers().add(newElement);
          }
     } else {
        if (manufacturers.size() < MANUFACTURERS_SIZE) {
          // prefill it first
          for (int index = manufacturers.size();index <  MANUFACTURERS_SIZE;index++) {
              Manufacturers  newElement = new Manufacturers(this,beginManufacturers + index * Manufacturers.getManufacturersFieldLength());
              getManufacturers().add(newElement);
          }
        }
        
     	for (int index = 0;index <  MANUFACTURERS_SIZE;index++) {
     		Manufacturers manufacturersVar = manufacturers.get(index);
 			if (manufacturersVar == null) {
                manufacturersVar = new Manufacturers(this,beginManufacturers + index * Manufacturers.getManufacturersFieldLength());
                  getManufacturers().set(index, manufacturersVar);
			} 
			manufacturersVar.initialize();
		}
     }
   }


}
  
