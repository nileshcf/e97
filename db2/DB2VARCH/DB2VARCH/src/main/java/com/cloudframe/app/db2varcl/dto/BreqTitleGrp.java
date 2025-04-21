package com.cloudframe.app.db2varcl.dto;

/**
*  The class BreqTitleGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
**/


import com.cloudframe.app.db2varcl.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BreqTitleGrp extends BreqTitleGrpSerialized { 
   

								private short breqTitleLen;

						private char[] breqTitleText = Field.fillLowValue(255);
	
	/**
	* Constructor for BreqTitleGrp
	**/
    public BreqTitleGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BreqTitleGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BreqTitleGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of breqTitleLen
	 *	@return breqTitleLen
	 */
	public short getBreqTitleLen() throws CFException {
        if (isBreqTitleLenModified()) { 
           breqTitleLen = refreshBreqTitleLen();
        }
   		return breqTitleLen;
	}
	
	/**
	 * 	Update BreqTitleLen with the passed value
	 *  Corresponding COBOL Variable is BREQ-TITLE-LEN
	 *	@param number
	 */
	public void setBreqTitleLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    breqTitleLen = checkBreqTitleLenMaxLimit(number); 
		serializeBreqTitleLen(breqTitleLen);
	}

	public void setBreqTitleLen(int number) {
	    number = checkBreqTitleLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBreqTitleLen((short)number);
	}
	public void setBreqTitleLen(long number) {
	    number = checkBreqTitleLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBreqTitleLen((short)number);
	}
	

	/**
	 *	Returns the value of breqTitleText
	 *	@return breqTitleText
	 */
   public char[] getBreqTitleText() throws CFException{
     if (isBreqTitleTextModified()) { 
        breqTitleText = refreshBreqTitleText();
     }
   		return breqTitleText;
   }

  
	/**
	*  set variable breqTitleText
	*  Corresponding COBOL Variable is BREQ-TITLE-TEXT
	*  @param value
	**/
   public void setBreqTitleText(char[] value) {
      breqTitleText = checkBreqTitleTextConstraints(value);
      serializeBreqTitleText(breqTitleText);
   } 

     /**
	 * 	Update BreqTitleText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBreqTitleText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBreqTitleText,breqTitleText.length);
   	
   }
   
   public void setBreqTitleText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBreqTitleText,breqTitleText.length);
   	
   }
   
     /**
	 * 	Update BreqTitleText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBreqTitleText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBreqTitleText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BreqTitleText with another Field
	 *	@param value
	 */
   public void setBreqTitleText(Field source) {
       replace(source,0,source.length(),beginBreqTitleText,BREQ_TITLE_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update BreqTitleText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBreqTitleText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBreqTitleText,BREQ_TITLE_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update BreqTitleText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBreqTitleText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBreqTitleText+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBreqTitleGrpFieldLength() {
			return BREQ_TITLE_GRP_LENGTH;
		}

}
  
