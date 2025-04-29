package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404RegionSubreg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00404RegionSubreg extends Ip00404RegionSubregSerialized { 
   

						private char[] ip00404Region = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00404RegionSubreg
	**/
    public Ip00404RegionSubreg() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00404RegionSubreg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404RegionSubreg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00404Region
	 *	@return ip00404Region
	 */
   public char[] getIp00404Region() throws CFException{
     if (isIp00404RegionModified()) { 
        ip00404Region = refreshIp00404Region();
     }
   		return ip00404Region;
   }

  
	/**
	*  set variable ip00404Region
	*  Corresponding COBOL Variable is IP00404-REGION
	*  @param value
	**/
   public void setIp00404Region(char[] value) {
      ip00404Region = checkIp00404RegionConstraints(value);
      serializeIp00404Region(ip00404Region);
   } 

     /**
	 * 	Update Ip00404Region 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404Region(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404Region,ip00404Region.length);
   	
   }
   
   public void setIp00404Region(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Region,ip00404Region.length);
   	
   }
   
     /**
	 * 	Update Ip00404Region 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Region(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Region+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404Region with another Field
	 *	@param value
	 */
   public void setIp00404Region(Field source) {
       replace(source,0,source.length(),beginIp00404Region,IP_00404_REGION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404Region 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404Region(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404Region,IP_00404_REGION_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404Region 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Region(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Region+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00404RegionSubreg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00404Region(CONSTANTS.SPACE);
   }

		public static int getIp00404RegionSubregFieldLength() {
			return IP_00404_REGION_SUBREG_LENGTH;
		}

}
  
