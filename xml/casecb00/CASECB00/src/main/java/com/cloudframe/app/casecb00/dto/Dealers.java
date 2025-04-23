package com.cloudframe.app.casecb00.dto;

/**
*  The class Dealers is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/


import com.cloudframe.app.casecb00.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


public class Dealers extends DealersSerialized { 
   

						private char[] dealername = Field.fillLowValue(30);
			private List<Locations> locations = new ArrayList<>();
    	

								private short makecounter;
			private List<Manufacturers> manufacturers = new ArrayList<>();
    	
	
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
						locations.add(new Locations(this, beginLocations + 
						arrayIndex * Locations.getLocationsFieldLength()));
				}
				for (int arrayIndex = 0; arrayIndex < MANUFACTURERS_SIZE;arrayIndex++) {
						manufacturers.add(new Manufacturers(this, beginManufacturers + 
						arrayIndex * Manufacturers.getManufacturersFieldLength()));
				}
								setMakecounter((short)0);
			for (int arrayIndex = 0; arrayIndex < MANUFACTURERS_SIZE;arrayIndex++) {
					manufacturers.add(new Manufacturers(this, beginManufacturers + 
						arrayIndex * Manufacturers.getManufacturersFieldLength()));
			}
    } 

	/**
	 *	Returns the value of dealername
	 *	@return dealername
	 */
   public char[] getDealername() throws CFException{
     if (isDealernameModified()) { 
        dealername = refreshDealername();
     }
   		return dealername;
   }

  
	/**
	*  set variable dealername
	*  Corresponding COBOL Variable is DEALERNAME
	*  @param value
	**/
   public void setDealername(char[] value) {
      dealername = checkDealernameConstraints(value);
      serializeDealername(dealername);
   } 

     /**
	 * 	Update Dealername 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDealername(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDealername,dealername.length);
   	
   }
   
   public void setDealername(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDealername,dealername.length);
   	
   }
   
     /**
	 * 	Update Dealername 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDealername(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDealername+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dealername with another Field
	 *	@param value
	 */
   public void setDealername(Field source) {
       replace(source,0,source.length(),beginDealername,DEALERNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Dealername 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDealername(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDealername,DEALERNAME_LEN);
   	
   }
   
     /**
	 * 	Update Dealername 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDealername(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDealername+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of locations
	 *  Corresponding COBOL Variable is LOCATIONS
	 *	@return locations
	 */
   public List<Locations> getLocations() {
       return locations;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return locations
	 */
	public Locations getLocations(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getLocations(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= LOCATIONS_SIZE) {
             	index = LOCATIONS_SIZE -1; // can't exceed max array size
             	logger.trace("locations - Array index exceeded max Size {}, resetting it to max allowed",LOCATIONS_SIZE); 
	    }
		if (index >= locations.size()) {
       		for (int fillIndex =  locations.size() -1; fillIndex < index;fillIndex++) {
		       locations.add(null);
		    }
			locations.set(index,
			   	   	new Locations(this,beginLocations + index * Locations.getLocationsFieldLength()) 
				                        ); 	
		} 
   	   Locations value = locations.get(index);
   	   if (value == null) {
   	      locations.set(index,
			   	   	new Locations(this,beginLocations + index * Locations.getLocationsFieldLength()) 
				                        ); 
		  value = locations.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Locations at index with the passed value
	 *  Corresponding COBOL Variable is LOCATIONS
	 *  @param index
	 *	@param value
	 */
  public void setLocations(int index,char[] value) {
   	getLocations(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of makecounter
	 *	@return makecounter
	 */
	public short getMakecounter() throws CFException {
        if (isMakecounterModified()) { 
           makecounter = refreshMakecounter();
        }
   		return makecounter;
	}
	
	/**
	 * 	Update Makecounter with the passed value
	 *  Corresponding COBOL Variable is MAKECOUNTER
	 *	@param number
	 */
	public void setMakecounter(short number) {
	     // Truncate if the number is beyond +/- Max range
	    makecounter = checkMakecounterMaxLimit(number); 
		serializeMakecounter(makecounter);
	}

	public void setMakecounter(int number) {
	    number = checkMakecounterMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMakecounter((short)number);
	}
	public void setMakecounter(long number) {
	    number = checkMakecounterMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMakecounter((short)number);
	}
	

	/**
	 *	Returns the  value of manufacturers
	 *  Corresponding COBOL Variable is MANUFACTURERS
	 *	@return manufacturers
	 */
   public List<Manufacturers> getManufacturers() {
       return manufacturers;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return manufacturers
	 */
	public Manufacturers getManufacturers(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getManufacturers(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= MANUFACTURERS_SIZE) {
             	index = MANUFACTURERS_SIZE -1; // can't exceed max array size
             	logger.trace("manufacturers - Array index exceeded max Size {}, resetting it to max allowed",MANUFACTURERS_SIZE); 
	    }
		if (index >= manufacturers.size()) {
       		for (int fillIndex =  manufacturers.size() -1; fillIndex < index;fillIndex++) {
		       manufacturers.add(null);
		    }
			manufacturers.set(index,
			   	   	new Manufacturers(this,beginManufacturers + index * Manufacturers.getManufacturersFieldLength()) 
				                        ); 	
		} 
   	   Manufacturers value = manufacturers.get(index);
   	   if (value == null) {
   	      manufacturers.set(index,
			   	   	new Manufacturers(this,beginManufacturers + index * Manufacturers.getManufacturersFieldLength()) 
				                        ); 
		  value = manufacturers.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Manufacturers at index with the passed value
	 *  Corresponding COBOL Variable is MANUFACTURERS
	 *  @param index
	 *	@param value
	 */
  public void setManufacturers(int index,char[] value) {
   	getManufacturers(index).setString(value);
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
               locations.add(newElement);
          }
     } else {
        if (locations.size() < LOCATIONS_SIZE) {
          // prefill it first
          for (int index = locations.size();index <  LOCATIONS_SIZE;index++) {
              Locations  newElement = new Locations(this,beginLocations + index * Locations.getLocationsFieldLength());
               locations.add(newElement);
          }
        }
        
     	for (int index = 0;index <  LOCATIONS_SIZE;index++) {
     		Locations locationsVar = locations.get(index);
 			if (locationsVar == null) {
                locationsVar = new Locations(this,beginLocations + index * Locations.getLocationsFieldLength());
                  locations.set(index, locationsVar);
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
               manufacturers.add(newElement);
          }
     } else {
        if (manufacturers.size() < MANUFACTURERS_SIZE) {
          // prefill it first
          for (int index = manufacturers.size();index <  MANUFACTURERS_SIZE;index++) {
              Manufacturers  newElement = new Manufacturers(this,beginManufacturers + index * Manufacturers.getManufacturersFieldLength());
               manufacturers.add(newElement);
          }
        }
        
     	for (int index = 0;index <  MANUFACTURERS_SIZE;index++) {
     		Manufacturers manufacturersVar = manufacturers.get(index);
 			if (manufacturersVar == null) {
                manufacturersVar = new Manufacturers(this,beginManufacturers + index * Manufacturers.getManufacturersFieldLength());
                  manufacturers.set(index, manufacturersVar);
			} 
			manufacturersVar.initialize();
		}
     }
   }

		public static int getDealersFieldLength() {
			return DEALERS_LENGTH;
		}

}
  
