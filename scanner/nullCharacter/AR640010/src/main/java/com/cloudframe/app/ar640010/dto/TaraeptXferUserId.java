package com.cloudframe.app.ar640010.dto;

/**
*  The class TaraeptXferUserId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class TaraeptXferUserId extends TaraeptXferUserIdSerialized { 
   

								private short taraeptXferUserIdLen;

						private char[] taraeptXferUserIdTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TaraeptXferUserId
	**/
    public TaraeptXferUserId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TaraeptXferUserId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraeptXferUserId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of taraeptXferUserIdLen
	 *	@return taraeptXferUserIdLen
	 */
	public short getTaraeptXferUserIdLen() throws CFException {
        if (isTaraeptXferUserIdLenModified()) { 
           taraeptXferUserIdLen = refreshTaraeptXferUserIdLen();
        }
   		return taraeptXferUserIdLen;
	}
	
	/**
	 * 	Update TaraeptXferUserIdLen with the passed value
	 *  Corresponding COBOL Variable is TARAEPT-XFER-USER-ID-LEN
	 *	@param number
	 */
	public void setTaraeptXferUserIdLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraeptXferUserIdLen = checkTaraeptXferUserIdLenMaxLimit(number); 
		serializeTaraeptXferUserIdLen(taraeptXferUserIdLen);
	}

	public void setTaraeptXferUserIdLen(int number) {
	    number = checkTaraeptXferUserIdLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptXferUserIdLen((short)number);
	}
	public void setTaraeptXferUserIdLen(long number) {
	    number = checkTaraeptXferUserIdLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptXferUserIdLen((short)number);
	}
	

	/**
	 *	Returns the value of taraeptXferUserIdTxt
	 *	@return taraeptXferUserIdTxt
	 */
   public char[] getTaraeptXferUserIdTxt() throws CFException{
     if (isTaraeptXferUserIdTxtModified()) { 
        taraeptXferUserIdTxt = refreshTaraeptXferUserIdTxt();
     }
   		return taraeptXferUserIdTxt;
   }

  
	/**
	*  set variable taraeptXferUserIdTxt
	*  Corresponding COBOL Variable is TARAEPT-XFER-USER-ID-TXT
	*  @param value
	**/
   public void setTaraeptXferUserIdTxt(char[] value) {
      taraeptXferUserIdTxt = checkTaraeptXferUserIdTxtConstraints(value);
      serializeTaraeptXferUserIdTxt(taraeptXferUserIdTxt);
   } 

     /**
	 * 	Update TaraeptXferUserIdTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptXferUserIdTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptXferUserIdTxt,taraeptXferUserIdTxt.length);
   	
   }
   
   public void setTaraeptXferUserIdTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferUserIdTxt,taraeptXferUserIdTxt.length);
   	
   }
   
     /**
	 * 	Update TaraeptXferUserIdTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptXferUserIdTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferUserIdTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptXferUserIdTxt with another Field
	 *	@param value
	 */
   public void setTaraeptXferUserIdTxt(Field source) {
       replace(source,0,source.length(),beginTaraeptXferUserIdTxt,TARAEPT_XFER_USER_ID_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptXferUserIdTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptXferUserIdTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptXferUserIdTxt,TARAEPT_XFER_USER_ID_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptXferUserIdTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptXferUserIdTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferUserIdTxt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes TaraeptXferUserId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTaraeptXferUserIdLen((short)0);
         setTaraeptXferUserIdTxt(CONSTANTS.SPACE_64);
   }

		public static int getTaraeptXferUserIdFieldLength() {
			return TARAEPT_XFER_USER_ID_LENGTH;
		}

}
  
