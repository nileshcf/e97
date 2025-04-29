package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrDchBblX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrDchBblX extends WvExtrDchBblXSerialized { 
   

								private char[] wvExtrDchBbl = Field.fillLowValue(13);
	
	/**
	* Constructor for WvExtrDchBblX
	**/
    public WvExtrDchBblX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrDchBblX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchBblX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrDchBbl
	 *	@return wvExtrDchBbl
	 */
   public char[] getWvExtrDchBbl() throws CFException{
     if (isWvExtrDchBblModified()) { 
        wvExtrDchBbl = refreshWvExtrDchBbl();
     }
   		return wvExtrDchBbl;
   }

  
	/**
	*  set variable wvExtrDchBbl
	*  Corresponding COBOL Variable is WV-EXTR-DCH-BBL
	*  @param value
	**/
   public void setWvExtrDchBbl(char[] value) {
      wvExtrDchBbl = checkWvExtrDchBblConstraints(value);
      serializeWvExtrDchBbl(wvExtrDchBbl);
   } 

     /**
	 * 	Update WvExtrDchBbl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchBbl(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrDchBbl,wvExtrDchBbl.length);
   	
   }
   
   public void setWvExtrDchBbl(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchBbl,wvExtrDchBbl.length);
   	
   }
   
     /**
	 * 	Update WvExtrDchBbl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchBbl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchBbl+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrDchBbl with another Field
	 *	@param value
	 */
   public void setWvExtrDchBbl(Field source) {
       replace(source,0,source.length(),beginWvExtrDchBbl,WV_EXTR_DCH_BBL_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrDchBbl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrDchBbl(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrDchBbl,WV_EXTR_DCH_BBL_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrDchBbl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchBbl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchBbl+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrDchBblX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrDchBbl(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_175840736,"0".toCharArray()));
   }

		public static int getWvExtrDchBblXFieldLength() {
			return WV_EXTR_DCH_BBL_X_LENGTH;
		}

}
  
