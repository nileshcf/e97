package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrDchMtX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrDchMtX extends WvExtrDchMtXSerialized { 
   

								private char[] wvExtrDchMt = Field.fillLowValue(13);
	
	/**
	* Constructor for WvExtrDchMtX
	**/
    public WvExtrDchMtX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrDchMtX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchMtX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrDchMt
	 *	@return wvExtrDchMt
	 */
   public char[] getWvExtrDchMt() throws CFException{
     if (isWvExtrDchMtModified()) { 
        wvExtrDchMt = refreshWvExtrDchMt();
     }
   		return wvExtrDchMt;
   }

  
	/**
	*  set variable wvExtrDchMt
	*  Corresponding COBOL Variable is WV-EXTR-DCH-MT
	*  @param value
	**/
   public void setWvExtrDchMt(char[] value) {
      wvExtrDchMt = checkWvExtrDchMtConstraints(value);
      serializeWvExtrDchMt(wvExtrDchMt);
   } 

     /**
	 * 	Update WvExtrDchMt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchMt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrDchMt,wvExtrDchMt.length);
   	
   }
   
   public void setWvExtrDchMt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchMt,wvExtrDchMt.length);
   	
   }
   
     /**
	 * 	Update WvExtrDchMt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchMt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchMt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrDchMt with another Field
	 *	@param value
	 */
   public void setWvExtrDchMt(Field source) {
       replace(source,0,source.length(),beginWvExtrDchMt,WV_EXTR_DCH_MT_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrDchMt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrDchMt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrDchMt,WV_EXTR_DCH_MT_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrDchMt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchMt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchMt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrDchMtX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrDchMt(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_175840736,"0".toCharArray()));
   }

		public static int getWvExtrDchMtXFieldLength() {
			return WV_EXTR_DCH_MT_X_LENGTH;
		}

}
  
