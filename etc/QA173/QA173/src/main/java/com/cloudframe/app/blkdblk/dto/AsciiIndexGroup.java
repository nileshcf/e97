package com.cloudframe.app.blkdblk.dto;

/**
*  The class AsciiIndexGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.blkdblk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AsciiIndexGroup extends AsciiIndexGroupSerialized {
   

								private short asciiIndex;
					private AsciiBytes asciiBytes = new AsciiBytes();
	
	/**
	* Constructor for AsciiIndexGroup
	**/
    public AsciiIndexGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			asciiBytes.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of asciiIndex
	 *	@return asciiIndex
	 */
	public short getAsciiIndex() throws CFException {
        if (isAsciiIndexModified()) { 
           asciiIndex = refreshAsciiIndex();
        }
   		return asciiIndex;
	}
	
	/**
	 * 	Update AsciiIndex with the passed value
	 *  Corresponding COBOL Variable is ASCII-INDEX
	 *	@param number
	 */
	public void setAsciiIndex(short number) {
	     // Truncate if the number is beyond +/- Max range
	    asciiIndex = checkAsciiIndexMaxLimit(number); 
		serializeAsciiIndex(asciiIndex);
	}

	public void setAsciiIndex(int number) {
	    number = checkAsciiIndexMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAsciiIndex((short)number);
	}
	public void setAsciiIndex(long number) {
	    number = checkAsciiIndexMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAsciiIndex((short)number);
	}
	

	/**
	 *	Returns the value of asciiBytes
	 *	@return asciiBytes
	 */   
	 public AsciiBytes getAsciiBytes() {
   	return asciiBytes;
   }
   /**
	* 	Update AsciiBytes with the passed value
	*   Corresponding COBOL Variable is ASCII-BYTES
	*	@param value
	*/
   public void setAsciiBytes(char[] value) {
      asciiBytes.setString(value); 
   }   
    
     /**
	 * 	Update AsciiBytes 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAsciiBytes(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,asciiBytes.begin,asciiBytes.length());
   }
   
     /**
	 * 	Update AsciiBytes 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsciiBytes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,asciiBytes.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AsciiBytes with another Field
	 *	@param value
	 */
   public void setAsciiBytes(Field source) {
   	replace(source,0,source.length(),asciiBytes.begin,asciiBytes.length());
   }  
   
     /**
	 * 	Update AsciiBytes 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAsciiBytes(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,asciiBytes.begin,asciiBytes.length());
   }
   
     /**
	 * 	Update AsciiBytes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsciiBytes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,asciiBytes.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getAsciiIndexGroupFieldLength() {
			return ASCII_INDEX_GROUP_LENGTH;
		}

}
  
