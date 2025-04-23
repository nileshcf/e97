package com.cloudframe.app.ar640010.dto;

/**
*  The class TaraeptXferPswdId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class TaraeptXferPswdId extends TaraeptXferPswdIdSerialized { 
   

								private short taraeptXferPswdIdLen;

						private char[] taraeptXferPswdIdTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TaraeptXferPswdId
	**/
    public TaraeptXferPswdId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TaraeptXferPswdId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraeptXferPswdId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of taraeptXferPswdIdLen
	 *	@return taraeptXferPswdIdLen
	 */
	public short getTaraeptXferPswdIdLen() throws CFException {
        if (isTaraeptXferPswdIdLenModified()) { 
           taraeptXferPswdIdLen = refreshTaraeptXferPswdIdLen();
        }
   		return taraeptXferPswdIdLen;
	}
	
	/**
	 * 	Update TaraeptXferPswdIdLen with the passed value
	 *  Corresponding COBOL Variable is TARAEPT-XFER-PSWD-ID-LEN
	 *	@param number
	 */
	public void setTaraeptXferPswdIdLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraeptXferPswdIdLen = checkTaraeptXferPswdIdLenMaxLimit(number); 
		serializeTaraeptXferPswdIdLen(taraeptXferPswdIdLen);
	}

	public void setTaraeptXferPswdIdLen(int number) {
	    number = checkTaraeptXferPswdIdLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptXferPswdIdLen((short)number);
	}
	public void setTaraeptXferPswdIdLen(long number) {
	    number = checkTaraeptXferPswdIdLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptXferPswdIdLen((short)number);
	}
	

	/**
	 *	Returns the value of taraeptXferPswdIdTxt
	 *	@return taraeptXferPswdIdTxt
	 */
   public char[] getTaraeptXferPswdIdTxt() throws CFException{
     if (isTaraeptXferPswdIdTxtModified()) { 
        taraeptXferPswdIdTxt = refreshTaraeptXferPswdIdTxt();
     }
   		return taraeptXferPswdIdTxt;
   }

  
	/**
	*  set variable taraeptXferPswdIdTxt
	*  Corresponding COBOL Variable is TARAEPT-XFER-PSWD-ID-TXT
	*  @param value
	**/
   public void setTaraeptXferPswdIdTxt(char[] value) {
      taraeptXferPswdIdTxt = checkTaraeptXferPswdIdTxtConstraints(value);
      serializeTaraeptXferPswdIdTxt(taraeptXferPswdIdTxt);
   } 

     /**
	 * 	Update TaraeptXferPswdIdTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptXferPswdIdTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptXferPswdIdTxt,taraeptXferPswdIdTxt.length);
   	
   }
   
   public void setTaraeptXferPswdIdTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferPswdIdTxt,taraeptXferPswdIdTxt.length);
   	
   }
   
     /**
	 * 	Update TaraeptXferPswdIdTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptXferPswdIdTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferPswdIdTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptXferPswdIdTxt with another Field
	 *	@param value
	 */
   public void setTaraeptXferPswdIdTxt(Field source) {
       replace(source,0,source.length(),beginTaraeptXferPswdIdTxt,TARAEPT_XFER_PSWD_ID_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptXferPswdIdTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptXferPswdIdTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptXferPswdIdTxt,TARAEPT_XFER_PSWD_ID_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptXferPswdIdTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptXferPswdIdTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferPswdIdTxt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes TaraeptXferPswdId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTaraeptXferPswdIdLen((short)0);
         setTaraeptXferPswdIdTxt(CONSTANTS.SPACE_64);
   }

		public static int getTaraeptXferPswdIdFieldLength() {
			return TARAEPT_XFER_PSWD_ID_LENGTH;
		}

}
  
