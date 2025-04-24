package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrLdgM315X is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrLdgM315X extends WvExtrLdgM315XSerialized { 
   

								private char[] wvExtrLdgM315 = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrLdgM315X
	**/
    public WvExtrLdgM315X() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrLdgM315X. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgM315X(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrLdgM315
	 *	@return wvExtrLdgM315
	 */
   public char[] getWvExtrLdgM315() throws CFException{
     if (isWvExtrLdgM315Modified()) { 
        wvExtrLdgM315 = refreshWvExtrLdgM315();
     }
   		return wvExtrLdgM315;
   }

  
	/**
	*  set variable wvExtrLdgM315
	*  Corresponding COBOL Variable is WV-EXTR-LDG-M3-15
	*  @param value
	**/
   public void setWvExtrLdgM315(char[] value) {
      wvExtrLdgM315 = checkWvExtrLdgM315Constraints(value);
      serializeWvExtrLdgM315(wvExtrLdgM315);
   } 

     /**
	 * 	Update WvExtrLdgM315 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgM315(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLdgM315,wvExtrLdgM315.length);
   	
   }
   
   public void setWvExtrLdgM315(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgM315,wvExtrLdgM315.length);
   	
   }
   
     /**
	 * 	Update WvExtrLdgM315 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM315(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgM315+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLdgM315 with another Field
	 *	@param value
	 */
   public void setWvExtrLdgM315(Field source) {
       replace(source,0,source.length(),beginWvExtrLdgM315,WV_EXTR_LDG_M_315_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLdgM315 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLdgM315(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLdgM315,WV_EXTR_LDG_M_315_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLdgM315 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM315(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgM315+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrLdgM315X
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrLdgM315(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1782754550,"0".toCharArray()));
   }

		public static int getWvExtrLdgM315XFieldLength() {
			return WV_EXTR_LDG_M_315_X_LENGTH;
		}

}
  
