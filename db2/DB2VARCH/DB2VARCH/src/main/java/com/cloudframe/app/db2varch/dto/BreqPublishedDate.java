package com.cloudframe.app.db2varch.dto;

/**
*  The class BreqPublishedDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:42. using version 5.0.0.254
**/


import com.cloudframe.app.db2varch.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BreqPublishedDate extends BreqPublishedDateSerialized { 
   

								private short breqPublishedDateLen;

						private char[] breqPublishedDateText = Field.fillLowValue(255);
	
	/**
	* Constructor for BreqPublishedDate
	**/
    public BreqPublishedDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BreqPublishedDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BreqPublishedDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of breqPublishedDateLen
	 *	@return breqPublishedDateLen
	 */
	public short getBreqPublishedDateLen() throws CFException {
        if (isBreqPublishedDateLenModified()) { 
           breqPublishedDateLen = refreshBreqPublishedDateLen();
        }
   		return breqPublishedDateLen;
	}
	
	/**
	 * 	Update BreqPublishedDateLen with the passed value
	 *  Corresponding COBOL Variable is BREQ-PUBLISHED-DATE-LEN
	 *	@param number
	 */
	public void setBreqPublishedDateLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    breqPublishedDateLen = checkBreqPublishedDateLenMaxLimit(number); 
		serializeBreqPublishedDateLen(breqPublishedDateLen);
	}

	public void setBreqPublishedDateLen(int number) {
	    number = checkBreqPublishedDateLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBreqPublishedDateLen((short)number);
	}
	public void setBreqPublishedDateLen(long number) {
	    number = checkBreqPublishedDateLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBreqPublishedDateLen((short)number);
	}
	

	/**
	 *	Returns the value of breqPublishedDateText
	 *	@return breqPublishedDateText
	 */
   public char[] getBreqPublishedDateText() throws CFException{
     if (isBreqPublishedDateTextModified()) { 
        breqPublishedDateText = refreshBreqPublishedDateText();
     }
   		return breqPublishedDateText;
   }

  
	/**
	*  set variable breqPublishedDateText
	*  Corresponding COBOL Variable is BREQ-PUBLISHED-DATE-TEXT
	*  @param value
	**/
   public void setBreqPublishedDateText(char[] value) {
      breqPublishedDateText = checkBreqPublishedDateTextConstraints(value);
      serializeBreqPublishedDateText(breqPublishedDateText);
   } 

     /**
	 * 	Update BreqPublishedDateText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBreqPublishedDateText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBreqPublishedDateText,breqPublishedDateText.length);
   	
   }
   
   public void setBreqPublishedDateText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBreqPublishedDateText,breqPublishedDateText.length);
   	
   }
   
     /**
	 * 	Update BreqPublishedDateText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBreqPublishedDateText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBreqPublishedDateText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BreqPublishedDateText with another Field
	 *	@param value
	 */
   public void setBreqPublishedDateText(Field source) {
       replace(source,0,source.length(),beginBreqPublishedDateText,BREQ_PUBLISHED_DATE_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update BreqPublishedDateText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBreqPublishedDateText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBreqPublishedDateText,BREQ_PUBLISHED_DATE_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update BreqPublishedDateText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBreqPublishedDateText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBreqPublishedDateText+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBreqPublishedDateFieldLength() {
			return BREQ_PUBLISHED_DATE_LENGTH;
		}

}
  
