package com.cloudframe.app.sf320010.dto;

/**
*  The class RpPsTransAmountX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpPsTransAmountX extends RpPsTransAmountXSerialized { 
   

								private char[] rpPsTransAmount = Field.fillLowValue(8);
	
	/**
	* Constructor for RpPsTransAmountX
	**/
    public RpPsTransAmountX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RpPsTransAmountX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RpPsTransAmountX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rpPsTransAmount
	 *	@return rpPsTransAmount
	 */
   public char[] getRpPsTransAmount() throws CFException{
     if (isRpPsTransAmountModified()) { 
        rpPsTransAmount = refreshRpPsTransAmount();
     }
   		return rpPsTransAmount;
   }

  
	/**
	*  set variable rpPsTransAmount
	*  Corresponding COBOL Variable is RP-PS-TRANS-AMOUNT
	*  @param value
	**/
   public void setRpPsTransAmount(char[] value) {
      rpPsTransAmount = checkRpPsTransAmountConstraints(value);
      serializeRpPsTransAmount(rpPsTransAmount);
   } 

     /**
	 * 	Update RpPsTransAmount 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsTransAmount(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsTransAmount,rpPsTransAmount.length);
   	
   }
   
   public void setRpPsTransAmount(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTransAmount,rpPsTransAmount.length);
   	
   }
   
     /**
	 * 	Update RpPsTransAmount 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsTransAmount(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTransAmount+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsTransAmount with another Field
	 *	@param value
	 */
   public void setRpPsTransAmount(Field source) {
       replace(source,0,source.length(),beginRpPsTransAmount,RP_PS_TRANS_AMOUNT_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsTransAmount 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsTransAmount(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsTransAmount,RP_PS_TRANS_AMOUNT_LEN);
   	
   }
   
     /**
	 * 	Update RpPsTransAmount 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsTransAmount(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTransAmount+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpPsTransAmountXFieldLength() {
			return RP_PS_TRANS_AMOUNT_X_LENGTH;
		}

}
  
