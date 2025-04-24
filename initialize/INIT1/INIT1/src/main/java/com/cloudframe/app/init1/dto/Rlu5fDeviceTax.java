package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fDeviceTax is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class Rlu5fDeviceTax extends Rlu5fDeviceTaxSerialized { 
   

						private char[] rlu5fDeviceTaxDesc = Field.fillLowValue(50);

								private BigDecimal rlu5fDeviceTaxAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for Rlu5fDeviceTax
	**/
    public Rlu5fDeviceTax() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rlu5fDeviceTax. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fDeviceTax(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlu5fDeviceTaxDesc
	 *	@return rlu5fDeviceTaxDesc
	 */
   public char[] getRlu5fDeviceTaxDesc() throws CFException{
     if (isRlu5fDeviceTaxDescModified()) { 
        rlu5fDeviceTaxDesc = refreshRlu5fDeviceTaxDesc();
     }
   		return rlu5fDeviceTaxDesc;
   }

  
	/**
	*  set variable rlu5fDeviceTaxDesc
	*  Corresponding COBOL Variable is RLU5F-DEVICE-TAX-DESC
	*  @param value
	**/
   public void setRlu5fDeviceTaxDesc(char[] value) {
      rlu5fDeviceTaxDesc = checkRlu5fDeviceTaxDescConstraints(value);
      serializeRlu5fDeviceTaxDesc(rlu5fDeviceTaxDesc);
   } 

     /**
	 * 	Update Rlu5fDeviceTaxDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fDeviceTaxDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fDeviceTaxDesc,rlu5fDeviceTaxDesc.length);
   	
   }
   
   public void setRlu5fDeviceTaxDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fDeviceTaxDesc,rlu5fDeviceTaxDesc.length);
   	
   }
   
     /**
	 * 	Update Rlu5fDeviceTaxDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fDeviceTaxDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fDeviceTaxDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fDeviceTaxDesc with another Field
	 *	@param value
	 */
   public void setRlu5fDeviceTaxDesc(Field source) {
       replace(source,0,source.length(),beginRlu5fDeviceTaxDesc,RLU_5F_DEVICE_TAX_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fDeviceTaxDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fDeviceTaxDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fDeviceTaxDesc,RLU_5F_DEVICE_TAX_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fDeviceTaxDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fDeviceTaxDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fDeviceTaxDesc+targetIndex,targetLen);
    
   }
	public BigDecimal getRlu5fDeviceTaxAmt() throws CFException {
        if (isRlu5fDeviceTaxAmtModified()) { 
           rlu5fDeviceTaxAmt = refreshRlu5fDeviceTaxAmt();
        }
   		return rlu5fDeviceTaxAmt;
	}

    public char[] getRlu5fDeviceTaxAmtString() {
          return  rlu5fDeviceTaxAmtString();
    }
	
	/**
	 * 	Update Rlu5fDeviceTaxAmt with the passed number
	 *  Corresponding COBOL Variable is RLU5F-DEVICE-TAX-AMT
	 *	@param number
	 */
	public void setRlu5fDeviceTaxAmt(BigDecimal number) {	
     rlu5fDeviceTaxAmt = checkRlu5fDeviceTaxAmtMaxLimit(number);
	    serializeRlu5fDeviceTaxAmt(rlu5fDeviceTaxAmt);
   }

	
	
	
	/**
	 * 	initializes Rlu5fDeviceTax
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRlu5fDeviceTaxDesc(CONSTANTS.SPACE_50);
			setRlu5fDeviceTaxAmt(BigDecimal.ZERO);
   }

		public static int getRlu5fDeviceTaxFieldLength() {
			return RLU_5F_DEVICE_TAX_LENGTH;
		}

}
  
