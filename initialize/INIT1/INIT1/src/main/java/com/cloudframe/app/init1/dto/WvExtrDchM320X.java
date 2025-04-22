package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrDchM320X is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrDchM320X extends WvExtrDchM320XSerialized { 
   

								private char[] wvExtrDchM320 = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrDchM320X
	**/
    public WvExtrDchM320X() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrDchM320X. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchM320X(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrDchM320
	 *	@return wvExtrDchM320
	 */
   public char[] getWvExtrDchM320() throws CFException{
     if (isWvExtrDchM320Modified()) { 
        wvExtrDchM320 = refreshWvExtrDchM320();
     }
   		return wvExtrDchM320;
   }

  
	/**
	*  set variable wvExtrDchM320
	*  Corresponding COBOL Variable is WV-EXTR-DCH-M3-20
	*  @param value
	**/
   public void setWvExtrDchM320(char[] value) {
      wvExtrDchM320 = checkWvExtrDchM320Constraints(value);
      serializeWvExtrDchM320(wvExtrDchM320);
   } 

     /**
	 * 	Update WvExtrDchM320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchM320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrDchM320,wvExtrDchM320.length);
   	
   }
   
   public void setWvExtrDchM320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchM320,wvExtrDchM320.length);
   	
   }
   
     /**
	 * 	Update WvExtrDchM320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchM320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrDchM320 with another Field
	 *	@param value
	 */
   public void setWvExtrDchM320(Field source) {
       replace(source,0,source.length(),beginWvExtrDchM320,WV_EXTR_DCH_M_320_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrDchM320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrDchM320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrDchM320,WV_EXTR_DCH_M_320_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrDchM320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchM320+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrDchM320X
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrDchM320(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1782754550,"0".toCharArray()));
   }

		public static int getWvExtrDchM320XFieldLength() {
			return WV_EXTR_DCH_M_320_X_LENGTH;
		}

}
  
