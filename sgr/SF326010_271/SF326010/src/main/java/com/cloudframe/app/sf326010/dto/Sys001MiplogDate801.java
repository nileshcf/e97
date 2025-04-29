package com.cloudframe.app.sf326010.dto;

/**
*  The class Sys001MiplogDate801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001MiplogDate801 extends Sys001MiplogDate801Serialized { 
   

						private char[] sys001MiplogDateMm801 = Field.fillLowValue(1);

						private char[] sys001MiplogDateDd801 = Field.fillLowValue(1);

						private char[] sys001MiplogDateYy801 = Field.fillLowValue(1);
	
	/**
	* Constructor for Sys001MiplogDate801
	**/
    public Sys001MiplogDate801() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sys001MiplogDate801. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys001MiplogDate801(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sys001MiplogDateMm801
	 *	@return sys001MiplogDateMm801
	 */
   public char[] getSys001MiplogDateMm801() throws CFException{
     if (isSys001MiplogDateMm801Modified()) { 
        sys001MiplogDateMm801 = refreshSys001MiplogDateMm801();
     }
   		return sys001MiplogDateMm801;
   }

  
	/**
	*  set variable sys001MiplogDateMm801
	*  Corresponding COBOL Variable is 801-SYS001-MIPLOG-DATE-MM
	*  @param value
	**/
   public void setSys001MiplogDateMm801(char[] value) {
      sys001MiplogDateMm801 = checkSys001MiplogDateMm801Constraints(value);
      serializeSys001MiplogDateMm801(sys001MiplogDateMm801);
   } 

     /**
	 * 	Update Sys001MiplogDateMm801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001MiplogDateMm801,sys001MiplogDateMm801.length);
   	
   }
   
   public void setSys001MiplogDateMm801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogDateMm801,sys001MiplogDateMm801.length);
   	
   }
   
     /**
	 * 	Update Sys001MiplogDateMm801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogDateMm801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001MiplogDateMm801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(Field source) {
       replace(source,0,source.length(),beginSys001MiplogDateMm801,SYS_001_MIPLOG_DATE_MM_801_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001MiplogDateMm801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001MiplogDateMm801,SYS_001_MIPLOG_DATE_MM_801_LEN);
   	
   }
   
     /**
	 * 	Update Sys001MiplogDateMm801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogDateMm801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys001MiplogDateDd801
	 *	@return sys001MiplogDateDd801
	 */
   public char[] getSys001MiplogDateDd801() throws CFException{
     if (isSys001MiplogDateDd801Modified()) { 
        sys001MiplogDateDd801 = refreshSys001MiplogDateDd801();
     }
   		return sys001MiplogDateDd801;
   }

  
	/**
	*  set variable sys001MiplogDateDd801
	*  Corresponding COBOL Variable is 801-SYS001-MIPLOG-DATE-DD
	*  @param value
	**/
   public void setSys001MiplogDateDd801(char[] value) {
      sys001MiplogDateDd801 = checkSys001MiplogDateDd801Constraints(value);
      serializeSys001MiplogDateDd801(sys001MiplogDateDd801);
   } 

     /**
	 * 	Update Sys001MiplogDateDd801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001MiplogDateDd801,sys001MiplogDateDd801.length);
   	
   }
   
   public void setSys001MiplogDateDd801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogDateDd801,sys001MiplogDateDd801.length);
   	
   }
   
     /**
	 * 	Update Sys001MiplogDateDd801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogDateDd801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001MiplogDateDd801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(Field source) {
       replace(source,0,source.length(),beginSys001MiplogDateDd801,SYS_001_MIPLOG_DATE_DD_801_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001MiplogDateDd801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001MiplogDateDd801,SYS_001_MIPLOG_DATE_DD_801_LEN);
   	
   }
   
     /**
	 * 	Update Sys001MiplogDateDd801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogDateDd801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys001MiplogDateYy801
	 *	@return sys001MiplogDateYy801
	 */
   public char[] getSys001MiplogDateYy801() throws CFException{
     if (isSys001MiplogDateYy801Modified()) { 
        sys001MiplogDateYy801 = refreshSys001MiplogDateYy801();
     }
   		return sys001MiplogDateYy801;
   }

  
	/**
	*  set variable sys001MiplogDateYy801
	*  Corresponding COBOL Variable is 801-SYS001-MIPLOG-DATE-YY
	*  @param value
	**/
   public void setSys001MiplogDateYy801(char[] value) {
      sys001MiplogDateYy801 = checkSys001MiplogDateYy801Constraints(value);
      serializeSys001MiplogDateYy801(sys001MiplogDateYy801);
   } 

     /**
	 * 	Update Sys001MiplogDateYy801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001MiplogDateYy801,sys001MiplogDateYy801.length);
   	
   }
   
   public void setSys001MiplogDateYy801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogDateYy801,sys001MiplogDateYy801.length);
   	
   }
   
     /**
	 * 	Update Sys001MiplogDateYy801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogDateYy801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001MiplogDateYy801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(Field source) {
       replace(source,0,source.length(),beginSys001MiplogDateYy801,SYS_001_MIPLOG_DATE_YY_801_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001MiplogDateYy801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001MiplogDateYy801,SYS_001_MIPLOG_DATE_YY_801_LEN);
   	
   }
   
     /**
	 * 	Update Sys001MiplogDateYy801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogDateYy801+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys001MiplogDate801FieldLength() {
			return SYS_001_MIPLOG_DATE_801_LENGTH;
		}

}
  
