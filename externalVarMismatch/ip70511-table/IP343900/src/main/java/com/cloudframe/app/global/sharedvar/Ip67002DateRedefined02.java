package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002DateRedefined02 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip67002DateRedefined02 extends Ip67002DateRedefined02Serialized { 
   


						private char[] ip67002Yymmdd = Field.fillLowValue(6);
	
	/**
	* Constructor for Ip67002DateRedefined02
	**/
    public Ip67002DateRedefined02() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002DateRedefined02. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002DateRedefined02(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip67002Yymmdd
	 *	@return ip67002Yymmdd
	 */
   public char[] getIp67002Yymmdd() throws CFException{
     if (isIp67002YymmddModified()) { 
        ip67002Yymmdd = refreshIp67002Yymmdd();
     }
   		return ip67002Yymmdd;
   }

  
	/**
	*  set variable ip67002Yymmdd
	*  Corresponding COBOL Variable is IP67002-YYMMDD
	*  @param value
	**/
   public void setIp67002Yymmdd(char[] value) {
      ip67002Yymmdd = checkIp67002YymmddConstraints(value);
      serializeIp67002Yymmdd(ip67002Yymmdd);
   } 

     /**
	 * 	Update Ip67002Yymmdd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp67002Yymmdd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp67002Yymmdd,ip67002Yymmdd.length);
   	
   }
   
   public void setIp67002Yymmdd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp67002Yymmdd,ip67002Yymmdd.length);
   	
   }
   
     /**
	 * 	Update Ip67002Yymmdd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Yymmdd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp67002Yymmdd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip67002Yymmdd with another Field
	 *	@param value
	 */
   public void setIp67002Yymmdd(Field source) {
       replace(source,0,source.length(),beginIp67002Yymmdd,IP_67002_YYMMDD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip67002Yymmdd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp67002Yymmdd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp67002Yymmdd,IP_67002_YYMMDD_LEN);
   	
   }
   
     /**
	 * 	Update Ip67002Yymmdd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Yymmdd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp67002Yymmdd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip67002DateRedefined02
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp67002Yymmdd(CONSTANTS.SPACE_6);
   }

		public static int getIp67002DateRedefined02FieldLength() {
			return IP_67002_DATE_REDEFINED_02_LENGTH;
		}

}
  
