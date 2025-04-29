package com.cloudframe.app.db2varch.dto;

/**
*  The class TitleGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.db2varch.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class TitleGrp extends TitleGrpSerialized { 
   

								private short titleLen;

						private char[] titleText = Field.fillLowValue(255);
	
	/**
	* Constructor for TitleGrp
	**/
    public TitleGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TitleGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TitleGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of titleLen
	 *	@return titleLen
	 */
	public short getTitleLen() throws CFException {
        if (isTitleLenModified()) { 
           titleLen = refreshTitleLen();
        }
   		return titleLen;
	}
	
	/**
	 * 	Update TitleLen with the passed value
	 *  Corresponding COBOL Variable is TITLE-LEN
	 *	@param number
	 */
	public void setTitleLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    titleLen = checkTitleLenMaxLimit(number); 
		serializeTitleLen(titleLen);
	}

	public void setTitleLen(int number) {
	    number = checkTitleLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTitleLen((short)number);
	}
	public void setTitleLen(long number) {
	    number = checkTitleLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTitleLen((short)number);
	}
	

	/**
	 *	Returns the value of titleText
	 *	@return titleText
	 */
   public char[] getTitleText() throws CFException{
     if (isTitleTextModified()) { 
        titleText = refreshTitleText();
     }
   		return titleText;
   }

  
	/**
	*  set variable titleText
	*  Corresponding COBOL Variable is TITLE-TEXT
	*  @param value
	**/
   public void setTitleText(char[] value) {
      titleText = checkTitleTextConstraints(value);
      serializeTitleText(titleText);
   } 

     /**
	 * 	Update TitleText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTitleText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTitleText,titleText.length);
   	
   }
   
   public void setTitleText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTitleText,titleText.length);
   	
   }
   
     /**
	 * 	Update TitleText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTitleText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTitleText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TitleText with another Field
	 *	@param value
	 */
   public void setTitleText(Field source) {
       replace(source,0,source.length(),beginTitleText,TITLE_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update TitleText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTitleText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTitleText,TITLE_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update TitleText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTitleText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTitleText+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes TitleGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTitleLen((short)0);
         setTitleText(CONSTANTS.SPACE_255);
   }

		public static int getTitleGrpFieldLength() {
			return TITLE_GRP_LENGTH;
		}

}
  
