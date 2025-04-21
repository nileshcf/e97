package com.cloudframe.app.ip989010.dto;

/**
*  The class TagData5001240200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TagData5001240200 extends TagData5001240200Serialized { 
   

								private int tagLen5001240200;

						private char[] tagValue5001240200 = Field.fillLowValue(999);
	
	/**
	* Constructor for TagData5001240200
	**/
    public TagData5001240200() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TagData5001240200. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TagData5001240200(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tagLen5001240200
	 *	@return tagLen5001240200
	 */
	public int getTagLen5001240200() throws CFException {
       if (isTagLen5001240200Modified()) { 
           tagLen5001240200 = refreshTagLen5001240200();
        }
   		return tagLen5001240200;
	}
	

	
	   
	/**
	 * 	Update TagLen5001240200 with the passed value
	 *  Corresponding COBOL Variable is 500-1240200-TAG-LEN
	 *	@param number
	 */
	public void setTagLen5001240200(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagLen5001240200 = checkTagLen5001240200MaxLimit(number); 
		serializeTagLen5001240200(tagLen5001240200);
	}
	

	public void setTagLen5001240200(long number) {
	    number = checkTagLen5001240200MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagLen5001240200((int)number);
	}
	
	/**
	 * 	Update TagLen5001240200 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagLen5001240200(char[] value) throws CFException {
		 tagLen5001240200 = serializeTagLen5001240200(value);
	}
	/**
	 * 	Update TagLen5001240200 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagLen5001240200String(char[] value) throws CFException {
		 setTagLen5001240200(value);
	}
	/**
	 *	Returns the value of tagValue5001240200
	 *	@return tagValue5001240200
	 */
   public char[] getTagValue5001240200() throws CFException{
     if (isTagValue5001240200Modified()) { 
        tagValue5001240200 = refreshTagValue5001240200();
     }
   		return tagValue5001240200;
   }

  
	/**
	*  set variable tagValue5001240200
	*  Corresponding COBOL Variable is 500-1240200-TAG-VALUE
	*  @param value
	**/
   public void setTagValue5001240200(char[] value) {
      tagValue5001240200 = checkTagValue5001240200Constraints(value);
      serializeTagValue5001240200(tagValue5001240200);
   } 

     /**
	 * 	Update TagValue5001240200 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagValue5001240200(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTagValue5001240200,tagValue5001240200.length);
   	
   }
   
   public void setTagValue5001240200(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTagValue5001240200,tagValue5001240200.length);
   	
   }
   
     /**
	 * 	Update TagValue5001240200 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagValue5001240200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagValue5001240200+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TagValue5001240200 with another Field
	 *	@param value
	 */
   public void setTagValue5001240200(Field source) {
       replace(source,0,source.length(),beginTagValue5001240200,TAG_VALUE_5001240200_LEN);
   	
   }  
   
     /**
	 * 	Update TagValue5001240200 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagValue5001240200(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTagValue5001240200,TAG_VALUE_5001240200_LEN);
   	
   }
   
     /**
	 * 	Update TagValue5001240200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagValue5001240200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagValue5001240200+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTagData5001240200FieldLength() {
			return TAG_DATA_5001240200_LENGTH;
		}

}
  
