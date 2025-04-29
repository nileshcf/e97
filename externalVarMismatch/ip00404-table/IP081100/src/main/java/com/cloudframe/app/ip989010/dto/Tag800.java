package com.cloudframe.app.ip989010.dto;

/**
*  The class Tag800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Tag800 extends Tag800Serialized { 
   

								private int tagType800;

								private int tagNum800;

								private int tagOccur800;

								private int tagSubfldNo800;

								private int tagStart800;

								private int tagLngth800;
	
	/**
	* Constructor for Tag800
	**/
    public Tag800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Tag800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Tag800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setTagType800(0);
								setTagNum800(0);
								setTagOccur800(0);
								setTagSubfldNo800(0);
								setTagStart800(0);
								setTagLngth800(0);
    } 

	/**
	 *	Returns the value of tagType800
	 *	@return tagType800
	 */
	public int getTagType800() throws CFException {
       if (isTagType800Modified()) { 
           tagType800 = refreshTagType800();
        }
   		return tagType800;
	}
	

	
	   
	/**
	 * 	Update TagType800 with the passed value
	 *  Corresponding COBOL Variable is 800-TAG-TYPE
	 *	@param number
	 */
	public void setTagType800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagType800 = checkTagType800MaxLimit(number); 
		serializeTagType800(tagType800);
	}
	

	public void setTagType800(long number) {
	    number = checkTagType800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagType800((int)number);
	}
	
	/**
	 * 	Update TagType800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagType800(char[] value) throws CFException {
		 tagType800 = serializeTagType800(value);
	}
	/**
	 * 	Update TagType800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagType800String(char[] value) throws CFException {
		 setTagType800(value);
	}
	/**
	 *	Returns the value of tagNum800
	 *	@return tagNum800
	 */
	public int getTagNum800() throws CFException {
       if (isTagNum800Modified()) { 
           tagNum800 = refreshTagNum800();
        }
   		return tagNum800;
	}
	

	
	   
	/**
	 * 	Update TagNum800 with the passed value
	 *  Corresponding COBOL Variable is 800-TAG-NUM
	 *	@param number
	 */
	public void setTagNum800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagNum800 = checkTagNum800MaxLimit(number); 
		serializeTagNum800(tagNum800);
	}
	

	public void setTagNum800(long number) {
	    number = checkTagNum800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagNum800((int)number);
	}
	
	/**
	 * 	Update TagNum800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagNum800(char[] value) throws CFException {
		 tagNum800 = serializeTagNum800(value);
	}
	/**
	 * 	Update TagNum800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagNum800String(char[] value) throws CFException {
		 setTagNum800(value);
	}
	/**
	 *	Returns the value of tagOccur800
	 *	@return tagOccur800
	 */
	public int getTagOccur800() throws CFException {
       if (isTagOccur800Modified()) { 
           tagOccur800 = refreshTagOccur800();
        }
   		return tagOccur800;
	}
	

	
	   
	/**
	 * 	Update TagOccur800 with the passed value
	 *  Corresponding COBOL Variable is 800-TAG-OCCUR
	 *	@param number
	 */
	public void setTagOccur800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagOccur800 = checkTagOccur800MaxLimit(number); 
		serializeTagOccur800(tagOccur800);
	}
	

	public void setTagOccur800(long number) {
	    number = checkTagOccur800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagOccur800((int)number);
	}
	
	/**
	 * 	Update TagOccur800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagOccur800(char[] value) throws CFException {
		 tagOccur800 = serializeTagOccur800(value);
	}
	/**
	 * 	Update TagOccur800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagOccur800String(char[] value) throws CFException {
		 setTagOccur800(value);
	}
	/**
	 *	Returns the value of tagSubfldNo800
	 *	@return tagSubfldNo800
	 */
	public int getTagSubfldNo800() throws CFException {
       if (isTagSubfldNo800Modified()) { 
           tagSubfldNo800 = refreshTagSubfldNo800();
        }
   		return tagSubfldNo800;
	}
	

	
	   
	/**
	 * 	Update TagSubfldNo800 with the passed value
	 *  Corresponding COBOL Variable is 800-TAG-SUBFLD-NO
	 *	@param number
	 */
	public void setTagSubfldNo800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagSubfldNo800 = checkTagSubfldNo800MaxLimit(number); 
		serializeTagSubfldNo800(tagSubfldNo800);
	}
	

	public void setTagSubfldNo800(long number) {
	    number = checkTagSubfldNo800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagSubfldNo800((int)number);
	}
	
	/**
	 * 	Update TagSubfldNo800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagSubfldNo800(char[] value) throws CFException {
		 tagSubfldNo800 = serializeTagSubfldNo800(value);
	}
	/**
	 * 	Update TagSubfldNo800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagSubfldNo800String(char[] value) throws CFException {
		 setTagSubfldNo800(value);
	}
	/**
	 *	Returns the value of tagStart800
	 *	@return tagStart800
	 */
	public int getTagStart800() throws CFException {
       if (isTagStart800Modified()) { 
           tagStart800 = refreshTagStart800();
        }
   		return tagStart800;
	}
	

	
	   
	/**
	 * 	Update TagStart800 with the passed value
	 *  Corresponding COBOL Variable is 800-TAG-START
	 *	@param number
	 */
	public void setTagStart800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagStart800 = checkTagStart800MaxLimit(number); 
		serializeTagStart800(tagStart800);
	}
	

	public void setTagStart800(long number) {
	    number = checkTagStart800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagStart800((int)number);
	}
	
	/**
	 * 	Update TagStart800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagStart800(char[] value) throws CFException {
		 tagStart800 = serializeTagStart800(value);
	}
	/**
	 * 	Update TagStart800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagStart800String(char[] value) throws CFException {
		 setTagStart800(value);
	}
	/**
	 *	Returns the value of tagLngth800
	 *	@return tagLngth800
	 */
	public int getTagLngth800() throws CFException {
       if (isTagLngth800Modified()) { 
           tagLngth800 = refreshTagLngth800();
        }
   		return tagLngth800;
	}
	

	
	   
	/**
	 * 	Update TagLngth800 with the passed value
	 *  Corresponding COBOL Variable is 800-TAG-LNGTH
	 *	@param number
	 */
	public void setTagLngth800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagLngth800 = checkTagLngth800MaxLimit(number); 
		serializeTagLngth800(tagLngth800);
	}
	

	public void setTagLngth800(long number) {
	    number = checkTagLngth800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTagLngth800((int)number);
	}
	
	/**
	 * 	Update TagLngth800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagLngth800(char[] value) throws CFException {
		 tagLngth800 = serializeTagLngth800(value);
	}
	/**
	 * 	Update TagLngth800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagLngth800String(char[] value) throws CFException {
		 setTagLngth800(value);
	}

	
	
	

		public static int getTag800FieldLength() {
			return TAG_800_LENGTH;
		}

}
  
