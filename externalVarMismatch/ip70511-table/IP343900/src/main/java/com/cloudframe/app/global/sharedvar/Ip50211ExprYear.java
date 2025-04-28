package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50211ExprYear is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip50211ExprYear extends Ip50211ExprYearSerialized { 
   

						private char[] ip50211ExprCc = Field.fillLowValue(2);

						private char[] ip50211ExprYy = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50211ExprYear
	**/
    public Ip50211ExprYear() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50211ExprYear. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211ExprYear(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip50211ExprCc
	 *	@return ip50211ExprCc
	 */
   public char[] getIp50211ExprCc() throws CFException{
     if (isIp50211ExprCcModified()) { 
        ip50211ExprCc = refreshIp50211ExprCc();
     }
   		return ip50211ExprCc;
   }

  
	/**
	*  set variable ip50211ExprCc
	*  Corresponding COBOL Variable is IP50211-EXPR-CC
	*  @param value
	**/
   public void setIp50211ExprCc(char[] value) {
      ip50211ExprCc = checkIp50211ExprCcConstraints(value);
      serializeIp50211ExprCc(ip50211ExprCc);
   } 

     /**
	 * 	Update Ip50211ExprCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211ExprCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211ExprCc,ip50211ExprCc.length);
   	
   }
   
   public void setIp50211ExprCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ExprCc,ip50211ExprCc.length);
   	
   }
   
     /**
	 * 	Update Ip50211ExprCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ExprCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ExprCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211ExprCc with another Field
	 *	@param value
	 */
   public void setIp50211ExprCc(Field source) {
       replace(source,0,source.length(),beginIp50211ExprCc,IP_50211_EXPR_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211ExprCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211ExprCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211ExprCc,IP_50211_EXPR_CC_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211ExprCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ExprCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ExprCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211ExprYy
	 *	@return ip50211ExprYy
	 */
   public char[] getIp50211ExprYy() throws CFException{
     if (isIp50211ExprYyModified()) { 
        ip50211ExprYy = refreshIp50211ExprYy();
     }
   		return ip50211ExprYy;
   }

  
	/**
	*  set variable ip50211ExprYy
	*  Corresponding COBOL Variable is IP50211-EXPR-YY
	*  @param value
	**/
   public void setIp50211ExprYy(char[] value) {
      ip50211ExprYy = checkIp50211ExprYyConstraints(value);
      serializeIp50211ExprYy(ip50211ExprYy);
   } 

     /**
	 * 	Update Ip50211ExprYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211ExprYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211ExprYy,ip50211ExprYy.length);
   	
   }
   
   public void setIp50211ExprYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ExprYy,ip50211ExprYy.length);
   	
   }
   
     /**
	 * 	Update Ip50211ExprYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ExprYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ExprYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211ExprYy with another Field
	 *	@param value
	 */
   public void setIp50211ExprYy(Field source) {
       replace(source,0,source.length(),beginIp50211ExprYy,IP_50211_EXPR_YY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211ExprYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211ExprYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211ExprYy,IP_50211_EXPR_YY_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211ExprYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ExprYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ExprYy+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50211ExprYear
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50211ExprCc(CONSTANTS.SPACE_2);
         setIp50211ExprYy(CONSTANTS.SPACE_2);
   }

		public static int getIp50211ExprYearFieldLength() {
			return IP_50211_EXPR_YEAR_LENGTH;
		}

}
  
