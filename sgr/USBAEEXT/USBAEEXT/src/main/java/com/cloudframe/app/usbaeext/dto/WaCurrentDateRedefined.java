package com.cloudframe.app.usbaeext.dto;

/**
*  The class WaCurrentDateRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.usbaeext.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WaCurrentDateRedefined extends WaCurrentDateRedefinedSerialized { 
   

						private char[] waCdYyyy = Field.fillLowValue(4);

						private char[] waCdMm = Field.fillLowValue(2);

						private char[] waCdDd = Field.fillLowValue(2);
	
	/**
	* Constructor for WaCurrentDateRedefined
	**/
    public WaCurrentDateRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WaCurrentDateRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WaCurrentDateRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of waCdYyyy
	 *	@return waCdYyyy
	 */
   public char[] getWaCdYyyy() throws CFException{
     if (isWaCdYyyyModified()) { 
        waCdYyyy = refreshWaCdYyyy();
     }
   		return waCdYyyy;
   }

  
	/**
	*  set variable waCdYyyy
	*  Corresponding COBOL Variable is WA-CD-YYYY
	*  @param value
	**/
   public void setWaCdYyyy(char[] value) {
      waCdYyyy = checkWaCdYyyyConstraints(value);
      serializeWaCdYyyy(waCdYyyy);
   } 

     /**
	 * 	Update WaCdYyyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaCdYyyy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaCdYyyy,waCdYyyy.length);
   	
   }
   
   public void setWaCdYyyy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaCdYyyy,waCdYyyy.length);
   	
   }
   
     /**
	 * 	Update WaCdYyyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaCdYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaCdYyyy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaCdYyyy with another Field
	 *	@param value
	 */
   public void setWaCdYyyy(Field source) {
       replace(source,0,source.length(),beginWaCdYyyy,WA_CD_YYYY_LEN);
   	
   }  
   
     /**
	 * 	Update WaCdYyyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaCdYyyy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaCdYyyy,WA_CD_YYYY_LEN);
   	
   }
   
     /**
	 * 	Update WaCdYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaCdYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaCdYyyy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of waCdMm
	 *	@return waCdMm
	 */
   public char[] getWaCdMm() throws CFException{
     if (isWaCdMmModified()) { 
        waCdMm = refreshWaCdMm();
     }
   		return waCdMm;
   }

  
	/**
	*  set variable waCdMm
	*  Corresponding COBOL Variable is WA-CD-MM
	*  @param value
	**/
   public void setWaCdMm(char[] value) {
      waCdMm = checkWaCdMmConstraints(value);
      serializeWaCdMm(waCdMm);
   } 

     /**
	 * 	Update WaCdMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaCdMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaCdMm,waCdMm.length);
   	
   }
   
   public void setWaCdMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaCdMm,waCdMm.length);
   	
   }
   
     /**
	 * 	Update WaCdMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaCdMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaCdMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaCdMm with another Field
	 *	@param value
	 */
   public void setWaCdMm(Field source) {
       replace(source,0,source.length(),beginWaCdMm,WA_CD_MM_LEN);
   	
   }  
   
     /**
	 * 	Update WaCdMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaCdMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaCdMm,WA_CD_MM_LEN);
   	
   }
   
     /**
	 * 	Update WaCdMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaCdMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaCdMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of waCdDd
	 *	@return waCdDd
	 */
   public char[] getWaCdDd() throws CFException{
     if (isWaCdDdModified()) { 
        waCdDd = refreshWaCdDd();
     }
   		return waCdDd;
   }

  
	/**
	*  set variable waCdDd
	*  Corresponding COBOL Variable is WA-CD-DD
	*  @param value
	**/
   public void setWaCdDd(char[] value) {
      waCdDd = checkWaCdDdConstraints(value);
      serializeWaCdDd(waCdDd);
   } 

     /**
	 * 	Update WaCdDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaCdDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaCdDd,waCdDd.length);
   	
   }
   
   public void setWaCdDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaCdDd,waCdDd.length);
   	
   }
   
     /**
	 * 	Update WaCdDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaCdDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaCdDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaCdDd with another Field
	 *	@param value
	 */
   public void setWaCdDd(Field source) {
       replace(source,0,source.length(),beginWaCdDd,WA_CD_DD_LEN);
   	
   }  
   
     /**
	 * 	Update WaCdDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaCdDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaCdDd,WA_CD_DD_LEN);
   	
   }
   
     /**
	 * 	Update WaCdDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaCdDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaCdDd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWaCurrentDateRedefinedFieldLength() {
			return WA_CURRENT_DATE_REDEFINED_LENGTH;
		}

}
  
