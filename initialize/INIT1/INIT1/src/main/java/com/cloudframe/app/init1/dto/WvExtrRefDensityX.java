package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrRefDensityX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrRefDensityX extends WvExtrRefDensityXSerialized { 
   

								private char[] wvExtrRefDensity = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrRefDensityX
	**/
    public WvExtrRefDensityX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrRefDensityX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrRefDensityX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrRefDensity
	 *	@return wvExtrRefDensity
	 */
   public char[] getWvExtrRefDensity() throws CFException{
     if (isWvExtrRefDensityModified()) { 
        wvExtrRefDensity = refreshWvExtrRefDensity();
     }
   		return wvExtrRefDensity;
   }

  
	/**
	*  set variable wvExtrRefDensity
	*  Corresponding COBOL Variable is WV-EXTR-REF-DENSITY
	*  @param value
	**/
   public void setWvExtrRefDensity(char[] value) {
      wvExtrRefDensity = checkWvExtrRefDensityConstraints(value);
      serializeWvExtrRefDensity(wvExtrRefDensity);
   } 

     /**
	 * 	Update WvExtrRefDensity 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrRefDensity(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrRefDensity,wvExtrRefDensity.length);
   	
   }
   
   public void setWvExtrRefDensity(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrRefDensity,wvExtrRefDensity.length);
   	
   }
   
     /**
	 * 	Update WvExtrRefDensity 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrRefDensity(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrRefDensity+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrRefDensity with another Field
	 *	@param value
	 */
   public void setWvExtrRefDensity(Field source) {
       replace(source,0,source.length(),beginWvExtrRefDensity,WV_EXTR_REF_DENSITY_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrRefDensity 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrRefDensity(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrRefDensity,WV_EXTR_REF_DENSITY_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrRefDensity 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrRefDensity(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrRefDensity+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrRefDensityX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrRefDensity(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1172135329,"0".toCharArray()));
   }

		public static int getWvExtrRefDensityXFieldLength() {
			return WV_EXTR_REF_DENSITY_X_LENGTH;
		}

}
  
