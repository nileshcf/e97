package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrLdgM330X is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrLdgM330X extends WvExtrLdgM330XSerialized { 
   

								private char[] wvExtrLdgM330 = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrLdgM330X
	**/
    public WvExtrLdgM330X() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrLdgM330X. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgM330X(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrLdgM330
	 *	@return wvExtrLdgM330
	 */
   public char[] getWvExtrLdgM330() throws CFException{
     if (isWvExtrLdgM330Modified()) { 
        wvExtrLdgM330 = refreshWvExtrLdgM330();
     }
   		return wvExtrLdgM330;
   }

  
	/**
	*  set variable wvExtrLdgM330
	*  Corresponding COBOL Variable is WV-EXTR-LDG-M3-30
	*  @param value
	**/
   public void setWvExtrLdgM330(char[] value) {
      wvExtrLdgM330 = checkWvExtrLdgM330Constraints(value);
      serializeWvExtrLdgM330(wvExtrLdgM330);
   } 

     /**
	 * 	Update WvExtrLdgM330 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgM330(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLdgM330,wvExtrLdgM330.length);
   	
   }
   
   public void setWvExtrLdgM330(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgM330,wvExtrLdgM330.length);
   	
   }
   
     /**
	 * 	Update WvExtrLdgM330 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM330(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgM330+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLdgM330 with another Field
	 *	@param value
	 */
   public void setWvExtrLdgM330(Field source) {
       replace(source,0,source.length(),beginWvExtrLdgM330,WV_EXTR_LDG_M_330_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLdgM330 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLdgM330(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLdgM330,WV_EXTR_LDG_M_330_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLdgM330 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM330(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgM330+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrLdgM330X
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrLdgM330(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1782754550,"0".toCharArray()));
   }

		public static int getWvExtrLdgM330XFieldLength() {
			return WV_EXTR_LDG_M_330_X_LENGTH;
		}

}
  
