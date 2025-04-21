package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50201ExprYear is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip50201ExprYear extends Ip50201ExprYearSerialized { 
   

						private char[] ip50201ExprCc = Field.fillLowValue(2);

						private char[] ip50201ExprYy = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50201ExprYear
	**/
    public Ip50201ExprYear() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50201ExprYear. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50201ExprYear(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip50201ExprCc
	 *	@return ip50201ExprCc
	 */
   public char[] getIp50201ExprCc() throws CFException{
     if (isIp50201ExprCcModified()) { 
        ip50201ExprCc = refreshIp50201ExprCc();
     }
   		return ip50201ExprCc;
   }

  
	/**
	*  set variable ip50201ExprCc
	*  Corresponding COBOL Variable is IP50201-EXPR-CC
	*  @param value
	**/
   public void setIp50201ExprCc(char[] value) {
      ip50201ExprCc = checkIp50201ExprCcConstraints(value);
      serializeIp50201ExprCc(ip50201ExprCc);
   } 

     /**
	 * 	Update Ip50201ExprCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201ExprCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50201ExprCc,ip50201ExprCc.length);
   	
   }
   
   public void setIp50201ExprCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ExprCc,ip50201ExprCc.length);
   	
   }
   
     /**
	 * 	Update Ip50201ExprCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ExprCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ExprCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50201ExprCc with another Field
	 *	@param value
	 */
   public void setIp50201ExprCc(Field source) {
       replace(source,0,source.length(),beginIp50201ExprCc,IP_50201_EXPR_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50201ExprCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201ExprCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50201ExprCc,IP_50201_EXPR_CC_LEN);
   	
   }
   
     /**
	 * 	Update Ip50201ExprCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ExprCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ExprCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50201ExprYy
	 *	@return ip50201ExprYy
	 */
   public char[] getIp50201ExprYy() throws CFException{
     if (isIp50201ExprYyModified()) { 
        ip50201ExprYy = refreshIp50201ExprYy();
     }
   		return ip50201ExprYy;
   }

  
	/**
	*  set variable ip50201ExprYy
	*  Corresponding COBOL Variable is IP50201-EXPR-YY
	*  @param value
	**/
   public void setIp50201ExprYy(char[] value) {
      ip50201ExprYy = checkIp50201ExprYyConstraints(value);
      serializeIp50201ExprYy(ip50201ExprYy);
   } 

     /**
	 * 	Update Ip50201ExprYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201ExprYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50201ExprYy,ip50201ExprYy.length);
   	
   }
   
   public void setIp50201ExprYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ExprYy,ip50201ExprYy.length);
   	
   }
   
     /**
	 * 	Update Ip50201ExprYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ExprYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ExprYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50201ExprYy with another Field
	 *	@param value
	 */
   public void setIp50201ExprYy(Field source) {
       replace(source,0,source.length(),beginIp50201ExprYy,IP_50201_EXPR_YY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50201ExprYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201ExprYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50201ExprYy,IP_50201_EXPR_YY_LEN);
   	
   }
   
     /**
	 * 	Update Ip50201ExprYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ExprYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ExprYy+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50201ExprYear
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50201ExprCc(CONSTANTS.SPACE_2);
         setIp50201ExprYy(CONSTANTS.SPACE_2);
   }

		public static int getIp50201ExprYearFieldLength() {
			return IP_50201_EXPR_YEAR_LENGTH;
		}

}
  
