package com.cloudframe.app.ip662010.dto;

/**
*  The class CarrierTooShortValuesGroup600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CarrierTooShortValuesGroup600 extends CarrierTooShortValuesGroup600Serialized {
   
					private CarrierTooShortValues600 carrierTooShortValues600 = new CarrierTooShortValues600();
					private CarrierTooShortCodes600 carrierTooShortCodes600 = new CarrierTooShortCodes600();
	
	/**
	* Constructor for CarrierTooShortValuesGroup600
	**/
    public CarrierTooShortValuesGroup600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			carrierTooShortValues600.setParent(this,getStartOffset() + 0);
	       			carrierTooShortCodes600.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of carrierTooShortValues600
	 *	@return carrierTooShortValues600
	 */   
	 public CarrierTooShortValues600 getCarrierTooShortValues600() {
   	return carrierTooShortValues600;
   }
   /**
	* 	Update CarrierTooShortValues600 with the passed value
	*   Corresponding COBOL Variable is 600-CARRIER-TOO-SHORT-VALUES
	*	@param value
	*/
   public void setCarrierTooShortValues600(char[] value) {
      carrierTooShortValues600.setString(value); 
   }   
    
     /**
	 * 	Update CarrierTooShortValues600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCarrierTooShortValues600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,carrierTooShortValues600.begin,carrierTooShortValues600.length());
   }
   
     /**
	 * 	Update CarrierTooShortValues600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCarrierTooShortValues600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,carrierTooShortValues600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CarrierTooShortValues600 with another Field
	 *	@param value
	 */
   public void setCarrierTooShortValues600(Field source) {
   	replace(source,0,source.length(),carrierTooShortValues600.begin,carrierTooShortValues600.length());
   }  
   
     /**
	 * 	Update CarrierTooShortValues600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCarrierTooShortValues600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,carrierTooShortValues600.begin,carrierTooShortValues600.length());
   }
   
     /**
	 * 	Update CarrierTooShortValues600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCarrierTooShortValues600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,carrierTooShortValues600.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of carrierTooShortCodes600
	 *	@return carrierTooShortCodes600
	 */   
	 public CarrierTooShortCodes600 getCarrierTooShortCodes600() {
   	return carrierTooShortCodes600;
   }
   /**
	* 	Update CarrierTooShortCodes600 with the passed value
	*   Corresponding COBOL Variable is 600-CARRIER-TOO-SHORT-CODES
	*	@param value
	*/
   public void setCarrierTooShortCodes600(char[] value) {
      carrierTooShortCodes600.setString(value); 
   }   
    
     /**
	 * 	Update CarrierTooShortCodes600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCarrierTooShortCodes600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,carrierTooShortCodes600.begin,carrierTooShortCodes600.length());
   }
   
     /**
	 * 	Update CarrierTooShortCodes600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCarrierTooShortCodes600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,carrierTooShortCodes600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CarrierTooShortCodes600 with another Field
	 *	@param value
	 */
   public void setCarrierTooShortCodes600(Field source) {
   	replace(source,0,source.length(),carrierTooShortCodes600.begin,carrierTooShortCodes600.length());
   }  
   
     /**
	 * 	Update CarrierTooShortCodes600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCarrierTooShortCodes600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,carrierTooShortCodes600.begin,carrierTooShortCodes600.length());
   }
   
     /**
	 * 	Update CarrierTooShortCodes600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCarrierTooShortCodes600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,carrierTooShortCodes600.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCarrierTooShortValuesGroup600FieldLength() {
			return CARRIER_TOO_SHORT_VALUES_GROUP_600_LENGTH;
		}

}
  
