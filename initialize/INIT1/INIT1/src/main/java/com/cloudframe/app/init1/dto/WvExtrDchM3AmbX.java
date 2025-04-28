package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrDchM3AmbX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrDchM3AmbX extends WvExtrDchM3AmbXSerialized { 
   

								private char[] wvExtrDchM3Amb = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrDchM3AmbX
	**/
    public WvExtrDchM3AmbX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrDchM3AmbX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchM3AmbX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrDchM3Amb
	 *	@return wvExtrDchM3Amb
	 */
   public char[] getWvExtrDchM3Amb() throws CFException{
     if (isWvExtrDchM3AmbModified()) { 
        wvExtrDchM3Amb = refreshWvExtrDchM3Amb();
     }
   		return wvExtrDchM3Amb;
   }

  
	/**
	*  set variable wvExtrDchM3Amb
	*  Corresponding COBOL Variable is WV-EXTR-DCH-M3-AMB
	*  @param value
	**/
   public void setWvExtrDchM3Amb(char[] value) {
      wvExtrDchM3Amb = checkWvExtrDchM3AmbConstraints(value);
      serializeWvExtrDchM3Amb(wvExtrDchM3Amb);
   } 

     /**
	 * 	Update WvExtrDchM3Amb 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchM3Amb(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrDchM3Amb,wvExtrDchM3Amb.length);
   	
   }
   
   public void setWvExtrDchM3Amb(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchM3Amb,wvExtrDchM3Amb.length);
   	
   }
   
     /**
	 * 	Update WvExtrDchM3Amb 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM3Amb(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchM3Amb+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrDchM3Amb with another Field
	 *	@param value
	 */
   public void setWvExtrDchM3Amb(Field source) {
       replace(source,0,source.length(),beginWvExtrDchM3Amb,WV_EXTR_DCH_M_3_AMB_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrDchM3Amb 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrDchM3Amb(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrDchM3Amb,WV_EXTR_DCH_M_3_AMB_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrDchM3Amb 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM3Amb(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchM3Amb+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrDchM3AmbX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrDchM3Amb(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1782754550,"0".toCharArray()));
   }

		public static int getWvExtrDchM3AmbXFieldLength() {
			return WV_EXTR_DCH_M_3_AMB_X_LENGTH;
		}

}
  
