package com.cloudframe.app.ar640010.dto;

/**
*  The class TaraeptAltXferPswdId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class TaraeptAltXferPswdId extends TaraeptAltXferPswdIdSerialized { 
   

								private short taraeptAltXferPswdIdLen;

						private char[] taraeptAltXferPswdIdTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TaraeptAltXferPswdId
	**/
    public TaraeptAltXferPswdId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TaraeptAltXferPswdId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraeptAltXferPswdId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of taraeptAltXferPswdIdLen
	 *	@return taraeptAltXferPswdIdLen
	 */
	public short getTaraeptAltXferPswdIdLen() throws CFException {
        if (isTaraeptAltXferPswdIdLenModified()) { 
           taraeptAltXferPswdIdLen = refreshTaraeptAltXferPswdIdLen();
        }
   		return taraeptAltXferPswdIdLen;
	}
	
	/**
	 * 	Update TaraeptAltXferPswdIdLen with the passed value
	 *  Corresponding COBOL Variable is TARAEPT-ALT-XFER-PSWD-ID-LEN
	 *	@param number
	 */
	public void setTaraeptAltXferPswdIdLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraeptAltXferPswdIdLen = checkTaraeptAltXferPswdIdLenMaxLimit(number); 
		serializeTaraeptAltXferPswdIdLen(taraeptAltXferPswdIdLen);
	}

	public void setTaraeptAltXferPswdIdLen(int number) {
	    number = checkTaraeptAltXferPswdIdLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptAltXferPswdIdLen((short)number);
	}
	public void setTaraeptAltXferPswdIdLen(long number) {
	    number = checkTaraeptAltXferPswdIdLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptAltXferPswdIdLen((short)number);
	}
	

	/**
	 *	Returns the value of taraeptAltXferPswdIdTxt
	 *	@return taraeptAltXferPswdIdTxt
	 */
   public char[] getTaraeptAltXferPswdIdTxt() throws CFException{
     if (isTaraeptAltXferPswdIdTxtModified()) { 
        taraeptAltXferPswdIdTxt = refreshTaraeptAltXferPswdIdTxt();
     }
   		return taraeptAltXferPswdIdTxt;
   }

  
	/**
	*  set variable taraeptAltXferPswdIdTxt
	*  Corresponding COBOL Variable is TARAEPT-ALT-XFER-PSWD-ID-TXT
	*  @param value
	**/
   public void setTaraeptAltXferPswdIdTxt(char[] value) {
      taraeptAltXferPswdIdTxt = checkTaraeptAltXferPswdIdTxtConstraints(value);
      serializeTaraeptAltXferPswdIdTxt(taraeptAltXferPswdIdTxt);
   } 

     /**
	 * 	Update TaraeptAltXferPswdIdTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptAltXferPswdIdTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptAltXferPswdIdTxt,taraeptAltXferPswdIdTxt.length);
   	
   }
   
   public void setTaraeptAltXferPswdIdTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptAltXferPswdIdTxt,taraeptAltXferPswdIdTxt.length);
   	
   }
   
     /**
	 * 	Update TaraeptAltXferPswdIdTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptAltXferPswdIdTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptAltXferPswdIdTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptAltXferPswdIdTxt with another Field
	 *	@param value
	 */
   public void setTaraeptAltXferPswdIdTxt(Field source) {
       replace(source,0,source.length(),beginTaraeptAltXferPswdIdTxt,TARAEPT_ALT_XFER_PSWD_ID_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptAltXferPswdIdTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptAltXferPswdIdTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptAltXferPswdIdTxt,TARAEPT_ALT_XFER_PSWD_ID_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptAltXferPswdIdTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptAltXferPswdIdTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptAltXferPswdIdTxt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes TaraeptAltXferPswdId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTaraeptAltXferPswdIdLen((short)0);
         setTaraeptAltXferPswdIdTxt(CONSTANTS.SPACE_64);
   }

		public static int getTaraeptAltXferPswdIdFieldLength() {
			return TARAEPT_ALT_XFER_PSWD_ID_LENGTH;
		}

}
  
