package com.cloudframe.app.sf305120.dto;

/**
*  The class AsciiTextWGroup300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AsciiTextWGroup300 extends AsciiTextWGroup300Serialized {
   
					private AsciiTextW300 asciiTextW300 = new AsciiTextW300();

						private char[] asciiText300 = Field.fillLowValue(86);
	
	/**
	* Constructor for AsciiTextWGroup300
	**/
    public AsciiTextWGroup300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			asciiTextW300.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of asciiTextW300
	 *	@return asciiTextW300
	 */   
	 public AsciiTextW300 getAsciiTextW300() {
   	return asciiTextW300;
   }
   /**
	* 	Update AsciiTextW300 with the passed value
	*   Corresponding COBOL Variable is 300-ASCII-TEXT-W
	*	@param value
	*/
   public void setAsciiTextW300(char[] value) {
      asciiTextW300.setString(value); 
   }   
    
     /**
	 * 	Update AsciiTextW300 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAsciiTextW300(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextW300.begin,asciiTextW300.length());
   }
   
     /**
	 * 	Update AsciiTextW300 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsciiTextW300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextW300.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AsciiTextW300 with another Field
	 *	@param value
	 */
   public void setAsciiTextW300(Field source) {
   	replace(source,0,source.length(),asciiTextW300.begin,asciiTextW300.length());
   }  
   
     /**
	 * 	Update AsciiTextW300 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAsciiTextW300(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextW300.begin,asciiTextW300.length());
   }
   
     /**
	 * 	Update AsciiTextW300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsciiTextW300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextW300.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of asciiText300
	 *	@return asciiText300
	 */
   public char[] getAsciiText300() throws CFException{
     if (isAsciiText300Modified()) { 
        asciiText300 = refreshAsciiText300();
     }
   		return asciiText300;
   }

  
	/**
	*  set variable asciiText300
	*  Corresponding COBOL Variable is 300-ASCII-TEXT
	*  @param value
	**/
   public void setAsciiText300(char[] value) {
      asciiText300 = checkAsciiText300Constraints(value);
      serializeAsciiText300(asciiText300);
   } 

     /**
	 * 	Update AsciiText300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAsciiText300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAsciiText300,asciiText300.length);
   	
   }
   
   public void setAsciiText300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAsciiText300,asciiText300.length);
   	
   }
   
     /**
	 * 	Update AsciiText300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsciiText300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsciiText300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AsciiText300 with another Field
	 *	@param value
	 */
   public void setAsciiText300(Field source) {
       replace(source,0,source.length(),beginAsciiText300,ASCII_TEXT_300_LEN);
   	
   }  
   
     /**
	 * 	Update AsciiText300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAsciiText300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAsciiText300,ASCII_TEXT_300_LEN);
   	
   }
   
     /**
	 * 	Update AsciiText300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsciiText300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsciiText300+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAsciiTextWGroup300FieldLength() {
			return ASCII_TEXT_WGROUP_300_LENGTH;
		}

}
  
