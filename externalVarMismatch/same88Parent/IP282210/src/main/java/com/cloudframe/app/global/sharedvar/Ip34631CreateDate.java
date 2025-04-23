package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip34631CreateDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip34631CreateDate extends Ip34631CreateDateSerialized { 
   

						private char[] ip34631CreateCc = Field.fillLowValue(2);

						private char[] ip34631CreateYy = Field.fillLowValue(2);


						private char[] ip34631CreateMm = Field.fillLowValue(2);


						private char[] ip34631CreateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip34631CreateDate
	**/
    public Ip34631CreateDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip34631CreateDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip34631CreateDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip34631CreateCc
	 *	@return ip34631CreateCc
	 */
   public char[] getIp34631CreateCc() throws CFException{
     if (isIp34631CreateCcModified()) { 
        ip34631CreateCc = refreshIp34631CreateCc();
     }
   		return ip34631CreateCc;
   }

  
	/**
	*  set variable ip34631CreateCc
	*  Corresponding COBOL Variable is IP34631-CREATE-CC
	*  @param value
	**/
   public void setIp34631CreateCc(char[] value) {
      ip34631CreateCc = checkIp34631CreateCcConstraints(value);
      serializeIp34631CreateCc(ip34631CreateCc);
   } 

     /**
	 * 	Update Ip34631CreateCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34631CreateCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34631CreateCc,ip34631CreateCc.length);
   	
   }
   
   public void setIp34631CreateCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateCc,ip34631CreateCc.length);
   	
   }
   
     /**
	 * 	Update Ip34631CreateCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631CreateCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34631CreateCc with another Field
	 *	@param value
	 */
   public void setIp34631CreateCc(Field source) {
       replace(source,0,source.length(),beginIp34631CreateCc,IP_34631_CREATE_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34631CreateCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34631CreateCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34631CreateCc,IP_34631_CREATE_CC_LEN);
   	
   }
   
     /**
	 * 	Update Ip34631CreateCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631CreateCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip34631CreateYy
	 *	@return ip34631CreateYy
	 */
   public char[] getIp34631CreateYy() throws CFException{
     if (isIp34631CreateYyModified()) { 
        ip34631CreateYy = refreshIp34631CreateYy();
     }
   		return ip34631CreateYy;
   }

  
	/**
	*  set variable ip34631CreateYy
	*  Corresponding COBOL Variable is IP34631-CREATE-YY
	*  @param value
	**/
   public void setIp34631CreateYy(char[] value) {
      ip34631CreateYy = checkIp34631CreateYyConstraints(value);
      serializeIp34631CreateYy(ip34631CreateYy);
   } 

     /**
	 * 	Update Ip34631CreateYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34631CreateYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34631CreateYy,ip34631CreateYy.length);
   	
   }
   
   public void setIp34631CreateYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateYy,ip34631CreateYy.length);
   	
   }
   
     /**
	 * 	Update Ip34631CreateYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631CreateYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34631CreateYy with another Field
	 *	@param value
	 */
   public void setIp34631CreateYy(Field source) {
       replace(source,0,source.length(),beginIp34631CreateYy,IP_34631_CREATE_YY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34631CreateYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34631CreateYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34631CreateYy,IP_34631_CREATE_YY_LEN);
   	
   }
   
     /**
	 * 	Update Ip34631CreateYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631CreateYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateYy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip34631CreateMm
	 *	@return ip34631CreateMm
	 */
   public char[] getIp34631CreateMm() throws CFException{
     if (isIp34631CreateMmModified()) { 
        ip34631CreateMm = refreshIp34631CreateMm();
     }
   		return ip34631CreateMm;
   }

  
	/**
	*  set variable ip34631CreateMm
	*  Corresponding COBOL Variable is IP34631-CREATE-MM
	*  @param value
	**/
   public void setIp34631CreateMm(char[] value) {
      ip34631CreateMm = checkIp34631CreateMmConstraints(value);
      serializeIp34631CreateMm(ip34631CreateMm);
   } 

     /**
	 * 	Update Ip34631CreateMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34631CreateMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34631CreateMm,ip34631CreateMm.length);
   	
   }
   
   public void setIp34631CreateMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateMm,ip34631CreateMm.length);
   	
   }
   
     /**
	 * 	Update Ip34631CreateMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631CreateMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34631CreateMm with another Field
	 *	@param value
	 */
   public void setIp34631CreateMm(Field source) {
       replace(source,0,source.length(),beginIp34631CreateMm,IP_34631_CREATE_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34631CreateMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34631CreateMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34631CreateMm,IP_34631_CREATE_MM_LEN);
   	
   }
   
     /**
	 * 	Update Ip34631CreateMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631CreateMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip34631CreateDd
	 *	@return ip34631CreateDd
	 */
   public char[] getIp34631CreateDd() throws CFException{
     if (isIp34631CreateDdModified()) { 
        ip34631CreateDd = refreshIp34631CreateDd();
     }
   		return ip34631CreateDd;
   }

  
	/**
	*  set variable ip34631CreateDd
	*  Corresponding COBOL Variable is IP34631-CREATE-DD
	*  @param value
	**/
   public void setIp34631CreateDd(char[] value) {
      ip34631CreateDd = checkIp34631CreateDdConstraints(value);
      serializeIp34631CreateDd(ip34631CreateDd);
   } 

     /**
	 * 	Update Ip34631CreateDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34631CreateDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34631CreateDd,ip34631CreateDd.length);
   	
   }
   
   public void setIp34631CreateDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateDd,ip34631CreateDd.length);
   	
   }
   
     /**
	 * 	Update Ip34631CreateDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631CreateDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34631CreateDd with another Field
	 *	@param value
	 */
   public void setIp34631CreateDd(Field source) {
       replace(source,0,source.length(),beginIp34631CreateDd,IP_34631_CREATE_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34631CreateDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34631CreateDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34631CreateDd,IP_34631_CREATE_DD_LEN);
   	
   }
   
     /**
	 * 	Update Ip34631CreateDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631CreateDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateDd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip34631CreateDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp34631CreateCc(CONSTANTS.SPACE_2);
         setIp34631CreateYy(CONSTANTS.SPACE_2);
         setIp34631CreateMm(CONSTANTS.SPACE_2);
         setIp34631CreateDd(CONSTANTS.SPACE_2);
   }

		public static int getIp34631CreateDateFieldLength() {
			return IP_34631_CREATE_DATE_LENGTH;
		}

}
  
