package com.cloudframe.app.ms00d363.dto;

/**
*  The class SurDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SurDate extends SurDateSerialized {
   

						private char[] surDateCc = Field.fillLowValue(2);

						private char[] surDateYy = Field.fillLowValue(2);

						private char[] surDateMm = Field.fillLowValue(2);

						private char[] surDateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for SurDate
	**/
    public SurDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of surDateCc
	 *	@return surDateCc
	 */
   public char[] getSurDateCc() throws CFException{
     if (isSurDateCcModified()) { 
        surDateCc = refreshSurDateCc();
     }
   		return surDateCc;
   }

  
	/**
	*  set variable surDateCc
	*  Corresponding COBOL Variable is WS-SUR-DATE-CC
	*  @param value
	**/
   public void setSurDateCc(char[] value) {
      surDateCc = checkSurDateCcConstraints(value);
      serializeSurDateCc(surDateCc);
   } 

     /**
	 * 	Update SurDateCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSurDateCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSurDateCc,surDateCc.length);
   	
   }
   
   public void setSurDateCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSurDateCc,surDateCc.length);
   	
   }
   
     /**
	 * 	Update SurDateCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSurDateCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSurDateCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SurDateCc with another Field
	 *	@param value
	 */
   public void setSurDateCc(Field source) {
       replace(source,0,source.length(),beginSurDateCc,SUR_DATE_CC_LEN);
   	
   }  
   
     /**
	 * 	Update SurDateCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSurDateCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSurDateCc,SUR_DATE_CC_LEN);
   	
   }
   
     /**
	 * 	Update SurDateCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSurDateCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSurDateCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of surDateYy
	 *	@return surDateYy
	 */
   public char[] getSurDateYy() throws CFException{
     if (isSurDateYyModified()) { 
        surDateYy = refreshSurDateYy();
     }
   		return surDateYy;
   }

  
	/**
	*  set variable surDateYy
	*  Corresponding COBOL Variable is WS-SUR-DATE-YY
	*  @param value
	**/
   public void setSurDateYy(char[] value) {
      surDateYy = checkSurDateYyConstraints(value);
      serializeSurDateYy(surDateYy);
   } 

     /**
	 * 	Update SurDateYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSurDateYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSurDateYy,surDateYy.length);
   	
   }
   
   public void setSurDateYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSurDateYy,surDateYy.length);
   	
   }
   
     /**
	 * 	Update SurDateYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSurDateYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSurDateYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SurDateYy with another Field
	 *	@param value
	 */
   public void setSurDateYy(Field source) {
       replace(source,0,source.length(),beginSurDateYy,SUR_DATE_YY_LEN);
   	
   }  
   
     /**
	 * 	Update SurDateYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSurDateYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSurDateYy,SUR_DATE_YY_LEN);
   	
   }
   
     /**
	 * 	Update SurDateYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSurDateYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSurDateYy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of surDateMm
	 *	@return surDateMm
	 */
   public char[] getSurDateMm() throws CFException{
     if (isSurDateMmModified()) { 
        surDateMm = refreshSurDateMm();
     }
   		return surDateMm;
   }

  
	/**
	*  set variable surDateMm
	*  Corresponding COBOL Variable is WS-SUR-DATE-MM
	*  @param value
	**/
   public void setSurDateMm(char[] value) {
      surDateMm = checkSurDateMmConstraints(value);
      serializeSurDateMm(surDateMm);
   } 

     /**
	 * 	Update SurDateMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSurDateMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSurDateMm,surDateMm.length);
   	
   }
   
   public void setSurDateMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSurDateMm,surDateMm.length);
   	
   }
   
     /**
	 * 	Update SurDateMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSurDateMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSurDateMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SurDateMm with another Field
	 *	@param value
	 */
   public void setSurDateMm(Field source) {
       replace(source,0,source.length(),beginSurDateMm,SUR_DATE_MM_LEN);
   	
   }  
   
     /**
	 * 	Update SurDateMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSurDateMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSurDateMm,SUR_DATE_MM_LEN);
   	
   }
   
     /**
	 * 	Update SurDateMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSurDateMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSurDateMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of surDateDd
	 *	@return surDateDd
	 */
   public char[] getSurDateDd() throws CFException{
     if (isSurDateDdModified()) { 
        surDateDd = refreshSurDateDd();
     }
   		return surDateDd;
   }

  
	/**
	*  set variable surDateDd
	*  Corresponding COBOL Variable is WS-SUR-DATE-DD
	*  @param value
	**/
   public void setSurDateDd(char[] value) {
      surDateDd = checkSurDateDdConstraints(value);
      serializeSurDateDd(surDateDd);
   } 

     /**
	 * 	Update SurDateDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSurDateDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSurDateDd,surDateDd.length);
   	
   }
   
   public void setSurDateDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSurDateDd,surDateDd.length);
   	
   }
   
     /**
	 * 	Update SurDateDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSurDateDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSurDateDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SurDateDd with another Field
	 *	@param value
	 */
   public void setSurDateDd(Field source) {
       replace(source,0,source.length(),beginSurDateDd,SUR_DATE_DD_LEN);
   	
   }  
   
     /**
	 * 	Update SurDateDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSurDateDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSurDateDd,SUR_DATE_DD_LEN);
   	
   }
   
     /**
	 * 	Update SurDateDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSurDateDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSurDateDd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSurDateFieldLength() {
			return SUR_DATE_LENGTH;
		}

}
  
