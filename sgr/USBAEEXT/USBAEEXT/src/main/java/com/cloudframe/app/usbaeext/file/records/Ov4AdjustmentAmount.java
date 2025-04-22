package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4AdjustmentAmount is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.usbaeext.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Ov4AdjustmentAmount extends Ov4AdjustmentAmountSerialized { 
   

						private char[] ov4AdjSign = Field.fillLowValue(1);

								private BigDecimal ov4AdjAmnt = BigDecimal.ZERO;
	
	/**
	* Constructor for Ov4AdjustmentAmount
	**/
    public Ov4AdjustmentAmount() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ov4AdjustmentAmount. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4AdjustmentAmount(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ov4AdjSign
	 *	@return ov4AdjSign
	 */
   public char[] getOv4AdjSign() throws CFException{
     if (isOv4AdjSignModified()) { 
        ov4AdjSign = refreshOv4AdjSign();
     }
   		return ov4AdjSign;
   }

  
	/**
	*  set variable ov4AdjSign
	*  Corresponding COBOL Variable is OV4-ADJ-SIGN
	*  @param value
	**/
   public void setOv4AdjSign(char[] value) {
      ov4AdjSign = checkOv4AdjSignConstraints(value);
      serializeOv4AdjSign(ov4AdjSign);
   } 

     /**
	 * 	Update Ov4AdjSign 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4AdjSign(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4AdjSign,ov4AdjSign.length);
   	
   }
   
   public void setOv4AdjSign(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4AdjSign,ov4AdjSign.length);
   	
   }
   
     /**
	 * 	Update Ov4AdjSign 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4AdjSign(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4AdjSign+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4AdjSign with another Field
	 *	@param value
	 */
   public void setOv4AdjSign(Field source) {
       replace(source,0,source.length(),beginOv4AdjSign,OV_4_ADJ_SIGN_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4AdjSign 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4AdjSign(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4AdjSign,OV_4_ADJ_SIGN_LEN);
   	
   }
   
     /**
	 * 	Update Ov4AdjSign 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4AdjSign(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4AdjSign+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ov4AdjAmnt
	 *	@return ov4AdjAmnt
	 */
	public BigDecimal getOv4AdjAmnt() throws CFException {
       if (isOv4AdjAmntModified()) { 
           ov4AdjAmnt = refreshOv4AdjAmnt();
        }
   		return ov4AdjAmnt;
	}
	

	
	   
	/**
	 * 	Update Ov4AdjAmnt with the passed number
	 *  Corresponding COBOL Variable is OV4-ADJ-AMNT
	 *	@param number
	 */
	public void setOv4AdjAmnt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       ov4AdjAmnt = checkOv4AdjAmntMaxLimit(number);
	    serializeOv4AdjAmnt(ov4AdjAmnt);
   }
	/**
	 * 	Update Ov4AdjAmnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4AdjAmnt(char[] value) throws CFException {
		 ov4AdjAmnt = serializeOv4AdjAmnt(value);
	}   

	
	
	

		public static int getOv4AdjustmentAmountFieldLength() {
			return OV_4_ADJUSTMENT_AMOUNT_LENGTH;
		}

}
  
