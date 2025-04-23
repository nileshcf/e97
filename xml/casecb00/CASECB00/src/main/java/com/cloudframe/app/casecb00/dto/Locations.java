package com.cloudframe.app.casecb00.dto;

/**
*  The class Locations is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/


import com.cloudframe.app.casecb00.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Locations extends LocationsSerialized { 
   

						private char[] state = Field.fillLowValue(2);

						private char[] streetaddress = Field.fillLowValue(30);
	
	/**
	* Constructor for Locations
	**/
    public Locations() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Locations. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Locations(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of state
	 *	@return state
	 */
   public char[] getState() throws CFException{
     if (isStateModified()) { 
        state = refreshState();
     }
   		return state;
   }

  
	/**
	*  set variable state
	*  Corresponding COBOL Variable is STATE
	*  @param value
	**/
   public void setState(char[] value) {
      state = checkStateConstraints(value);
      serializeState(state);
   } 

     /**
	 * 	Update State 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setState(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginState,state.length);
   	
   }
   
   public void setState(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginState,state.length);
   	
   }
   
     /**
	 * 	Update State 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setState(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginState+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update State with another Field
	 *	@param value
	 */
   public void setState(Field source) {
       replace(source,0,source.length(),beginState,STATE_LEN);
   	
   }  
   
     /**
	 * 	Update State 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setState(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginState,STATE_LEN);
   	
   }
   
     /**
	 * 	Update State 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setState(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginState+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of streetaddress
	 *	@return streetaddress
	 */
   public char[] getStreetaddress() throws CFException{
     if (isStreetaddressModified()) { 
        streetaddress = refreshStreetaddress();
     }
   		return streetaddress;
   }

  
	/**
	*  set variable streetaddress
	*  Corresponding COBOL Variable is STREETADDRESS
	*  @param value
	**/
   public void setStreetaddress(char[] value) {
      streetaddress = checkStreetaddressConstraints(value);
      serializeStreetaddress(streetaddress);
   } 

     /**
	 * 	Update Streetaddress 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStreetaddress(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStreetaddress,streetaddress.length);
   	
   }
   
   public void setStreetaddress(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStreetaddress,streetaddress.length);
   	
   }
   
     /**
	 * 	Update Streetaddress 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStreetaddress(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStreetaddress+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Streetaddress with another Field
	 *	@param value
	 */
   public void setStreetaddress(Field source) {
       replace(source,0,source.length(),beginStreetaddress,STREETADDRESS_LEN);
   	
   }  
   
     /**
	 * 	Update Streetaddress 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStreetaddress(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStreetaddress,STREETADDRESS_LEN);
   	
   }
   
     /**
	 * 	Update Streetaddress 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStreetaddress(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStreetaddress+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Locations
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setState(CONSTANTS.SPACE_2);
         setStreetaddress(CONSTANTS.SPACE_30);
   }

		public static int getLocationsFieldLength() {
			return LOCATIONS_LENGTH;
		}

}
  
