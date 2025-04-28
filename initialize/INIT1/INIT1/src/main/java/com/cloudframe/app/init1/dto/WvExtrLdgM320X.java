package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrLdgM320X is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrLdgM320X extends WvExtrLdgM320XSerialized { 
   

								private char[] wvExtrLdgM320 = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrLdgM320X
	**/
    public WvExtrLdgM320X() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrLdgM320X. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgM320X(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrLdgM320
	 *	@return wvExtrLdgM320
	 */
   public char[] getWvExtrLdgM320() throws CFException{
     if (isWvExtrLdgM320Modified()) { 
        wvExtrLdgM320 = refreshWvExtrLdgM320();
     }
   		return wvExtrLdgM320;
   }

  
	/**
	*  set variable wvExtrLdgM320
	*  Corresponding COBOL Variable is WV-EXTR-LDG-M3-20
	*  @param value
	**/
   public void setWvExtrLdgM320(char[] value) {
      wvExtrLdgM320 = checkWvExtrLdgM320Constraints(value);
      serializeWvExtrLdgM320(wvExtrLdgM320);
   } 

     /**
	 * 	Update WvExtrLdgM320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgM320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLdgM320,wvExtrLdgM320.length);
   	
   }
   
   public void setWvExtrLdgM320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgM320,wvExtrLdgM320.length);
   	
   }
   
     /**
	 * 	Update WvExtrLdgM320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgM320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLdgM320 with another Field
	 *	@param value
	 */
   public void setWvExtrLdgM320(Field source) {
       replace(source,0,source.length(),beginWvExtrLdgM320,WV_EXTR_LDG_M_320_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLdgM320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLdgM320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLdgM320,WV_EXTR_LDG_M_320_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLdgM320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgM320+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrLdgM320X
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrLdgM320(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1782754550,"0".toCharArray()));
   }

		public static int getWvExtrLdgM320XFieldLength() {
			return WV_EXTR_LDG_M_320_X_LENGTH;
		}

}
  
