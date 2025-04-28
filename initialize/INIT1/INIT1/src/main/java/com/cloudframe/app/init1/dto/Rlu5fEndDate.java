package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fEndDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Rlu5fEndDate extends Rlu5fEndDateSerialized { 
   

						private char[] rlu5fEndDateMm = Field.fillLowValue(2);

						private char[] rlu5fEndDateDd = Field.fillLowValue(2);

						private char[] rlu5fEndDateCc = Field.fillLowValue(2);

						private char[] rlu5fEndDateYy = Field.fillLowValue(2);
	
	/**
	* Constructor for Rlu5fEndDate
	**/
    public Rlu5fEndDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rlu5fEndDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fEndDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlu5fEndDateMm
	 *	@return rlu5fEndDateMm
	 */
   public char[] getRlu5fEndDateMm() throws CFException{
     if (isRlu5fEndDateMmModified()) { 
        rlu5fEndDateMm = refreshRlu5fEndDateMm();
     }
   		return rlu5fEndDateMm;
   }

  
	/**
	*  set variable rlu5fEndDateMm
	*  Corresponding COBOL Variable is RLU5F-END-DATE-MM
	*  @param value
	**/
   public void setRlu5fEndDateMm(char[] value) {
      rlu5fEndDateMm = checkRlu5fEndDateMmConstraints(value);
      serializeRlu5fEndDateMm(rlu5fEndDateMm);
   } 

     /**
	 * 	Update Rlu5fEndDateMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fEndDateMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fEndDateMm,rlu5fEndDateMm.length);
   	
   }
   
   public void setRlu5fEndDateMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fEndDateMm,rlu5fEndDateMm.length);
   	
   }
   
     /**
	 * 	Update Rlu5fEndDateMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fEndDateMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fEndDateMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fEndDateMm with another Field
	 *	@param value
	 */
   public void setRlu5fEndDateMm(Field source) {
       replace(source,0,source.length(),beginRlu5fEndDateMm,RLU_5F_END_DATE_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fEndDateMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fEndDateMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fEndDateMm,RLU_5F_END_DATE_MM_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fEndDateMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fEndDateMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fEndDateMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fEndDateDd
	 *	@return rlu5fEndDateDd
	 */
   public char[] getRlu5fEndDateDd() throws CFException{
     if (isRlu5fEndDateDdModified()) { 
        rlu5fEndDateDd = refreshRlu5fEndDateDd();
     }
   		return rlu5fEndDateDd;
   }

  
	/**
	*  set variable rlu5fEndDateDd
	*  Corresponding COBOL Variable is RLU5F-END-DATE-DD
	*  @param value
	**/
   public void setRlu5fEndDateDd(char[] value) {
      rlu5fEndDateDd = checkRlu5fEndDateDdConstraints(value);
      serializeRlu5fEndDateDd(rlu5fEndDateDd);
   } 

     /**
	 * 	Update Rlu5fEndDateDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fEndDateDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fEndDateDd,rlu5fEndDateDd.length);
   	
   }
   
   public void setRlu5fEndDateDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fEndDateDd,rlu5fEndDateDd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fEndDateDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fEndDateDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fEndDateDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fEndDateDd with another Field
	 *	@param value
	 */
   public void setRlu5fEndDateDd(Field source) {
       replace(source,0,source.length(),beginRlu5fEndDateDd,RLU_5F_END_DATE_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fEndDateDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fEndDateDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fEndDateDd,RLU_5F_END_DATE_DD_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fEndDateDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fEndDateDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fEndDateDd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fEndDateCc
	 *	@return rlu5fEndDateCc
	 */
   public char[] getRlu5fEndDateCc() throws CFException{
     if (isRlu5fEndDateCcModified()) { 
        rlu5fEndDateCc = refreshRlu5fEndDateCc();
     }
   		return rlu5fEndDateCc;
   }

  
	/**
	*  set variable rlu5fEndDateCc
	*  Corresponding COBOL Variable is RLU5F-END-DATE-CC
	*  @param value
	**/
   public void setRlu5fEndDateCc(char[] value) {
      rlu5fEndDateCc = checkRlu5fEndDateCcConstraints(value);
      serializeRlu5fEndDateCc(rlu5fEndDateCc);
   } 

     /**
	 * 	Update Rlu5fEndDateCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fEndDateCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fEndDateCc,rlu5fEndDateCc.length);
   	
   }
   
   public void setRlu5fEndDateCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fEndDateCc,rlu5fEndDateCc.length);
   	
   }
   
     /**
	 * 	Update Rlu5fEndDateCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fEndDateCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fEndDateCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fEndDateCc with another Field
	 *	@param value
	 */
   public void setRlu5fEndDateCc(Field source) {
       replace(source,0,source.length(),beginRlu5fEndDateCc,RLU_5F_END_DATE_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fEndDateCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fEndDateCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fEndDateCc,RLU_5F_END_DATE_CC_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fEndDateCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fEndDateCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fEndDateCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fEndDateYy
	 *	@return rlu5fEndDateYy
	 */
   public char[] getRlu5fEndDateYy() throws CFException{
     if (isRlu5fEndDateYyModified()) { 
        rlu5fEndDateYy = refreshRlu5fEndDateYy();
     }
   		return rlu5fEndDateYy;
   }

  
	/**
	*  set variable rlu5fEndDateYy
	*  Corresponding COBOL Variable is RLU5F-END-DATE-YY
	*  @param value
	**/
   public void setRlu5fEndDateYy(char[] value) {
      rlu5fEndDateYy = checkRlu5fEndDateYyConstraints(value);
      serializeRlu5fEndDateYy(rlu5fEndDateYy);
   } 

     /**
	 * 	Update Rlu5fEndDateYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fEndDateYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fEndDateYy,rlu5fEndDateYy.length);
   	
   }
   
   public void setRlu5fEndDateYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fEndDateYy,rlu5fEndDateYy.length);
   	
   }
   
     /**
	 * 	Update Rlu5fEndDateYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fEndDateYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fEndDateYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fEndDateYy with another Field
	 *	@param value
	 */
   public void setRlu5fEndDateYy(Field source) {
       replace(source,0,source.length(),beginRlu5fEndDateYy,RLU_5F_END_DATE_YY_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fEndDateYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fEndDateYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fEndDateYy,RLU_5F_END_DATE_YY_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fEndDateYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fEndDateYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fEndDateYy+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Rlu5fEndDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRlu5fEndDateMm(CONSTANTS.SPACE_2);
         setRlu5fEndDateDd(CONSTANTS.SPACE_2);
         setRlu5fEndDateCc(CONSTANTS.SPACE_2);
         setRlu5fEndDateYy(CONSTANTS.SPACE_2);
   }

		public static int getRlu5fEndDateFieldLength() {
			return RLU_5F_END_DATE_LENGTH;
		}

}
  
