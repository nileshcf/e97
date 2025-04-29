package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrLdgMtX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrLdgMtX extends WvExtrLdgMtXSerialized { 
   

								private char[] wvExtrLdgMt = Field.fillLowValue(13);
	
	/**
	* Constructor for WvExtrLdgMtX
	**/
    public WvExtrLdgMtX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrLdgMtX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgMtX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrLdgMt
	 *	@return wvExtrLdgMt
	 */
   public char[] getWvExtrLdgMt() throws CFException{
     if (isWvExtrLdgMtModified()) { 
        wvExtrLdgMt = refreshWvExtrLdgMt();
     }
   		return wvExtrLdgMt;
   }

  
	/**
	*  set variable wvExtrLdgMt
	*  Corresponding COBOL Variable is WV-EXTR-LDG-MT
	*  @param value
	**/
   public void setWvExtrLdgMt(char[] value) {
      wvExtrLdgMt = checkWvExtrLdgMtConstraints(value);
      serializeWvExtrLdgMt(wvExtrLdgMt);
   } 

     /**
	 * 	Update WvExtrLdgMt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgMt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLdgMt,wvExtrLdgMt.length);
   	
   }
   
   public void setWvExtrLdgMt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgMt,wvExtrLdgMt.length);
   	
   }
   
     /**
	 * 	Update WvExtrLdgMt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgMt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgMt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLdgMt with another Field
	 *	@param value
	 */
   public void setWvExtrLdgMt(Field source) {
       replace(source,0,source.length(),beginWvExtrLdgMt,WV_EXTR_LDG_MT_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLdgMt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLdgMt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLdgMt,WV_EXTR_LDG_MT_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLdgMt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgMt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgMt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrLdgMtX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrLdgMt(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_175840736,"0".toCharArray()));
   }

		public static int getWvExtrLdgMtXFieldLength() {
			return WV_EXTR_LDG_MT_X_LENGTH;
		}

}
  
