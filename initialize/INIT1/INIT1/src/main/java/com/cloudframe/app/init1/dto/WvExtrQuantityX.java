package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrQuantityX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrQuantityX extends WvExtrQuantityXSerialized { 
   

								private char[] wvExtrQuantity = Field.fillLowValue(9);
	
	/**
	* Constructor for WvExtrQuantityX
	**/
    public WvExtrQuantityX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrQuantityX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrQuantityX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrQuantity
	 *	@return wvExtrQuantity
	 */
   public char[] getWvExtrQuantity() throws CFException{
     if (isWvExtrQuantityModified()) { 
        wvExtrQuantity = refreshWvExtrQuantity();
     }
   		return wvExtrQuantity;
   }

  
	/**
	*  set variable wvExtrQuantity
	*  Corresponding COBOL Variable is WV-EXTR-QUANTITY
	*  @param value
	**/
   public void setWvExtrQuantity(char[] value) {
      wvExtrQuantity = checkWvExtrQuantityConstraints(value);
      serializeWvExtrQuantity(wvExtrQuantity);
   } 

     /**
	 * 	Update WvExtrQuantity 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrQuantity(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrQuantity,wvExtrQuantity.length);
   	
   }
   
   public void setWvExtrQuantity(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrQuantity,wvExtrQuantity.length);
   	
   }
   
     /**
	 * 	Update WvExtrQuantity 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrQuantity(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrQuantity+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrQuantity with another Field
	 *	@param value
	 */
   public void setWvExtrQuantity(Field source) {
       replace(source,0,source.length(),beginWvExtrQuantity,WV_EXTR_QUANTITY_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrQuantity 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrQuantity(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrQuantity,WV_EXTR_QUANTITY_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrQuantity 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrQuantity(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrQuantity+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrQuantityX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrQuantity(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1514747093,"0".toCharArray()));
   }

		public static int getWvExtrQuantityXFieldLength() {
			return WV_EXTR_QUANTITY_X_LENGTH;
		}

}
  
