package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrDchUsgX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrDchUsgX extends WvExtrDchUsgXSerialized { 
   

								private char[] wvExtrDchUsg = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrDchUsgX
	**/
    public WvExtrDchUsgX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrDchUsgX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchUsgX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrDchUsg
	 *	@return wvExtrDchUsg
	 */
   public char[] getWvExtrDchUsg() throws CFException{
     if (isWvExtrDchUsgModified()) { 
        wvExtrDchUsg = refreshWvExtrDchUsg();
     }
   		return wvExtrDchUsg;
   }

  
	/**
	*  set variable wvExtrDchUsg
	*  Corresponding COBOL Variable is WV-EXTR-DCH-USG
	*  @param value
	**/
   public void setWvExtrDchUsg(char[] value) {
      wvExtrDchUsg = checkWvExtrDchUsgConstraints(value);
      serializeWvExtrDchUsg(wvExtrDchUsg);
   } 

     /**
	 * 	Update WvExtrDchUsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchUsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrDchUsg,wvExtrDchUsg.length);
   	
   }
   
   public void setWvExtrDchUsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchUsg,wvExtrDchUsg.length);
   	
   }
   
     /**
	 * 	Update WvExtrDchUsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchUsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchUsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrDchUsg with another Field
	 *	@param value
	 */
   public void setWvExtrDchUsg(Field source) {
       replace(source,0,source.length(),beginWvExtrDchUsg,WV_EXTR_DCH_USG_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrDchUsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrDchUsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrDchUsg,WV_EXTR_DCH_USG_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrDchUsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchUsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchUsg+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrDchUsgX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrDchUsg(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1782754550,"0".toCharArray()));
   }

		public static int getWvExtrDchUsgXFieldLength() {
			return WV_EXTR_DCH_USG_X_LENGTH;
		}

}
  
