package com.cloudframe.app.global.sharedvar;

/**
*  The class EndOfFileIndicator800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class EndOfFileIndicator800 extends EndOfFileIndicator800Serialized { 
   

						private char[] eofIndicator800 = Field.fillLowValue(2);
	
	/**
	* Constructor for EndOfFileIndicator800
	**/
    public EndOfFileIndicator800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of eofIndicator800
	 *	@return eofIndicator800
	 */
   public char[] getEofIndicator800() throws CFException{
     if (isEofIndicator800Modified()) { 
        eofIndicator800 = refreshEofIndicator800();
     }
   		return eofIndicator800;
   }

  
	/**
	*  set variable eofIndicator800
	*  Corresponding COBOL Variable is 800-EOF-INDICATOR
	*  @param value
	**/
   public void setEofIndicator800(char[] value) {
      eofIndicator800 = checkEofIndicator800Constraints(value);
      serializeEofIndicator800(eofIndicator800);
   } 

     /**
	 * 	Update EofIndicator800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEofIndicator800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEofIndicator800,eofIndicator800.length);
   	
   }
   
   public void setEofIndicator800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEofIndicator800,eofIndicator800.length);
   	
   }
   
     /**
	 * 	Update EofIndicator800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEofIndicator800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEofIndicator800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EofIndicator800 with another Field
	 *	@param value
	 */
   public void setEofIndicator800(Field source) {
       replace(source,0,source.length(),beginEofIndicator800,EOF_INDICATOR_800_LEN);
   	
   }  
   
     /**
	 * 	Update EofIndicator800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEofIndicator800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEofIndicator800,EOF_INDICATOR_800_LEN);
   	
   }
   
     /**
	 * 	Update EofIndicator800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEofIndicator800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEofIndicator800+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes EndOfFileIndicator800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setEofIndicator800(CONSTANTS.SPACE_2);
   }

		public static int getEndOfFileIndicator800FieldLength() {
			return END_OF_FILE_INDICATOR_800_LENGTH;
		}

}
  
