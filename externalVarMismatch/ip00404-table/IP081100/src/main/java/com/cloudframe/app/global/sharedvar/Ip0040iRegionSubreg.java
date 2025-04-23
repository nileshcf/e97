package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iRegionSubreg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0040iRegionSubreg extends Ip0040iRegionSubregSerialized { 
   

						private char[] ip0040iRegion = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip0040iRegionSubreg
	**/
    public Ip0040iRegionSubreg() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040iRegionSubreg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iRegionSubreg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0040iRegion
	 *	@return ip0040iRegion
	 */
   public char[] getIp0040iRegion() throws CFException{
     if (isIp0040iRegionModified()) { 
        ip0040iRegion = refreshIp0040iRegion();
     }
   		return ip0040iRegion;
   }

  
	/**
	*  set variable ip0040iRegion
	*  Corresponding COBOL Variable is IP0040I-REGION
	*  @param value
	**/
   public void setIp0040iRegion(char[] value) {
      ip0040iRegion = checkIp0040iRegionConstraints(value);
      serializeIp0040iRegion(ip0040iRegion);
   } 

     /**
	 * 	Update Ip0040iRegion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iRegion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iRegion,ip0040iRegion.length);
   	
   }
   
   public void setIp0040iRegion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRegion,ip0040iRegion.length);
   	
   }
   
     /**
	 * 	Update Ip0040iRegion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRegion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRegion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iRegion with another Field
	 *	@param value
	 */
   public void setIp0040iRegion(Field source) {
       replace(source,0,source.length(),beginIp0040iRegion,IP_0040I_REGION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iRegion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iRegion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iRegion,IP_0040I_REGION_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iRegion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRegion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRegion+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip0040iRegionSubreg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0040iRegion(CONSTANTS.SPACE);
   }

		public static int getIp0040iRegionSubregFieldLength() {
			return IP_0040I_REGION_SUBREG_LENGTH;
		}

}
  
