package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fStartDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Rlu5fStartDate extends Rlu5fStartDateSerialized { 
   

						private char[] rlu5fStartDateMm = Field.fillLowValue(2);

						private char[] rlu5fStartDateDd = Field.fillLowValue(2);

						private char[] rlu5fStartDateCc = Field.fillLowValue(2);

						private char[] rlu5fStartDateYy = Field.fillLowValue(2);
	
	/**
	* Constructor for Rlu5fStartDate
	**/
    public Rlu5fStartDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rlu5fStartDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fStartDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlu5fStartDateMm
	 *	@return rlu5fStartDateMm
	 */
   public char[] getRlu5fStartDateMm() throws CFException{
     if (isRlu5fStartDateMmModified()) { 
        rlu5fStartDateMm = refreshRlu5fStartDateMm();
     }
   		return rlu5fStartDateMm;
   }

  
	/**
	*  set variable rlu5fStartDateMm
	*  Corresponding COBOL Variable is RLU5F-START-DATE-MM
	*  @param value
	**/
   public void setRlu5fStartDateMm(char[] value) {
      rlu5fStartDateMm = checkRlu5fStartDateMmConstraints(value);
      serializeRlu5fStartDateMm(rlu5fStartDateMm);
   } 

     /**
	 * 	Update Rlu5fStartDateMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fStartDateMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fStartDateMm,rlu5fStartDateMm.length);
   	
   }
   
   public void setRlu5fStartDateMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStartDateMm,rlu5fStartDateMm.length);
   	
   }
   
     /**
	 * 	Update Rlu5fStartDateMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fStartDateMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStartDateMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fStartDateMm with another Field
	 *	@param value
	 */
   public void setRlu5fStartDateMm(Field source) {
       replace(source,0,source.length(),beginRlu5fStartDateMm,RLU_5F_START_DATE_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fStartDateMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fStartDateMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fStartDateMm,RLU_5F_START_DATE_MM_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fStartDateMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fStartDateMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStartDateMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fStartDateDd
	 *	@return rlu5fStartDateDd
	 */
   public char[] getRlu5fStartDateDd() throws CFException{
     if (isRlu5fStartDateDdModified()) { 
        rlu5fStartDateDd = refreshRlu5fStartDateDd();
     }
   		return rlu5fStartDateDd;
   }

  
	/**
	*  set variable rlu5fStartDateDd
	*  Corresponding COBOL Variable is RLU5F-START-DATE-DD
	*  @param value
	**/
   public void setRlu5fStartDateDd(char[] value) {
      rlu5fStartDateDd = checkRlu5fStartDateDdConstraints(value);
      serializeRlu5fStartDateDd(rlu5fStartDateDd);
   } 

     /**
	 * 	Update Rlu5fStartDateDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fStartDateDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fStartDateDd,rlu5fStartDateDd.length);
   	
   }
   
   public void setRlu5fStartDateDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStartDateDd,rlu5fStartDateDd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fStartDateDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fStartDateDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStartDateDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fStartDateDd with another Field
	 *	@param value
	 */
   public void setRlu5fStartDateDd(Field source) {
       replace(source,0,source.length(),beginRlu5fStartDateDd,RLU_5F_START_DATE_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fStartDateDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fStartDateDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fStartDateDd,RLU_5F_START_DATE_DD_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fStartDateDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fStartDateDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStartDateDd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fStartDateCc
	 *	@return rlu5fStartDateCc
	 */
   public char[] getRlu5fStartDateCc() throws CFException{
     if (isRlu5fStartDateCcModified()) { 
        rlu5fStartDateCc = refreshRlu5fStartDateCc();
     }
   		return rlu5fStartDateCc;
   }

  
	/**
	*  set variable rlu5fStartDateCc
	*  Corresponding COBOL Variable is RLU5F-START-DATE-CC
	*  @param value
	**/
   public void setRlu5fStartDateCc(char[] value) {
      rlu5fStartDateCc = checkRlu5fStartDateCcConstraints(value);
      serializeRlu5fStartDateCc(rlu5fStartDateCc);
   } 

     /**
	 * 	Update Rlu5fStartDateCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fStartDateCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fStartDateCc,rlu5fStartDateCc.length);
   	
   }
   
   public void setRlu5fStartDateCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStartDateCc,rlu5fStartDateCc.length);
   	
   }
   
     /**
	 * 	Update Rlu5fStartDateCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fStartDateCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStartDateCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fStartDateCc with another Field
	 *	@param value
	 */
   public void setRlu5fStartDateCc(Field source) {
       replace(source,0,source.length(),beginRlu5fStartDateCc,RLU_5F_START_DATE_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fStartDateCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fStartDateCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fStartDateCc,RLU_5F_START_DATE_CC_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fStartDateCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fStartDateCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStartDateCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fStartDateYy
	 *	@return rlu5fStartDateYy
	 */
   public char[] getRlu5fStartDateYy() throws CFException{
     if (isRlu5fStartDateYyModified()) { 
        rlu5fStartDateYy = refreshRlu5fStartDateYy();
     }
   		return rlu5fStartDateYy;
   }

  
	/**
	*  set variable rlu5fStartDateYy
	*  Corresponding COBOL Variable is RLU5F-START-DATE-YY
	*  @param value
	**/
   public void setRlu5fStartDateYy(char[] value) {
      rlu5fStartDateYy = checkRlu5fStartDateYyConstraints(value);
      serializeRlu5fStartDateYy(rlu5fStartDateYy);
   } 

     /**
	 * 	Update Rlu5fStartDateYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fStartDateYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fStartDateYy,rlu5fStartDateYy.length);
   	
   }
   
   public void setRlu5fStartDateYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStartDateYy,rlu5fStartDateYy.length);
   	
   }
   
     /**
	 * 	Update Rlu5fStartDateYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fStartDateYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStartDateYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fStartDateYy with another Field
	 *	@param value
	 */
   public void setRlu5fStartDateYy(Field source) {
       replace(source,0,source.length(),beginRlu5fStartDateYy,RLU_5F_START_DATE_YY_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fStartDateYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fStartDateYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fStartDateYy,RLU_5F_START_DATE_YY_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fStartDateYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fStartDateYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStartDateYy+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Rlu5fStartDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRlu5fStartDateMm(CONSTANTS.SPACE_2);
         setRlu5fStartDateDd(CONSTANTS.SPACE_2);
         setRlu5fStartDateCc(CONSTANTS.SPACE_2);
         setRlu5fStartDateYy(CONSTANTS.SPACE_2);
   }

		public static int getRlu5fStartDateFieldLength() {
			return RLU_5F_START_DATE_LENGTH;
		}

}
  
