package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrActDensityX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrActDensityX extends WvExtrActDensityXSerialized { 
   

								private char[] wvExtrActDensity = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrActDensityX
	**/
    public WvExtrActDensityX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrActDensityX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrActDensityX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrActDensity
	 *	@return wvExtrActDensity
	 */
   public char[] getWvExtrActDensity() throws CFException{
     if (isWvExtrActDensityModified()) { 
        wvExtrActDensity = refreshWvExtrActDensity();
     }
   		return wvExtrActDensity;
   }

  
	/**
	*  set variable wvExtrActDensity
	*  Corresponding COBOL Variable is WV-EXTR-ACT-DENSITY
	*  @param value
	**/
   public void setWvExtrActDensity(char[] value) {
      wvExtrActDensity = checkWvExtrActDensityConstraints(value);
      serializeWvExtrActDensity(wvExtrActDensity);
   } 

     /**
	 * 	Update WvExtrActDensity 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrActDensity(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrActDensity,wvExtrActDensity.length);
   	
   }
   
   public void setWvExtrActDensity(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrActDensity,wvExtrActDensity.length);
   	
   }
   
     /**
	 * 	Update WvExtrActDensity 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrActDensity(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrActDensity+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrActDensity with another Field
	 *	@param value
	 */
   public void setWvExtrActDensity(Field source) {
       replace(source,0,source.length(),beginWvExtrActDensity,WV_EXTR_ACT_DENSITY_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrActDensity 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrActDensity(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrActDensity,WV_EXTR_ACT_DENSITY_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrActDensity 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrActDensity(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrActDensity+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrActDensityX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrActDensity(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1172135329,"0".toCharArray()));
   }

		public static int getWvExtrActDensityXFieldLength() {
			return WV_EXTR_ACT_DENSITY_X_LENGTH;
		}

}
  
