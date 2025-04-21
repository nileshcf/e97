package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921ExprYear is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip82921ExprYear extends Ip82921ExprYearSerialized { 
   

						private char[] ip82921ExprCc = Field.fillLowValue(2);

						private char[] ip82921ExprYy = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip82921ExprYear
	**/
    public Ip82921ExprYear() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip82921ExprYear. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921ExprYear(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip82921ExprCc
	 *	@return ip82921ExprCc
	 */
   public char[] getIp82921ExprCc() throws CFException{
     if (isIp82921ExprCcModified()) { 
        ip82921ExprCc = refreshIp82921ExprCc();
     }
   		return ip82921ExprCc;
   }

  
	/**
	*  set variable ip82921ExprCc
	*  Corresponding COBOL Variable is IP82921-EXPR-CC
	*  @param value
	**/
   public void setIp82921ExprCc(char[] value) {
      ip82921ExprCc = checkIp82921ExprCcConstraints(value);
      serializeIp82921ExprCc(ip82921ExprCc);
   } 

     /**
	 * 	Update Ip82921ExprCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ExprCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921ExprCc,ip82921ExprCc.length);
   	
   }
   
   public void setIp82921ExprCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ExprCc,ip82921ExprCc.length);
   	
   }
   
     /**
	 * 	Update Ip82921ExprCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ExprCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ExprCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921ExprCc with another Field
	 *	@param value
	 */
   public void setIp82921ExprCc(Field source) {
       replace(source,0,source.length(),beginIp82921ExprCc,IP_82921_EXPR_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921ExprCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ExprCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921ExprCc,IP_82921_EXPR_CC_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921ExprCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ExprCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ExprCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921ExprYy
	 *	@return ip82921ExprYy
	 */
   public char[] getIp82921ExprYy() throws CFException{
     if (isIp82921ExprYyModified()) { 
        ip82921ExprYy = refreshIp82921ExprYy();
     }
   		return ip82921ExprYy;
   }

  
	/**
	*  set variable ip82921ExprYy
	*  Corresponding COBOL Variable is IP82921-EXPR-YY
	*  @param value
	**/
   public void setIp82921ExprYy(char[] value) {
      ip82921ExprYy = checkIp82921ExprYyConstraints(value);
      serializeIp82921ExprYy(ip82921ExprYy);
   } 

     /**
	 * 	Update Ip82921ExprYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ExprYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921ExprYy,ip82921ExprYy.length);
   	
   }
   
   public void setIp82921ExprYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ExprYy,ip82921ExprYy.length);
   	
   }
   
     /**
	 * 	Update Ip82921ExprYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ExprYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ExprYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921ExprYy with another Field
	 *	@param value
	 */
   public void setIp82921ExprYy(Field source) {
       replace(source,0,source.length(),beginIp82921ExprYy,IP_82921_EXPR_YY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921ExprYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ExprYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921ExprYy,IP_82921_EXPR_YY_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921ExprYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ExprYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ExprYy+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip82921ExprYear
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp82921ExprCc(CONSTANTS.SPACE_2);
         setIp82921ExprYy(CONSTANTS.SPACE_2);
   }

		public static int getIp82921ExprYearFieldLength() {
			return IP_82921_EXPR_YEAR_LENGTH;
		}

}
  
