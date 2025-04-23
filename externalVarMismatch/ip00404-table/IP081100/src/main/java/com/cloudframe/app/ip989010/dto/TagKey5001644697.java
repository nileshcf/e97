package com.cloudframe.app.ip989010.dto;

/**
*  The class TagKey5001644697 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TagKey5001644697 extends TagKey5001644697Serialized { 
   

						private char[] tagType5001644697 = Field.fillLowValue(1);

								private int tagNum5001644697;

								private int tagSubfldNo5001644697;

								private int tagOccur5001644697;
	
	/**
	* Constructor for TagKey5001644697
	**/
    public TagKey5001644697() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TagKey5001644697. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TagKey5001644697(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tagType5001644697
	 *	@return tagType5001644697
	 */
   public char[] getTagType5001644697() throws CFException{
     if (isTagType5001644697Modified()) { 
        tagType5001644697 = refreshTagType5001644697();
     }
   		return tagType5001644697;
   }

  
	/**
	*  set variable tagType5001644697
	*  Corresponding COBOL Variable is 500-1644697-TAG-TYPE
	*  @param value
	**/
   public void setTagType5001644697(char[] value) {
      tagType5001644697 = checkTagType5001644697Constraints(value);
      serializeTagType5001644697(tagType5001644697);
   } 

     /**
	 * 	Update TagType5001644697 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagType5001644697(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTagType5001644697,tagType5001644697.length);
   	
   }
   
   public void setTagType5001644697(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTagType5001644697,tagType5001644697.length);
   	
   }
   
     /**
	 * 	Update TagType5001644697 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagType5001644697(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagType5001644697+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TagType5001644697 with another Field
	 *	@param value
	 */
   public void setTagType5001644697(Field source) {
       replace(source,0,source.length(),beginTagType5001644697,TAG_TYPE_5001644697_LEN);
   	
   }  
   
     /**
	 * 	Update TagType5001644697 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagType5001644697(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTagType5001644697,TAG_TYPE_5001644697_LEN);
   	
   }
   
     /**
	 * 	Update TagType5001644697 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagType5001644697(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagType5001644697+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tagNum5001644697
	 *	@return tagNum5001644697
	 */
	public int getTagNum5001644697() throws CFException {
       if (isTagNum5001644697Modified()) { 
           tagNum5001644697 = refreshTagNum5001644697();
        }
   		return tagNum5001644697;
	}
	

	
	   
	/**
	 * 	Update TagNum5001644697 with the passed value
	 *  Corresponding COBOL Variable is 500-1644697-TAG-NUM
	 *	@param number
	 */
	public void setTagNum5001644697(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagNum5001644697 = checkTagNum5001644697MaxLimit(number); 
		serializeTagNum5001644697(tagNum5001644697);
	}
	

	public void setTagNum5001644697(long number) {
	    number = checkTagNum5001644697MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagNum5001644697((int)number);
	}
	
	/**
	 * 	Update TagNum5001644697 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagNum5001644697(char[] value) throws CFException {
		 tagNum5001644697 = serializeTagNum5001644697(value);
	}
	/**
	 * 	Update TagNum5001644697 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagNum5001644697String(char[] value) throws CFException {
		 setTagNum5001644697(value);
	}
	/**
	 *	Returns the value of tagSubfldNo5001644697
	 *	@return tagSubfldNo5001644697
	 */
	public int getTagSubfldNo5001644697() throws CFException {
       if (isTagSubfldNo5001644697Modified()) { 
           tagSubfldNo5001644697 = refreshTagSubfldNo5001644697();
        }
   		return tagSubfldNo5001644697;
	}
	

	
	   
	/**
	 * 	Update TagSubfldNo5001644697 with the passed value
	 *  Corresponding COBOL Variable is 500-1644697-TAG-SUBFLD-NO
	 *	@param number
	 */
	public void setTagSubfldNo5001644697(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagSubfldNo5001644697 = checkTagSubfldNo5001644697MaxLimit(number); 
		serializeTagSubfldNo5001644697(tagSubfldNo5001644697);
	}
	

	public void setTagSubfldNo5001644697(long number) {
	    number = checkTagSubfldNo5001644697MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagSubfldNo5001644697((int)number);
	}
	
	/**
	 * 	Update TagSubfldNo5001644697 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagSubfldNo5001644697(char[] value) throws CFException {
		 tagSubfldNo5001644697 = serializeTagSubfldNo5001644697(value);
	}
	/**
	 * 	Update TagSubfldNo5001644697 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagSubfldNo5001644697String(char[] value) throws CFException {
		 setTagSubfldNo5001644697(value);
	}
	/**
	 *	Returns the value of tagOccur5001644697
	 *	@return tagOccur5001644697
	 */
	public int getTagOccur5001644697() throws CFException {
       if (isTagOccur5001644697Modified()) { 
           tagOccur5001644697 = refreshTagOccur5001644697();
        }
   		return tagOccur5001644697;
	}
	

	
	   
	/**
	 * 	Update TagOccur5001644697 with the passed value
	 *  Corresponding COBOL Variable is 500-1644697-TAG-OCCUR
	 *	@param number
	 */
	public void setTagOccur5001644697(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagOccur5001644697 = checkTagOccur5001644697MaxLimit(number); 
		serializeTagOccur5001644697(tagOccur5001644697);
	}
	

	public void setTagOccur5001644697(long number) {
	    number = checkTagOccur5001644697MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagOccur5001644697((int)number);
	}
	
	/**
	 * 	Update TagOccur5001644697 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagOccur5001644697(char[] value) throws CFException {
		 tagOccur5001644697 = serializeTagOccur5001644697(value);
	}
	/**
	 * 	Update TagOccur5001644697 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagOccur5001644697String(char[] value) throws CFException {
		 setTagOccur5001644697(value);
	}

	
	
	

		public static int getTagKey5001644697FieldLength() {
			return TAG_KEY_5001644697_LENGTH;
		}

}
  
