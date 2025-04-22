package com.cloudframe.app.ar640010.dto;

/**
*  The class TaraeptAltXferUserId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class TaraeptAltXferUserId extends TaraeptAltXferUserIdSerialized { 
   

								private short taraeptAltXferUserIdLen;

						private char[] taraeptAltXferUserIdTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TaraeptAltXferUserId
	**/
    public TaraeptAltXferUserId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TaraeptAltXferUserId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraeptAltXferUserId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of taraeptAltXferUserIdLen
	 *	@return taraeptAltXferUserIdLen
	 */
	public short getTaraeptAltXferUserIdLen() throws CFException {
        if (isTaraeptAltXferUserIdLenModified()) { 
           taraeptAltXferUserIdLen = refreshTaraeptAltXferUserIdLen();
        }
   		return taraeptAltXferUserIdLen;
	}
	
	/**
	 * 	Update TaraeptAltXferUserIdLen with the passed value
	 *  Corresponding COBOL Variable is TARAEPT-ALT-XFER-USER-ID-LEN
	 *	@param number
	 */
	public void setTaraeptAltXferUserIdLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraeptAltXferUserIdLen = checkTaraeptAltXferUserIdLenMaxLimit(number); 
		serializeTaraeptAltXferUserIdLen(taraeptAltXferUserIdLen);
	}

	public void setTaraeptAltXferUserIdLen(int number) {
	    number = checkTaraeptAltXferUserIdLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptAltXferUserIdLen((short)number);
	}
	public void setTaraeptAltXferUserIdLen(long number) {
	    number = checkTaraeptAltXferUserIdLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptAltXferUserIdLen((short)number);
	}
	

	/**
	 *	Returns the value of taraeptAltXferUserIdTxt
	 *	@return taraeptAltXferUserIdTxt
	 */
   public char[] getTaraeptAltXferUserIdTxt() throws CFException{
     if (isTaraeptAltXferUserIdTxtModified()) { 
        taraeptAltXferUserIdTxt = refreshTaraeptAltXferUserIdTxt();
     }
   		return taraeptAltXferUserIdTxt;
   }

  
	/**
	*  set variable taraeptAltXferUserIdTxt
	*  Corresponding COBOL Variable is TARAEPT-ALT-XFER-USER-ID-TXT
	*  @param value
	**/
   public void setTaraeptAltXferUserIdTxt(char[] value) {
      taraeptAltXferUserIdTxt = checkTaraeptAltXferUserIdTxtConstraints(value);
      serializeTaraeptAltXferUserIdTxt(taraeptAltXferUserIdTxt);
   } 

     /**
	 * 	Update TaraeptAltXferUserIdTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptAltXferUserIdTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptAltXferUserIdTxt,taraeptAltXferUserIdTxt.length);
   	
   }
   
   public void setTaraeptAltXferUserIdTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptAltXferUserIdTxt,taraeptAltXferUserIdTxt.length);
   	
   }
   
     /**
	 * 	Update TaraeptAltXferUserIdTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptAltXferUserIdTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptAltXferUserIdTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptAltXferUserIdTxt with another Field
	 *	@param value
	 */
   public void setTaraeptAltXferUserIdTxt(Field source) {
       replace(source,0,source.length(),beginTaraeptAltXferUserIdTxt,TARAEPT_ALT_XFER_USER_ID_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptAltXferUserIdTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptAltXferUserIdTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptAltXferUserIdTxt,TARAEPT_ALT_XFER_USER_ID_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptAltXferUserIdTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptAltXferUserIdTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptAltXferUserIdTxt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes TaraeptAltXferUserId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTaraeptAltXferUserIdLen((short)0);
         setTaraeptAltXferUserIdTxt(CONSTANTS.SPACE_64);
   }

		public static int getTaraeptAltXferUserIdFieldLength() {
			return TARAEPT_ALT_XFER_USER_ID_LENGTH;
		}

}
  
