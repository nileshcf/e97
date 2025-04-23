package com.cloudframe.app.init1.dto;

/**
*  The class Rlm2tEndDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Rlm2tEndDt extends Rlm2tEndDtSerialized { 
   

						private char[] rlm2tEndMm = Field.fillLowValue(2);


						private char[] rlm2tEndDd = Field.fillLowValue(2);


						private char[] rlm2tEndYyyy = Field.fillLowValue(4);
	
	/**
	* Constructor for Rlm2tEndDt
	**/
    public Rlm2tEndDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rlm2tEndDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlm2tEndDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlm2tEndMm
	 *	@return rlm2tEndMm
	 */
   public char[] getRlm2tEndMm() throws CFException{
     if (isRlm2tEndMmModified()) { 
        rlm2tEndMm = refreshRlm2tEndMm();
     }
   		return rlm2tEndMm;
   }

  
	/**
	*  set variable rlm2tEndMm
	*  Corresponding COBOL Variable is RLM2T-END-MM
	*  @param value
	**/
   public void setRlm2tEndMm(char[] value) {
      rlm2tEndMm = checkRlm2tEndMmConstraints(value);
      serializeRlm2tEndMm(rlm2tEndMm);
   } 

     /**
	 * 	Update Rlm2tEndMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tEndMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tEndMm,rlm2tEndMm.length);
   	
   }
   
   public void setRlm2tEndMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tEndMm,rlm2tEndMm.length);
   	
   }
   
     /**
	 * 	Update Rlm2tEndMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tEndMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tEndMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tEndMm with another Field
	 *	@param value
	 */
   public void setRlm2tEndMm(Field source) {
       replace(source,0,source.length(),beginRlm2tEndMm,RLM_2T_END_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tEndMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tEndMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tEndMm,RLM_2T_END_MM_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tEndMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tEndMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tEndMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tEndDd
	 *	@return rlm2tEndDd
	 */
   public char[] getRlm2tEndDd() throws CFException{
     if (isRlm2tEndDdModified()) { 
        rlm2tEndDd = refreshRlm2tEndDd();
     }
   		return rlm2tEndDd;
   }

  
	/**
	*  set variable rlm2tEndDd
	*  Corresponding COBOL Variable is RLM2T-END-DD
	*  @param value
	**/
   public void setRlm2tEndDd(char[] value) {
      rlm2tEndDd = checkRlm2tEndDdConstraints(value);
      serializeRlm2tEndDd(rlm2tEndDd);
   } 

     /**
	 * 	Update Rlm2tEndDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tEndDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tEndDd,rlm2tEndDd.length);
   	
   }
   
   public void setRlm2tEndDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tEndDd,rlm2tEndDd.length);
   	
   }
   
     /**
	 * 	Update Rlm2tEndDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tEndDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tEndDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tEndDd with another Field
	 *	@param value
	 */
   public void setRlm2tEndDd(Field source) {
       replace(source,0,source.length(),beginRlm2tEndDd,RLM_2T_END_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tEndDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tEndDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tEndDd,RLM_2T_END_DD_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tEndDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tEndDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tEndDd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tEndYyyy
	 *	@return rlm2tEndYyyy
	 */
   public char[] getRlm2tEndYyyy() throws CFException{
     if (isRlm2tEndYyyyModified()) { 
        rlm2tEndYyyy = refreshRlm2tEndYyyy();
     }
   		return rlm2tEndYyyy;
   }

  
	/**
	*  set variable rlm2tEndYyyy
	*  Corresponding COBOL Variable is RLM2T-END-YYYY
	*  @param value
	**/
   public void setRlm2tEndYyyy(char[] value) {
      rlm2tEndYyyy = checkRlm2tEndYyyyConstraints(value);
      serializeRlm2tEndYyyy(rlm2tEndYyyy);
   } 

     /**
	 * 	Update Rlm2tEndYyyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tEndYyyy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tEndYyyy,rlm2tEndYyyy.length);
   	
   }
   
   public void setRlm2tEndYyyy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tEndYyyy,rlm2tEndYyyy.length);
   	
   }
   
     /**
	 * 	Update Rlm2tEndYyyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tEndYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tEndYyyy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tEndYyyy with another Field
	 *	@param value
	 */
   public void setRlm2tEndYyyy(Field source) {
       replace(source,0,source.length(),beginRlm2tEndYyyy,RLM_2T_END_YYYY_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tEndYyyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tEndYyyy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tEndYyyy,RLM_2T_END_YYYY_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tEndYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tEndYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tEndYyyy+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Rlm2tEndDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRlm2tEndMm(CONSTANTS.SPACE_2);
         setRlm2tEndDd(CONSTANTS.SPACE_2);
         setRlm2tEndYyyy(CONSTANTS.SPACE_4);
   }

		public static int getRlm2tEndDtFieldLength() {
			return RLM_2T_END_DT_LENGTH;
		}

}
  
