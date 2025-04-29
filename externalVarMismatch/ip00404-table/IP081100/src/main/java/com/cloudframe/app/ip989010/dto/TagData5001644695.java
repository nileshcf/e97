package com.cloudframe.app.ip989010.dto;

/**
*  The class TagData5001644695 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TagData5001644695 extends TagData5001644695Serialized { 
   

								private int tagLen5001644695;

						private char[] tagValue5001644695 = Field.fillLowValue(999);
	
	/**
	* Constructor for TagData5001644695
	**/
    public TagData5001644695() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TagData5001644695. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TagData5001644695(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tagLen5001644695
	 *	@return tagLen5001644695
	 */
	public int getTagLen5001644695() throws CFException {
       if (isTagLen5001644695Modified()) { 
           tagLen5001644695 = refreshTagLen5001644695();
        }
   		return tagLen5001644695;
	}
	

	
	   
	/**
	 * 	Update TagLen5001644695 with the passed value
	 *  Corresponding COBOL Variable is 500-1644695-TAG-LEN
	 *	@param number
	 */
	public void setTagLen5001644695(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagLen5001644695 = checkTagLen5001644695MaxLimit(number); 
		serializeTagLen5001644695(tagLen5001644695);
	}
	

	public void setTagLen5001644695(long number) {
	    number = checkTagLen5001644695MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagLen5001644695((int)number);
	}
	
	/**
	 * 	Update TagLen5001644695 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagLen5001644695(char[] value) throws CFException {
		 tagLen5001644695 = serializeTagLen5001644695(value);
	}
	/**
	 * 	Update TagLen5001644695 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagLen5001644695String(char[] value) throws CFException {
		 setTagLen5001644695(value);
	}
	/**
	 *	Returns the value of tagValue5001644695
	 *	@return tagValue5001644695
	 */
   public char[] getTagValue5001644695() throws CFException{
     if (isTagValue5001644695Modified()) { 
        tagValue5001644695 = refreshTagValue5001644695();
     }
   		return tagValue5001644695;
   }

  
	/**
	*  set variable tagValue5001644695
	*  Corresponding COBOL Variable is 500-1644695-TAG-VALUE
	*  @param value
	**/
   public void setTagValue5001644695(char[] value) {
      tagValue5001644695 = checkTagValue5001644695Constraints(value);
      serializeTagValue5001644695(tagValue5001644695);
   } 

     /**
	 * 	Update TagValue5001644695 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagValue5001644695(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTagValue5001644695,tagValue5001644695.length);
   	
   }
   
   public void setTagValue5001644695(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTagValue5001644695,tagValue5001644695.length);
   	
   }
   
     /**
	 * 	Update TagValue5001644695 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagValue5001644695(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagValue5001644695+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TagValue5001644695 with another Field
	 *	@param value
	 */
   public void setTagValue5001644695(Field source) {
       replace(source,0,source.length(),beginTagValue5001644695,TAG_VALUE_5001644695_LEN);
   	
   }  
   
     /**
	 * 	Update TagValue5001644695 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagValue5001644695(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTagValue5001644695,TAG_VALUE_5001644695_LEN);
   	
   }
   
     /**
	 * 	Update TagValue5001644695 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagValue5001644695(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagValue5001644695+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTagData5001644695FieldLength() {
			return TAG_DATA_5001644695_LENGTH;
		}

}
  
