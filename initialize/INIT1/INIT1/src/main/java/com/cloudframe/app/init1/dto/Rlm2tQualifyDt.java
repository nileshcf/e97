package com.cloudframe.app.init1.dto;

/**
*  The class Rlm2tQualifyDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Rlm2tQualifyDt extends Rlm2tQualifyDtSerialized { 
   

						private char[] rlm2tQualifyMm = Field.fillLowValue(2);


						private char[] rlm2tQualifyDd = Field.fillLowValue(2);


						private char[] rlm2tQualifyYyyy = Field.fillLowValue(4);
	
	/**
	* Constructor for Rlm2tQualifyDt
	**/
    public Rlm2tQualifyDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rlm2tQualifyDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlm2tQualifyDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlm2tQualifyMm
	 *	@return rlm2tQualifyMm
	 */
   public char[] getRlm2tQualifyMm() throws CFException{
     if (isRlm2tQualifyMmModified()) { 
        rlm2tQualifyMm = refreshRlm2tQualifyMm();
     }
   		return rlm2tQualifyMm;
   }

  
	/**
	*  set variable rlm2tQualifyMm
	*  Corresponding COBOL Variable is RLM2T-QUALIFY-MM
	*  @param value
	**/
   public void setRlm2tQualifyMm(char[] value) {
      rlm2tQualifyMm = checkRlm2tQualifyMmConstraints(value);
      serializeRlm2tQualifyMm(rlm2tQualifyMm);
   } 

     /**
	 * 	Update Rlm2tQualifyMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tQualifyMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tQualifyMm,rlm2tQualifyMm.length);
   	
   }
   
   public void setRlm2tQualifyMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tQualifyMm,rlm2tQualifyMm.length);
   	
   }
   
     /**
	 * 	Update Rlm2tQualifyMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tQualifyMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tQualifyMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tQualifyMm with another Field
	 *	@param value
	 */
   public void setRlm2tQualifyMm(Field source) {
       replace(source,0,source.length(),beginRlm2tQualifyMm,RLM_2T_QUALIFY_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tQualifyMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tQualifyMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tQualifyMm,RLM_2T_QUALIFY_MM_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tQualifyMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tQualifyMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tQualifyMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tQualifyDd
	 *	@return rlm2tQualifyDd
	 */
   public char[] getRlm2tQualifyDd() throws CFException{
     if (isRlm2tQualifyDdModified()) { 
        rlm2tQualifyDd = refreshRlm2tQualifyDd();
     }
   		return rlm2tQualifyDd;
   }

  
	/**
	*  set variable rlm2tQualifyDd
	*  Corresponding COBOL Variable is RLM2T-QUALIFY-DD
	*  @param value
	**/
   public void setRlm2tQualifyDd(char[] value) {
      rlm2tQualifyDd = checkRlm2tQualifyDdConstraints(value);
      serializeRlm2tQualifyDd(rlm2tQualifyDd);
   } 

     /**
	 * 	Update Rlm2tQualifyDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tQualifyDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tQualifyDd,rlm2tQualifyDd.length);
   	
   }
   
   public void setRlm2tQualifyDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tQualifyDd,rlm2tQualifyDd.length);
   	
   }
   
     /**
	 * 	Update Rlm2tQualifyDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tQualifyDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tQualifyDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tQualifyDd with another Field
	 *	@param value
	 */
   public void setRlm2tQualifyDd(Field source) {
       replace(source,0,source.length(),beginRlm2tQualifyDd,RLM_2T_QUALIFY_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tQualifyDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tQualifyDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tQualifyDd,RLM_2T_QUALIFY_DD_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tQualifyDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tQualifyDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tQualifyDd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tQualifyYyyy
	 *	@return rlm2tQualifyYyyy
	 */
   public char[] getRlm2tQualifyYyyy() throws CFException{
     if (isRlm2tQualifyYyyyModified()) { 
        rlm2tQualifyYyyy = refreshRlm2tQualifyYyyy();
     }
   		return rlm2tQualifyYyyy;
   }

  
	/**
	*  set variable rlm2tQualifyYyyy
	*  Corresponding COBOL Variable is RLM2T-QUALIFY-YYYY
	*  @param value
	**/
   public void setRlm2tQualifyYyyy(char[] value) {
      rlm2tQualifyYyyy = checkRlm2tQualifyYyyyConstraints(value);
      serializeRlm2tQualifyYyyy(rlm2tQualifyYyyy);
   } 

     /**
	 * 	Update Rlm2tQualifyYyyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tQualifyYyyy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tQualifyYyyy,rlm2tQualifyYyyy.length);
   	
   }
   
   public void setRlm2tQualifyYyyy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tQualifyYyyy,rlm2tQualifyYyyy.length);
   	
   }
   
     /**
	 * 	Update Rlm2tQualifyYyyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tQualifyYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tQualifyYyyy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tQualifyYyyy with another Field
	 *	@param value
	 */
   public void setRlm2tQualifyYyyy(Field source) {
       replace(source,0,source.length(),beginRlm2tQualifyYyyy,RLM_2T_QUALIFY_YYYY_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tQualifyYyyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tQualifyYyyy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tQualifyYyyy,RLM_2T_QUALIFY_YYYY_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tQualifyYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tQualifyYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tQualifyYyyy+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Rlm2tQualifyDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRlm2tQualifyMm(CONSTANTS.SPACE_2);
         setRlm2tQualifyDd(CONSTANTS.SPACE_2);
         setRlm2tQualifyYyyy(CONSTANTS.SPACE_4);
   }

		public static int getRlm2tQualifyDtFieldLength() {
			return RLM_2T_QUALIFY_DT_LENGTH;
		}

}
  
