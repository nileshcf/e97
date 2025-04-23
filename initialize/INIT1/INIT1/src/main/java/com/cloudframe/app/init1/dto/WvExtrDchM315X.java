package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrDchM315X is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrDchM315X extends WvExtrDchM315XSerialized { 
   

								private char[] wvExtrDchM315 = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrDchM315X
	**/
    public WvExtrDchM315X() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrDchM315X. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchM315X(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrDchM315
	 *	@return wvExtrDchM315
	 */
   public char[] getWvExtrDchM315() throws CFException{
     if (isWvExtrDchM315Modified()) { 
        wvExtrDchM315 = refreshWvExtrDchM315();
     }
   		return wvExtrDchM315;
   }

  
	/**
	*  set variable wvExtrDchM315
	*  Corresponding COBOL Variable is WV-EXTR-DCH-M3-15
	*  @param value
	**/
   public void setWvExtrDchM315(char[] value) {
      wvExtrDchM315 = checkWvExtrDchM315Constraints(value);
      serializeWvExtrDchM315(wvExtrDchM315);
   } 

     /**
	 * 	Update WvExtrDchM315 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchM315(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrDchM315,wvExtrDchM315.length);
   	
   }
   
   public void setWvExtrDchM315(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchM315,wvExtrDchM315.length);
   	
   }
   
     /**
	 * 	Update WvExtrDchM315 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM315(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchM315+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrDchM315 with another Field
	 *	@param value
	 */
   public void setWvExtrDchM315(Field source) {
       replace(source,0,source.length(),beginWvExtrDchM315,WV_EXTR_DCH_M_315_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrDchM315 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrDchM315(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrDchM315,WV_EXTR_DCH_M_315_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrDchM315 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM315(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchM315+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrDchM315X
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrDchM315(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1782754550,"0".toCharArray()));
   }

		public static int getWvExtrDchM315XFieldLength() {
			return WV_EXTR_DCH_M_315_X_LENGTH;
		}

}
  
