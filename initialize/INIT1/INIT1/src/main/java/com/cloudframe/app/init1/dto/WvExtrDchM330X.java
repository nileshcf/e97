package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrDchM330X is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrDchM330X extends WvExtrDchM330XSerialized { 
   

								private char[] wvExtrDchM330 = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrDchM330X
	**/
    public WvExtrDchM330X() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrDchM330X. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchM330X(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrDchM330
	 *	@return wvExtrDchM330
	 */
   public char[] getWvExtrDchM330() throws CFException{
     if (isWvExtrDchM330Modified()) { 
        wvExtrDchM330 = refreshWvExtrDchM330();
     }
   		return wvExtrDchM330;
   }

  
	/**
	*  set variable wvExtrDchM330
	*  Corresponding COBOL Variable is WV-EXTR-DCH-M3-30
	*  @param value
	**/
   public void setWvExtrDchM330(char[] value) {
      wvExtrDchM330 = checkWvExtrDchM330Constraints(value);
      serializeWvExtrDchM330(wvExtrDchM330);
   } 

     /**
	 * 	Update WvExtrDchM330 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchM330(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrDchM330,wvExtrDchM330.length);
   	
   }
   
   public void setWvExtrDchM330(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchM330,wvExtrDchM330.length);
   	
   }
   
     /**
	 * 	Update WvExtrDchM330 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM330(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchM330+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrDchM330 with another Field
	 *	@param value
	 */
   public void setWvExtrDchM330(Field source) {
       replace(source,0,source.length(),beginWvExtrDchM330,WV_EXTR_DCH_M_330_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrDchM330 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrDchM330(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrDchM330,WV_EXTR_DCH_M_330_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrDchM330 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM330(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchM330+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrDchM330X
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrDchM330(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1782754550,"0".toCharArray()));
   }

		public static int getWvExtrDchM330XFieldLength() {
			return WV_EXTR_DCH_M_330_X_LENGTH;
		}

}
  
