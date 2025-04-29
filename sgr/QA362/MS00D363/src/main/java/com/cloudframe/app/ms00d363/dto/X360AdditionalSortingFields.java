package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360AdditionalSortingFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360AdditionalSortingFields extends X360AdditionalSortingFieldsSerialized { 
   
				private X360InterType1Srt x360InterType1Srt = new X360InterType1Srt();
				private X360InterType2Srt x360InterType2Srt = new X360InterType2Srt();
	
	/**
	* Constructor for X360AdditionalSortingFields
	**/
    public X360AdditionalSortingFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360AdditionalSortingFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AdditionalSortingFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			x360InterType1Srt.setParent(this,getStartOffset() + 0);
	       			x360InterType2Srt.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of x360InterType1Srt
	 *	@return x360InterType1Srt
	 */   
	 public X360InterType1Srt getX360InterType1Srt() {
   	return x360InterType1Srt;
   }
   /**
	* 	Update X360InterType1Srt with the passed value
	*   Corresponding COBOL Variable is X360-INTER-TYPE-1-SRT
	*	@param value
	*/
   public void setX360InterType1Srt(char[] value) {
      x360InterType1Srt.setString(value); 
   }   
    
     /**
	 * 	Update X360InterType1Srt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360InterType1Srt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360InterType1Srt.begin,x360InterType1Srt.length());
   }
   
     /**
	 * 	Update X360InterType1Srt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360InterType1Srt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360InterType1Srt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360InterType1Srt with another Field
	 *	@param value
	 */
   public void setX360InterType1Srt(Field source) {
   	replace(source,0,source.length(),x360InterType1Srt.begin,x360InterType1Srt.length());
   }  
   
     /**
	 * 	Update X360InterType1Srt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360InterType1Srt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360InterType1Srt.begin,x360InterType1Srt.length());
   }
   
     /**
	 * 	Update X360InterType1Srt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360InterType1Srt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360InterType1Srt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360InterType2Srt
	 *	@return x360InterType2Srt
	 */   
	 public X360InterType2Srt getX360InterType2Srt() {
   	return x360InterType2Srt;
   }
   /**
	* 	Update X360InterType2Srt with the passed value
	*   Corresponding COBOL Variable is X360-INTER-TYPE-2-SRT
	*	@param value
	*/
   public void setX360InterType2Srt(char[] value) {
      x360InterType2Srt.setString(value); 
   }   
    
     /**
	 * 	Update X360InterType2Srt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360InterType2Srt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360InterType2Srt.begin,x360InterType2Srt.length());
   }
   
     /**
	 * 	Update X360InterType2Srt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360InterType2Srt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360InterType2Srt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360InterType2Srt with another Field
	 *	@param value
	 */
   public void setX360InterType2Srt(Field source) {
   	replace(source,0,source.length(),x360InterType2Srt.begin,x360InterType2Srt.length());
   }  
   
     /**
	 * 	Update X360InterType2Srt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360InterType2Srt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360InterType2Srt.begin,x360InterType2Srt.length());
   }
   
     /**
	 * 	Update X360InterType2Srt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360InterType2Srt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360InterType2Srt.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getX360AdditionalSortingFieldsFieldLength() {
			return X_360_ADDITIONAL_SORTING_FIELDS_LENGTH;
		}

}
  
