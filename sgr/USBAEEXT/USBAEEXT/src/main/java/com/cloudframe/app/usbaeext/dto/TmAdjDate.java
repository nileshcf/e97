package com.cloudframe.app.usbaeext.dto;

/**
*  The class TmAdjDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.usbaeext.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TmAdjDate extends TmAdjDateSerialized {
   

						private char[] tmAdjDateMm = Field.fillLowValue(2);

						private char[] tmAdjDateDd = Field.fillLowValue(2);

						private char[] tmAdjDateYyyy = Field.fillLowValue(4);
	
	/**
	* Constructor for TmAdjDate
	**/
    public TmAdjDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of tmAdjDateMm
	 *	@return tmAdjDateMm
	 */
   public char[] getTmAdjDateMm() throws CFException{
     if (isTmAdjDateMmModified()) { 
        tmAdjDateMm = refreshTmAdjDateMm();
     }
   		return tmAdjDateMm;
   }

  
	/**
	*  set variable tmAdjDateMm
	*  Corresponding COBOL Variable is TM-ADJ-DATE-MM
	*  @param value
	**/
   public void setTmAdjDateMm(char[] value) {
      tmAdjDateMm = checkTmAdjDateMmConstraints(value);
      serializeTmAdjDateMm(tmAdjDateMm);
   } 

     /**
	 * 	Update TmAdjDateMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTmAdjDateMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTmAdjDateMm,tmAdjDateMm.length);
   	
   }
   
   public void setTmAdjDateMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTmAdjDateMm,tmAdjDateMm.length);
   	
   }
   
     /**
	 * 	Update TmAdjDateMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTmAdjDateMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TmAdjDateMm with another Field
	 *	@param value
	 */
   public void setTmAdjDateMm(Field source) {
       replace(source,0,source.length(),beginTmAdjDateMm,TM_ADJ_DATE_MM_LEN);
   	
   }  
   
     /**
	 * 	Update TmAdjDateMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTmAdjDateMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTmAdjDateMm,TM_ADJ_DATE_MM_LEN);
   	
   }
   
     /**
	 * 	Update TmAdjDateMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTmAdjDateMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tmAdjDateDd
	 *	@return tmAdjDateDd
	 */
   public char[] getTmAdjDateDd() throws CFException{
     if (isTmAdjDateDdModified()) { 
        tmAdjDateDd = refreshTmAdjDateDd();
     }
   		return tmAdjDateDd;
   }

  
	/**
	*  set variable tmAdjDateDd
	*  Corresponding COBOL Variable is TM-ADJ-DATE-DD
	*  @param value
	**/
   public void setTmAdjDateDd(char[] value) {
      tmAdjDateDd = checkTmAdjDateDdConstraints(value);
      serializeTmAdjDateDd(tmAdjDateDd);
   } 

     /**
	 * 	Update TmAdjDateDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTmAdjDateDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTmAdjDateDd,tmAdjDateDd.length);
   	
   }
   
   public void setTmAdjDateDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTmAdjDateDd,tmAdjDateDd.length);
   	
   }
   
     /**
	 * 	Update TmAdjDateDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTmAdjDateDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TmAdjDateDd with another Field
	 *	@param value
	 */
   public void setTmAdjDateDd(Field source) {
       replace(source,0,source.length(),beginTmAdjDateDd,TM_ADJ_DATE_DD_LEN);
   	
   }  
   
     /**
	 * 	Update TmAdjDateDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTmAdjDateDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTmAdjDateDd,TM_ADJ_DATE_DD_LEN);
   	
   }
   
     /**
	 * 	Update TmAdjDateDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTmAdjDateDd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tmAdjDateYyyy
	 *	@return tmAdjDateYyyy
	 */
   public char[] getTmAdjDateYyyy() throws CFException{
     if (isTmAdjDateYyyyModified()) { 
        tmAdjDateYyyy = refreshTmAdjDateYyyy();
     }
   		return tmAdjDateYyyy;
   }

  
	/**
	*  set variable tmAdjDateYyyy
	*  Corresponding COBOL Variable is TM-ADJ-DATE-YYYY
	*  @param value
	**/
   public void setTmAdjDateYyyy(char[] value) {
      tmAdjDateYyyy = checkTmAdjDateYyyyConstraints(value);
      serializeTmAdjDateYyyy(tmAdjDateYyyy);
   } 

     /**
	 * 	Update TmAdjDateYyyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTmAdjDateYyyy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTmAdjDateYyyy,tmAdjDateYyyy.length);
   	
   }
   
   public void setTmAdjDateYyyy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTmAdjDateYyyy,tmAdjDateYyyy.length);
   	
   }
   
     /**
	 * 	Update TmAdjDateYyyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTmAdjDateYyyy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TmAdjDateYyyy with another Field
	 *	@param value
	 */
   public void setTmAdjDateYyyy(Field source) {
       replace(source,0,source.length(),beginTmAdjDateYyyy,TM_ADJ_DATE_YYYY_LEN);
   	
   }  
   
     /**
	 * 	Update TmAdjDateYyyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTmAdjDateYyyy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTmAdjDateYyyy,TM_ADJ_DATE_YYYY_LEN);
   	
   }
   
     /**
	 * 	Update TmAdjDateYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTmAdjDateYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTmAdjDateYyyy+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTmAdjDateFieldLength() {
			return TM_ADJ_DATE_LENGTH;
		}

}
  
