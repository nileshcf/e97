package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040RegionSubreg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0040RegionSubreg extends Ip0040RegionSubregSerialized { 
   

						private char[] ip0040Region = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip0040RegionSubreg
	**/
    public Ip0040RegionSubreg() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040RegionSubreg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040RegionSubreg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0040Region
	 *	@return ip0040Region
	 */
   public char[] getIp0040Region() throws CFException{
     if (isIp0040RegionModified()) { 
        ip0040Region = refreshIp0040Region();
     }
   		return ip0040Region;
   }

  
	/**
	*  set variable ip0040Region
	*  Corresponding COBOL Variable is IP0040-REGION
	*  @param value
	**/
   public void setIp0040Region(char[] value) {
      ip0040Region = checkIp0040RegionConstraints(value);
      serializeIp0040Region(ip0040Region);
   } 

     /**
	 * 	Update Ip0040Region 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040Region(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040Region,ip0040Region.length);
   	
   }
   
   public void setIp0040Region(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040Region,ip0040Region.length);
   	
   }
   
     /**
	 * 	Update Ip0040Region 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040Region(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040Region+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040Region with another Field
	 *	@param value
	 */
   public void setIp0040Region(Field source) {
       replace(source,0,source.length(),beginIp0040Region,IP_0040_REGION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040Region 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040Region(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040Region,IP_0040_REGION_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040Region 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040Region(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040Region+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip0040RegionSubreg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0040Region(CONSTANTS.SPACE);
   }

		public static int getIp0040RegionSubregFieldLength() {
			return IP_0040_REGION_SUBREG_LENGTH;
		}

}
  
