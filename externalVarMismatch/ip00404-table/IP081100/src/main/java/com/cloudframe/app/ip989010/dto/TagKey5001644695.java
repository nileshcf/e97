package com.cloudframe.app.ip989010.dto;

/**
*  The class TagKey5001644695 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TagKey5001644695 extends TagKey5001644695Serialized { 
   

						private char[] tagType5001644695 = Field.fillLowValue(1);

								private int tagNum5001644695;

								private int tagSubfldNo5001644695;

								private int tagOccur5001644695;
	
	/**
	* Constructor for TagKey5001644695
	**/
    public TagKey5001644695() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TagKey5001644695. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TagKey5001644695(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tagType5001644695
	 *	@return tagType5001644695
	 */
   public char[] getTagType5001644695() throws CFException{
     if (isTagType5001644695Modified()) { 
        tagType5001644695 = refreshTagType5001644695();
     }
   		return tagType5001644695;
   }

  
	/**
	*  set variable tagType5001644695
	*  Corresponding COBOL Variable is 500-1644695-TAG-TYPE
	*  @param value
	**/
   public void setTagType5001644695(char[] value) {
      tagType5001644695 = checkTagType5001644695Constraints(value);
      serializeTagType5001644695(tagType5001644695);
   } 

     /**
	 * 	Update TagType5001644695 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagType5001644695(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTagType5001644695,tagType5001644695.length);
   	
   }
   
   public void setTagType5001644695(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTagType5001644695,tagType5001644695.length);
   	
   }
   
     /**
	 * 	Update TagType5001644695 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagType5001644695(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagType5001644695+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TagType5001644695 with another Field
	 *	@param value
	 */
   public void setTagType5001644695(Field source) {
       replace(source,0,source.length(),beginTagType5001644695,TAG_TYPE_5001644695_LEN);
   	
   }  
   
     /**
	 * 	Update TagType5001644695 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagType5001644695(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTagType5001644695,TAG_TYPE_5001644695_LEN);
   	
   }
   
     /**
	 * 	Update TagType5001644695 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagType5001644695(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagType5001644695+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tagNum5001644695
	 *	@return tagNum5001644695
	 */
	public int getTagNum5001644695() throws CFException {
       if (isTagNum5001644695Modified()) { 
           tagNum5001644695 = refreshTagNum5001644695();
        }
   		return tagNum5001644695;
	}
	

	
	   
	/**
	 * 	Update TagNum5001644695 with the passed value
	 *  Corresponding COBOL Variable is 500-1644695-TAG-NUM
	 *	@param number
	 */
	public void setTagNum5001644695(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagNum5001644695 = checkTagNum5001644695MaxLimit(number); 
		serializeTagNum5001644695(tagNum5001644695);
	}
	

	public void setTagNum5001644695(long number) {
	    number = checkTagNum5001644695MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagNum5001644695((int)number);
	}
	
	/**
	 * 	Update TagNum5001644695 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagNum5001644695(char[] value) throws CFException {
		 tagNum5001644695 = serializeTagNum5001644695(value);
	}
	/**
	 * 	Update TagNum5001644695 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagNum5001644695String(char[] value) throws CFException {
		 setTagNum5001644695(value);
	}
	/**
	 *	Returns the value of tagSubfldNo5001644695
	 *	@return tagSubfldNo5001644695
	 */
	public int getTagSubfldNo5001644695() throws CFException {
       if (isTagSubfldNo5001644695Modified()) { 
           tagSubfldNo5001644695 = refreshTagSubfldNo5001644695();
        }
   		return tagSubfldNo5001644695;
	}
	

	
	   
	/**
	 * 	Update TagSubfldNo5001644695 with the passed value
	 *  Corresponding COBOL Variable is 500-1644695-TAG-SUBFLD-NO
	 *	@param number
	 */
	public void setTagSubfldNo5001644695(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagSubfldNo5001644695 = checkTagSubfldNo5001644695MaxLimit(number); 
		serializeTagSubfldNo5001644695(tagSubfldNo5001644695);
	}
	

	public void setTagSubfldNo5001644695(long number) {
	    number = checkTagSubfldNo5001644695MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagSubfldNo5001644695((int)number);
	}
	
	/**
	 * 	Update TagSubfldNo5001644695 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagSubfldNo5001644695(char[] value) throws CFException {
		 tagSubfldNo5001644695 = serializeTagSubfldNo5001644695(value);
	}
	/**
	 * 	Update TagSubfldNo5001644695 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagSubfldNo5001644695String(char[] value) throws CFException {
		 setTagSubfldNo5001644695(value);
	}
	/**
	 *	Returns the value of tagOccur5001644695
	 *	@return tagOccur5001644695
	 */
	public int getTagOccur5001644695() throws CFException {
       if (isTagOccur5001644695Modified()) { 
           tagOccur5001644695 = refreshTagOccur5001644695();
        }
   		return tagOccur5001644695;
	}
	

	
	   
	/**
	 * 	Update TagOccur5001644695 with the passed value
	 *  Corresponding COBOL Variable is 500-1644695-TAG-OCCUR
	 *	@param number
	 */
	public void setTagOccur5001644695(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagOccur5001644695 = checkTagOccur5001644695MaxLimit(number); 
		serializeTagOccur5001644695(tagOccur5001644695);
	}
	

	public void setTagOccur5001644695(long number) {
	    number = checkTagOccur5001644695MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagOccur5001644695((int)number);
	}
	
	/**
	 * 	Update TagOccur5001644695 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagOccur5001644695(char[] value) throws CFException {
		 tagOccur5001644695 = serializeTagOccur5001644695(value);
	}
	/**
	 * 	Update TagOccur5001644695 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagOccur5001644695String(char[] value) throws CFException {
		 setTagOccur5001644695(value);
	}

	
	
	

		public static int getTagKey5001644695FieldLength() {
			return TAG_KEY_5001644695_LENGTH;
		}

}
  
