package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrLdgBblX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrLdgBblX extends WvExtrLdgBblXSerialized { 
   

								private char[] wvExtrLdgBbl = Field.fillLowValue(13);
	
	/**
	* Constructor for WvExtrLdgBblX
	**/
    public WvExtrLdgBblX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrLdgBblX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgBblX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrLdgBbl
	 *	@return wvExtrLdgBbl
	 */
   public char[] getWvExtrLdgBbl() throws CFException{
     if (isWvExtrLdgBblModified()) { 
        wvExtrLdgBbl = refreshWvExtrLdgBbl();
     }
   		return wvExtrLdgBbl;
   }

  
	/**
	*  set variable wvExtrLdgBbl
	*  Corresponding COBOL Variable is WV-EXTR-LDG-BBL
	*  @param value
	**/
   public void setWvExtrLdgBbl(char[] value) {
      wvExtrLdgBbl = checkWvExtrLdgBblConstraints(value);
      serializeWvExtrLdgBbl(wvExtrLdgBbl);
   } 

     /**
	 * 	Update WvExtrLdgBbl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgBbl(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLdgBbl,wvExtrLdgBbl.length);
   	
   }
   
   public void setWvExtrLdgBbl(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgBbl,wvExtrLdgBbl.length);
   	
   }
   
     /**
	 * 	Update WvExtrLdgBbl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgBbl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgBbl+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLdgBbl with another Field
	 *	@param value
	 */
   public void setWvExtrLdgBbl(Field source) {
       replace(source,0,source.length(),beginWvExtrLdgBbl,WV_EXTR_LDG_BBL_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLdgBbl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLdgBbl(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLdgBbl,WV_EXTR_LDG_BBL_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLdgBbl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgBbl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgBbl+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrLdgBblX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrLdgBbl(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_175840736,"0".toCharArray()));
   }

		public static int getWvExtrLdgBblXFieldLength() {
			return WV_EXTR_LDG_BBL_X_LENGTH;
		}

}
  
