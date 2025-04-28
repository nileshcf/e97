package com.cloudframe.app.db2varch.dto;

/**
*  The class PublishedDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.db2varch.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class PublishedDate extends PublishedDateSerialized { 
   

								private short publishedDateLen;

						private char[] publishedDateText = Field.fillLowValue(255);
	
	/**
	* Constructor for PublishedDate
	**/
    public PublishedDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PublishedDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PublishedDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of publishedDateLen
	 *	@return publishedDateLen
	 */
	public short getPublishedDateLen() throws CFException {
        if (isPublishedDateLenModified()) { 
           publishedDateLen = refreshPublishedDateLen();
        }
   		return publishedDateLen;
	}
	
	/**
	 * 	Update PublishedDateLen with the passed value
	 *  Corresponding COBOL Variable is PUBLISHED-DATE-LEN
	 *	@param number
	 */
	public void setPublishedDateLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    publishedDateLen = checkPublishedDateLenMaxLimit(number); 
		serializePublishedDateLen(publishedDateLen);
	}

	public void setPublishedDateLen(int number) {
	    number = checkPublishedDateLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPublishedDateLen((short)number);
	}
	public void setPublishedDateLen(long number) {
	    number = checkPublishedDateLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPublishedDateLen((short)number);
	}
	

	/**
	 *	Returns the value of publishedDateText
	 *	@return publishedDateText
	 */
   public char[] getPublishedDateText() throws CFException{
     if (isPublishedDateTextModified()) { 
        publishedDateText = refreshPublishedDateText();
     }
   		return publishedDateText;
   }

  
	/**
	*  set variable publishedDateText
	*  Corresponding COBOL Variable is PUBLISHED-DATE-TEXT
	*  @param value
	**/
   public void setPublishedDateText(char[] value) {
      publishedDateText = checkPublishedDateTextConstraints(value);
      serializePublishedDateText(publishedDateText);
   } 

     /**
	 * 	Update PublishedDateText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPublishedDateText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPublishedDateText,publishedDateText.length);
   	
   }
   
   public void setPublishedDateText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPublishedDateText,publishedDateText.length);
   	
   }
   
     /**
	 * 	Update PublishedDateText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPublishedDateText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPublishedDateText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PublishedDateText with another Field
	 *	@param value
	 */
   public void setPublishedDateText(Field source) {
       replace(source,0,source.length(),beginPublishedDateText,PUBLISHED_DATE_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update PublishedDateText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPublishedDateText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPublishedDateText,PUBLISHED_DATE_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update PublishedDateText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPublishedDateText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPublishedDateText+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes PublishedDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setPublishedDateLen((short)0);
         setPublishedDateText(CONSTANTS.SPACE_255);
   }

		public static int getPublishedDateFieldLength() {
			return PUBLISHED_DATE_LENGTH;
		}

}
  
