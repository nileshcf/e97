package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrValueX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrValueX extends WvExtrValueXSerialized { 
   

								private char[] wvExtrValue = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrValueX
	**/
    public WvExtrValueX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrValueX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrValueX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrValue
	 *	@return wvExtrValue
	 */
   public char[] getWvExtrValue() throws CFException{
     if (isWvExtrValueModified()) { 
        wvExtrValue = refreshWvExtrValue();
     }
   		return wvExtrValue;
   }

  
	/**
	*  set variable wvExtrValue
	*  Corresponding COBOL Variable is WV-EXTR-VALUE
	*  @param value
	**/
   public void setWvExtrValue(char[] value) {
      wvExtrValue = checkWvExtrValueConstraints(value);
      serializeWvExtrValue(wvExtrValue);
   } 

     /**
	 * 	Update WvExtrValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrValue(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrValue,wvExtrValue.length);
   	
   }
   
   public void setWvExtrValue(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrValue,wvExtrValue.length);
   	
   }
   
     /**
	 * 	Update WvExtrValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrValue+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrValue with another Field
	 *	@param value
	 */
   public void setWvExtrValue(Field source) {
       replace(source,0,source.length(),beginWvExtrValue,WV_EXTR_VALUE_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrValue(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrValue,WV_EXTR_VALUE_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrValue+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrValueX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1391145579,"0".toCharArray()));
   }

		public static int getWvExtrValueXFieldLength() {
			return WV_EXTR_VALUE_X_LENGTH;
		}

}
  
