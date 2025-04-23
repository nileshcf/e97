package com.cloudframe.app.sf328010.dto;

/**
*  The class WhenCompDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WhenCompDate800 extends WhenCompDate800Serialized { 
   

						private char[] whenDateYyyy800 = new char[4];

						private char[] whenDateMm800 = new char[2];

						private char[] whenDateDd800 = new char[2];
	
	/**
	* Constructor for WhenCompDate800
	**/
    public WhenCompDate800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WhenCompDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WhenCompDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWhenDateYyyy800(fillSpace(4));
								setWhenDateMm800(fillSpace(2));
								setWhenDateDd800(fillSpace(2));
    } 

	/**
	 *	Returns the value of whenDateYyyy800
	 *	@return whenDateYyyy800
	 */
   public char[] getWhenDateYyyy800() throws CFException{
     if (isWhenDateYyyy800Modified()) { 
        whenDateYyyy800 = refreshWhenDateYyyy800();
     }
   		return whenDateYyyy800;
   }

  
	/**
	*  set variable whenDateYyyy800
	*  Corresponding COBOL Variable is 800-WHEN-DATE-YYYY
	*  @param value
	**/
   public void setWhenDateYyyy800(char[] value) {
      whenDateYyyy800 = checkWhenDateYyyy800Constraints(value);
      serializeWhenDateYyyy800(whenDateYyyy800);
   } 

     /**
	 * 	Update WhenDateYyyy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenDateYyyy800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWhenDateYyyy800,whenDateYyyy800.length);
   	
   }
   
   public void setWhenDateYyyy800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWhenDateYyyy800,whenDateYyyy800.length);
   	
   }
   
     /**
	 * 	Update WhenDateYyyy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateYyyy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWhenDateYyyy800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WhenDateYyyy800 with another Field
	 *	@param value
	 */
   public void setWhenDateYyyy800(Field source) {
       replace(source,0,source.length(),beginWhenDateYyyy800,WHEN_DATE_YYYY_800_LEN);
   	
   }  
   
     /**
	 * 	Update WhenDateYyyy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenDateYyyy800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWhenDateYyyy800,WHEN_DATE_YYYY_800_LEN);
   	
   }
   
     /**
	 * 	Update WhenDateYyyy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateYyyy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWhenDateYyyy800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of whenDateMm800
	 *	@return whenDateMm800
	 */
   public char[] getWhenDateMm800() throws CFException{
     if (isWhenDateMm800Modified()) { 
        whenDateMm800 = refreshWhenDateMm800();
     }
   		return whenDateMm800;
   }

  
	/**
	*  set variable whenDateMm800
	*  Corresponding COBOL Variable is 800-WHEN-DATE-MM
	*  @param value
	**/
   public void setWhenDateMm800(char[] value) {
      whenDateMm800 = checkWhenDateMm800Constraints(value);
      serializeWhenDateMm800(whenDateMm800);
   } 

     /**
	 * 	Update WhenDateMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenDateMm800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWhenDateMm800,whenDateMm800.length);
   	
   }
   
   public void setWhenDateMm800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWhenDateMm800,whenDateMm800.length);
   	
   }
   
     /**
	 * 	Update WhenDateMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWhenDateMm800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WhenDateMm800 with another Field
	 *	@param value
	 */
   public void setWhenDateMm800(Field source) {
       replace(source,0,source.length(),beginWhenDateMm800,WHEN_DATE_MM_800_LEN);
   	
   }  
   
     /**
	 * 	Update WhenDateMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenDateMm800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWhenDateMm800,WHEN_DATE_MM_800_LEN);
   	
   }
   
     /**
	 * 	Update WhenDateMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWhenDateMm800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of whenDateDd800
	 *	@return whenDateDd800
	 */
   public char[] getWhenDateDd800() throws CFException{
     if (isWhenDateDd800Modified()) { 
        whenDateDd800 = refreshWhenDateDd800();
     }
   		return whenDateDd800;
   }

  
	/**
	*  set variable whenDateDd800
	*  Corresponding COBOL Variable is 800-WHEN-DATE-DD
	*  @param value
	**/
   public void setWhenDateDd800(char[] value) {
      whenDateDd800 = checkWhenDateDd800Constraints(value);
      serializeWhenDateDd800(whenDateDd800);
   } 

     /**
	 * 	Update WhenDateDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenDateDd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWhenDateDd800,whenDateDd800.length);
   	
   }
   
   public void setWhenDateDd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWhenDateDd800,whenDateDd800.length);
   	
   }
   
     /**
	 * 	Update WhenDateDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWhenDateDd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WhenDateDd800 with another Field
	 *	@param value
	 */
   public void setWhenDateDd800(Field source) {
       replace(source,0,source.length(),beginWhenDateDd800,WHEN_DATE_DD_800_LEN);
   	
   }  
   
     /**
	 * 	Update WhenDateDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenDateDd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWhenDateDd800,WHEN_DATE_DD_800_LEN);
   	
   }
   
     /**
	 * 	Update WhenDateDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWhenDateDd800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWhenCompDate800FieldLength() {
			return WHEN_COMP_DATE_800_LENGTH;
		}

}
  
