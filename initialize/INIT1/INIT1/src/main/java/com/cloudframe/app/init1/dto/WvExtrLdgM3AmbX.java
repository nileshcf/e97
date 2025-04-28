package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrLdgM3AmbX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrLdgM3AmbX extends WvExtrLdgM3AmbXSerialized { 
   

								private char[] wvExtrLdgM3Amb = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrLdgM3AmbX
	**/
    public WvExtrLdgM3AmbX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrLdgM3AmbX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgM3AmbX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrLdgM3Amb
	 *	@return wvExtrLdgM3Amb
	 */
   public char[] getWvExtrLdgM3Amb() throws CFException{
     if (isWvExtrLdgM3AmbModified()) { 
        wvExtrLdgM3Amb = refreshWvExtrLdgM3Amb();
     }
   		return wvExtrLdgM3Amb;
   }

  
	/**
	*  set variable wvExtrLdgM3Amb
	*  Corresponding COBOL Variable is WV-EXTR-LDG-M3-AMB
	*  @param value
	**/
   public void setWvExtrLdgM3Amb(char[] value) {
      wvExtrLdgM3Amb = checkWvExtrLdgM3AmbConstraints(value);
      serializeWvExtrLdgM3Amb(wvExtrLdgM3Amb);
   } 

     /**
	 * 	Update WvExtrLdgM3Amb 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgM3Amb(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLdgM3Amb,wvExtrLdgM3Amb.length);
   	
   }
   
   public void setWvExtrLdgM3Amb(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgM3Amb,wvExtrLdgM3Amb.length);
   	
   }
   
     /**
	 * 	Update WvExtrLdgM3Amb 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM3Amb(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgM3Amb+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLdgM3Amb with another Field
	 *	@param value
	 */
   public void setWvExtrLdgM3Amb(Field source) {
       replace(source,0,source.length(),beginWvExtrLdgM3Amb,WV_EXTR_LDG_M_3_AMB_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLdgM3Amb 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLdgM3Amb(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLdgM3Amb,WV_EXTR_LDG_M_3_AMB_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLdgM3Amb 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM3Amb(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgM3Amb+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrLdgM3AmbX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrLdgM3Amb(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1782754550,"0".toCharArray()));
   }

		public static int getWvExtrLdgM3AmbXFieldLength() {
			return WV_EXTR_LDG_M_3_AMB_X_LENGTH;
		}

}
  
