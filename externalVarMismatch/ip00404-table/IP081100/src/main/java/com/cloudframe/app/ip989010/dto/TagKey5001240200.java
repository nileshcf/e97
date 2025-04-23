package com.cloudframe.app.ip989010.dto;

/**
*  The class TagKey5001240200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TagKey5001240200 extends TagKey5001240200Serialized { 
   

						private char[] tagType5001240200 = Field.fillLowValue(1);

								private int tagNum5001240200;

								private int tagSubfldNo5001240200;

								private int tagOccur5001240200;
	
	/**
	* Constructor for TagKey5001240200
	**/
    public TagKey5001240200() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TagKey5001240200. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TagKey5001240200(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tagType5001240200
	 *	@return tagType5001240200
	 */
   public char[] getTagType5001240200() throws CFException{
     if (isTagType5001240200Modified()) { 
        tagType5001240200 = refreshTagType5001240200();
     }
   		return tagType5001240200;
   }

  
	/**
	*  set variable tagType5001240200
	*  Corresponding COBOL Variable is 500-1240200-TAG-TYPE
	*  @param value
	**/
   public void setTagType5001240200(char[] value) {
      tagType5001240200 = checkTagType5001240200Constraints(value);
      serializeTagType5001240200(tagType5001240200);
   } 

     /**
	 * 	Update TagType5001240200 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagType5001240200(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTagType5001240200,tagType5001240200.length);
   	
   }
   
   public void setTagType5001240200(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTagType5001240200,tagType5001240200.length);
   	
   }
   
     /**
	 * 	Update TagType5001240200 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagType5001240200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagType5001240200+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TagType5001240200 with another Field
	 *	@param value
	 */
   public void setTagType5001240200(Field source) {
       replace(source,0,source.length(),beginTagType5001240200,TAG_TYPE_5001240200_LEN);
   	
   }  
   
     /**
	 * 	Update TagType5001240200 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagType5001240200(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTagType5001240200,TAG_TYPE_5001240200_LEN);
   	
   }
   
     /**
	 * 	Update TagType5001240200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagType5001240200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagType5001240200+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tagNum5001240200
	 *	@return tagNum5001240200
	 */
	public int getTagNum5001240200() throws CFException {
       if (isTagNum5001240200Modified()) { 
           tagNum5001240200 = refreshTagNum5001240200();
        }
   		return tagNum5001240200;
	}
	

	
	   
	/**
	 * 	Update TagNum5001240200 with the passed value
	 *  Corresponding COBOL Variable is 500-1240200-TAG-NUM
	 *	@param number
	 */
	public void setTagNum5001240200(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagNum5001240200 = checkTagNum5001240200MaxLimit(number); 
		serializeTagNum5001240200(tagNum5001240200);
	}
	

	public void setTagNum5001240200(long number) {
	    number = checkTagNum5001240200MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagNum5001240200((int)number);
	}
	
	/**
	 * 	Update TagNum5001240200 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagNum5001240200(char[] value) throws CFException {
		 tagNum5001240200 = serializeTagNum5001240200(value);
	}
	/**
	 * 	Update TagNum5001240200 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagNum5001240200String(char[] value) throws CFException {
		 setTagNum5001240200(value);
	}
	/**
	 *	Returns the value of tagSubfldNo5001240200
	 *	@return tagSubfldNo5001240200
	 */
	public int getTagSubfldNo5001240200() throws CFException {
       if (isTagSubfldNo5001240200Modified()) { 
           tagSubfldNo5001240200 = refreshTagSubfldNo5001240200();
        }
   		return tagSubfldNo5001240200;
	}
	

	
	   
	/**
	 * 	Update TagSubfldNo5001240200 with the passed value
	 *  Corresponding COBOL Variable is 500-1240200-TAG-SUBFLD-NO
	 *	@param number
	 */
	public void setTagSubfldNo5001240200(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagSubfldNo5001240200 = checkTagSubfldNo5001240200MaxLimit(number); 
		serializeTagSubfldNo5001240200(tagSubfldNo5001240200);
	}
	

	public void setTagSubfldNo5001240200(long number) {
	    number = checkTagSubfldNo5001240200MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagSubfldNo5001240200((int)number);
	}
	
	/**
	 * 	Update TagSubfldNo5001240200 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagSubfldNo5001240200(char[] value) throws CFException {
		 tagSubfldNo5001240200 = serializeTagSubfldNo5001240200(value);
	}
	/**
	 * 	Update TagSubfldNo5001240200 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagSubfldNo5001240200String(char[] value) throws CFException {
		 setTagSubfldNo5001240200(value);
	}
	/**
	 *	Returns the value of tagOccur5001240200
	 *	@return tagOccur5001240200
	 */
	public int getTagOccur5001240200() throws CFException {
       if (isTagOccur5001240200Modified()) { 
           tagOccur5001240200 = refreshTagOccur5001240200();
        }
   		return tagOccur5001240200;
	}
	

	
	   
	/**
	 * 	Update TagOccur5001240200 with the passed value
	 *  Corresponding COBOL Variable is 500-1240200-TAG-OCCUR
	 *	@param number
	 */
	public void setTagOccur5001240200(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagOccur5001240200 = checkTagOccur5001240200MaxLimit(number); 
		serializeTagOccur5001240200(tagOccur5001240200);
	}
	

	public void setTagOccur5001240200(long number) {
	    number = checkTagOccur5001240200MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagOccur5001240200((int)number);
	}
	
	/**
	 * 	Update TagOccur5001240200 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagOccur5001240200(char[] value) throws CFException {
		 tagOccur5001240200 = serializeTagOccur5001240200(value);
	}
	/**
	 * 	Update TagOccur5001240200 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagOccur5001240200String(char[] value) throws CFException {
		 setTagOccur5001240200(value);
	}

	
	
	

		public static int getTagKey5001240200FieldLength() {
			return TAG_KEY_5001240200_LENGTH;
		}

}
  
