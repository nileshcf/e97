package com.cloudframe.app.ip989010.dto;

/**
*  The class TagData5001644697 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TagData5001644697 extends TagData5001644697Serialized { 
   

								private int tagLen5001644697;

						private char[] tagValue5001644697 = Field.fillLowValue(999);
	
	/**
	* Constructor for TagData5001644697
	**/
    public TagData5001644697() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TagData5001644697. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TagData5001644697(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tagLen5001644697
	 *	@return tagLen5001644697
	 */
	public int getTagLen5001644697() throws CFException {
       if (isTagLen5001644697Modified()) { 
           tagLen5001644697 = refreshTagLen5001644697();
        }
   		return tagLen5001644697;
	}
	

	
	   
	/**
	 * 	Update TagLen5001644697 with the passed value
	 *  Corresponding COBOL Variable is 500-1644697-TAG-LEN
	 *	@param number
	 */
	public void setTagLen5001644697(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagLen5001644697 = checkTagLen5001644697MaxLimit(number); 
		serializeTagLen5001644697(tagLen5001644697);
	}
	

	public void setTagLen5001644697(long number) {
	    number = checkTagLen5001644697MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagLen5001644697((int)number);
	}
	
	/**
	 * 	Update TagLen5001644697 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagLen5001644697(char[] value) throws CFException {
		 tagLen5001644697 = serializeTagLen5001644697(value);
	}
	/**
	 * 	Update TagLen5001644697 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagLen5001644697String(char[] value) throws CFException {
		 setTagLen5001644697(value);
	}
	/**
	 *	Returns the value of tagValue5001644697
	 *	@return tagValue5001644697
	 */
   public char[] getTagValue5001644697() throws CFException{
     if (isTagValue5001644697Modified()) { 
        tagValue5001644697 = refreshTagValue5001644697();
     }
   		return tagValue5001644697;
   }

  
	/**
	*  set variable tagValue5001644697
	*  Corresponding COBOL Variable is 500-1644697-TAG-VALUE
	*  @param value
	**/
   public void setTagValue5001644697(char[] value) {
      tagValue5001644697 = checkTagValue5001644697Constraints(value);
      serializeTagValue5001644697(tagValue5001644697);
   } 

     /**
	 * 	Update TagValue5001644697 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagValue5001644697(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTagValue5001644697,tagValue5001644697.length);
   	
   }
   
   public void setTagValue5001644697(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTagValue5001644697,tagValue5001644697.length);
   	
   }
   
     /**
	 * 	Update TagValue5001644697 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagValue5001644697(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagValue5001644697+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TagValue5001644697 with another Field
	 *	@param value
	 */
   public void setTagValue5001644697(Field source) {
       replace(source,0,source.length(),beginTagValue5001644697,TAG_VALUE_5001644697_LEN);
   	
   }  
   
     /**
	 * 	Update TagValue5001644697 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagValue5001644697(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTagValue5001644697,TAG_VALUE_5001644697_LEN);
   	
   }
   
     /**
	 * 	Update TagValue5001644697 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagValue5001644697(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagValue5001644697+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTagData5001644697FieldLength() {
			return TAG_DATA_5001644697_LENGTH;
		}

}
  
