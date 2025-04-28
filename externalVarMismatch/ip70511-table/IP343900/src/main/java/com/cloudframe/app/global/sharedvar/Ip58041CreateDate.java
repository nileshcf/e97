package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip58041CreateDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip58041CreateDate extends Ip58041CreateDateSerialized { 
   

						private char[] ip58041CreateCc = Field.fillLowValue(2);

						private char[] ip58041CreateYy = Field.fillLowValue(2);


						private char[] ip58041CreateMm = Field.fillLowValue(2);


						private char[] ip58041CreateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip58041CreateDate
	**/
    public Ip58041CreateDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip58041CreateDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip58041CreateDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip58041CreateCc
	 *	@return ip58041CreateCc
	 */
   public char[] getIp58041CreateCc() throws CFException{
     if (isIp58041CreateCcModified()) { 
        ip58041CreateCc = refreshIp58041CreateCc();
     }
   		return ip58041CreateCc;
   }

  
	/**
	*  set variable ip58041CreateCc
	*  Corresponding COBOL Variable is IP58041-CREATE-CC
	*  @param value
	**/
   public void setIp58041CreateCc(char[] value) {
      ip58041CreateCc = checkIp58041CreateCcConstraints(value);
      serializeIp58041CreateCc(ip58041CreateCc);
   } 

     /**
	 * 	Update Ip58041CreateCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041CreateCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041CreateCc,ip58041CreateCc.length);
   	
   }
   
   public void setIp58041CreateCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateCc,ip58041CreateCc.length);
   	
   }
   
     /**
	 * 	Update Ip58041CreateCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041CreateCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041CreateCc with another Field
	 *	@param value
	 */
   public void setIp58041CreateCc(Field source) {
       replace(source,0,source.length(),beginIp58041CreateCc,IP_58041_CREATE_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041CreateCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041CreateCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041CreateCc,IP_58041_CREATE_CC_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041CreateCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041CreateCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip58041CreateYy
	 *	@return ip58041CreateYy
	 */
   public char[] getIp58041CreateYy() throws CFException{
     if (isIp58041CreateYyModified()) { 
        ip58041CreateYy = refreshIp58041CreateYy();
     }
   		return ip58041CreateYy;
   }

  
	/**
	*  set variable ip58041CreateYy
	*  Corresponding COBOL Variable is IP58041-CREATE-YY
	*  @param value
	**/
   public void setIp58041CreateYy(char[] value) {
      ip58041CreateYy = checkIp58041CreateYyConstraints(value);
      serializeIp58041CreateYy(ip58041CreateYy);
   } 

     /**
	 * 	Update Ip58041CreateYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041CreateYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041CreateYy,ip58041CreateYy.length);
   	
   }
   
   public void setIp58041CreateYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateYy,ip58041CreateYy.length);
   	
   }
   
     /**
	 * 	Update Ip58041CreateYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041CreateYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041CreateYy with another Field
	 *	@param value
	 */
   public void setIp58041CreateYy(Field source) {
       replace(source,0,source.length(),beginIp58041CreateYy,IP_58041_CREATE_YY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041CreateYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041CreateYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041CreateYy,IP_58041_CREATE_YY_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041CreateYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041CreateYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateYy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip58041CreateMm
	 *	@return ip58041CreateMm
	 */
   public char[] getIp58041CreateMm() throws CFException{
     if (isIp58041CreateMmModified()) { 
        ip58041CreateMm = refreshIp58041CreateMm();
     }
   		return ip58041CreateMm;
   }

  
	/**
	*  set variable ip58041CreateMm
	*  Corresponding COBOL Variable is IP58041-CREATE-MM
	*  @param value
	**/
   public void setIp58041CreateMm(char[] value) {
      ip58041CreateMm = checkIp58041CreateMmConstraints(value);
      serializeIp58041CreateMm(ip58041CreateMm);
   } 

     /**
	 * 	Update Ip58041CreateMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041CreateMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041CreateMm,ip58041CreateMm.length);
   	
   }
   
   public void setIp58041CreateMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateMm,ip58041CreateMm.length);
   	
   }
   
     /**
	 * 	Update Ip58041CreateMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041CreateMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041CreateMm with another Field
	 *	@param value
	 */
   public void setIp58041CreateMm(Field source) {
       replace(source,0,source.length(),beginIp58041CreateMm,IP_58041_CREATE_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041CreateMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041CreateMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041CreateMm,IP_58041_CREATE_MM_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041CreateMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041CreateMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip58041CreateDd
	 *	@return ip58041CreateDd
	 */
   public char[] getIp58041CreateDd() throws CFException{
     if (isIp58041CreateDdModified()) { 
        ip58041CreateDd = refreshIp58041CreateDd();
     }
   		return ip58041CreateDd;
   }

  
	/**
	*  set variable ip58041CreateDd
	*  Corresponding COBOL Variable is IP58041-CREATE-DD
	*  @param value
	**/
   public void setIp58041CreateDd(char[] value) {
      ip58041CreateDd = checkIp58041CreateDdConstraints(value);
      serializeIp58041CreateDd(ip58041CreateDd);
   } 

     /**
	 * 	Update Ip58041CreateDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041CreateDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041CreateDd,ip58041CreateDd.length);
   	
   }
   
   public void setIp58041CreateDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateDd,ip58041CreateDd.length);
   	
   }
   
     /**
	 * 	Update Ip58041CreateDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041CreateDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041CreateDd with another Field
	 *	@param value
	 */
   public void setIp58041CreateDd(Field source) {
       replace(source,0,source.length(),beginIp58041CreateDd,IP_58041_CREATE_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041CreateDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041CreateDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041CreateDd,IP_58041_CREATE_DD_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041CreateDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041CreateDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateDd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip58041CreateDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp58041CreateCc(CONSTANTS.SPACE_2);
         setIp58041CreateYy(CONSTANTS.SPACE_2);
         setIp58041CreateMm(CONSTANTS.SPACE_2);
         setIp58041CreateDd(CONSTANTS.SPACE_2);
   }

		public static int getIp58041CreateDateFieldLength() {
			return IP_58041_CREATE_DATE_LENGTH;
		}

}
  
