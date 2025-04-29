package com.cloudframe.app.sf320010.dto;

/**
*  The class WaDateYmd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WaDateYmd extends WaDateYmdSerialized {
   

						private char[] waDateYy = Field.fillLowValue(2);

						private char[] waDateMm = Field.fillLowValue(2);

						private char[] waDateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for WaDateYmd
	**/
    public WaDateYmd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of waDateYy
	 *	@return waDateYy
	 */
   public char[] getWaDateYy() throws CFException{
     if (isWaDateYyModified()) { 
        waDateYy = refreshWaDateYy();
     }
   		return waDateYy;
   }

  
	/**
	*  set variable waDateYy
	*  Corresponding COBOL Variable is WA-DATE-YY
	*  @param value
	**/
   public void setWaDateYy(char[] value) {
      waDateYy = checkWaDateYyConstraints(value);
      serializeWaDateYy(waDateYy);
   } 

     /**
	 * 	Update WaDateYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaDateYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaDateYy,waDateYy.length);
   	
   }
   
   public void setWaDateYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateYy,waDateYy.length);
   	
   }
   
     /**
	 * 	Update WaDateYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaDateYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaDateYy with another Field
	 *	@param value
	 */
   public void setWaDateYy(Field source) {
       replace(source,0,source.length(),beginWaDateYy,WA_DATE_YY_LEN);
   	
   }  
   
     /**
	 * 	Update WaDateYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaDateYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaDateYy,WA_DATE_YY_LEN);
   	
   }
   
     /**
	 * 	Update WaDateYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaDateYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateYy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of waDateMm
	 *	@return waDateMm
	 */
   public char[] getWaDateMm() throws CFException{
     if (isWaDateMmModified()) { 
        waDateMm = refreshWaDateMm();
     }
   		return waDateMm;
   }

  
	/**
	*  set variable waDateMm
	*  Corresponding COBOL Variable is WA-DATE-MM
	*  @param value
	**/
   public void setWaDateMm(char[] value) {
      waDateMm = checkWaDateMmConstraints(value);
      serializeWaDateMm(waDateMm);
   } 

     /**
	 * 	Update WaDateMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaDateMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaDateMm,waDateMm.length);
   	
   }
   
   public void setWaDateMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateMm,waDateMm.length);
   	
   }
   
     /**
	 * 	Update WaDateMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaDateMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaDateMm with another Field
	 *	@param value
	 */
   public void setWaDateMm(Field source) {
       replace(source,0,source.length(),beginWaDateMm,WA_DATE_MM_LEN);
   	
   }  
   
     /**
	 * 	Update WaDateMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaDateMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaDateMm,WA_DATE_MM_LEN);
   	
   }
   
     /**
	 * 	Update WaDateMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaDateMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of waDateDd
	 *	@return waDateDd
	 */
   public char[] getWaDateDd() throws CFException{
     if (isWaDateDdModified()) { 
        waDateDd = refreshWaDateDd();
     }
   		return waDateDd;
   }

  
	/**
	*  set variable waDateDd
	*  Corresponding COBOL Variable is WA-DATE-DD
	*  @param value
	**/
   public void setWaDateDd(char[] value) {
      waDateDd = checkWaDateDdConstraints(value);
      serializeWaDateDd(waDateDd);
   } 

     /**
	 * 	Update WaDateDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaDateDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaDateDd,waDateDd.length);
   	
   }
   
   public void setWaDateDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateDd,waDateDd.length);
   	
   }
   
     /**
	 * 	Update WaDateDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaDateDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaDateDd with another Field
	 *	@param value
	 */
   public void setWaDateDd(Field source) {
       replace(source,0,source.length(),beginWaDateDd,WA_DATE_DD_LEN);
   	
   }  
   
     /**
	 * 	Update WaDateDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaDateDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaDateDd,WA_DATE_DD_LEN);
   	
   }
   
     /**
	 * 	Update WaDateDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaDateDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateDd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWaDateYmdFieldLength() {
			return WA_DATE_YMD_LENGTH;
		}

}
  
