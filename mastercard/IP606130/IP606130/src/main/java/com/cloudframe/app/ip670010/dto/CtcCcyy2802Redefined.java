package com.cloudframe.app.ip670010.dto;

/**
*  The class CtcCcyy2802Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip670010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CtcCcyy2802Redefined extends CtcCcyy2802RedefinedSerialized { 
   

								private int ctcCc2802;

						private char[] ctcCcx2802 = Field.fillLowValue(2);
	
	/**
	* Constructor for CtcCcyy2802Redefined
	**/
    public CtcCcyy2802Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CtcCcyy2802Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CtcCcyy2802Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ctcCc2802
	 *	@return ctcCc2802
	 */
	public int getCtcCc2802() throws CFException {
       if (isCtcCc2802Modified()) { 
           ctcCc2802 = refreshCtcCc2802();
        }
   		return ctcCc2802;
	}
	

	
	   
	/**
	 * 	Update CtcCc2802 with the passed value
	 *  Corresponding COBOL Variable is 802-CTC-CC-2
	 *	@param number
	 */
	public void setCtcCc2802(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ctcCc2802 = checkCtcCc2802MaxLimit(number); 
		serializeCtcCc2802(ctcCc2802);
	}
	

	public void setCtcCc2802(long number) {
	    number = checkCtcCc2802MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtcCc2802((int)number);
	}
	
	/**
	 * 	Update CtcCc2802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcCc2802(char[] value) throws CFException {
		 ctcCc2802 = serializeCtcCc2802(value);
	}
	/**
	 * 	Update CtcCc2802 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcCc2802String(char[] value) throws CFException {
		 setCtcCc2802(value);
	}
	/**
	 *	Returns the value of ctcCcx2802
	 *	@return ctcCcx2802
	 */
   public char[] getCtcCcx2802() throws CFException{
     if (isCtcCcx2802Modified()) { 
        ctcCcx2802 = refreshCtcCcx2802();
     }
   		return ctcCcx2802;
   }

  
	/**
	*  set variable ctcCcx2802
	*  Corresponding COBOL Variable is 802-CTC-CCX-2
	*  @param value
	**/
   public void setCtcCcx2802(char[] value) {
      ctcCcx2802 = checkCtcCcx2802Constraints(value);
      serializeCtcCcx2802(ctcCcx2802);
   } 

     /**
	 * 	Update CtcCcx2802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCtcCcx2802(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCtcCcx2802,ctcCcx2802.length);
   	
   }
   
   public void setCtcCcx2802(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCtcCcx2802,ctcCcx2802.length);
   	
   }
   
     /**
	 * 	Update CtcCcx2802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCtcCcx2802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCtcCcx2802+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CtcCcx2802 with another Field
	 *	@param value
	 */
   public void setCtcCcx2802(Field source) {
       replace(source,0,source.length(),beginCtcCcx2802,CTC_CCX_2802_LEN);
   	
   }  
   
     /**
	 * 	Update CtcCcx2802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCtcCcx2802(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCtcCcx2802,CTC_CCX_2802_LEN);
   	
   }
   
     /**
	 * 	Update CtcCcx2802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCtcCcx2802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCtcCcx2802+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCtcCcyy2802RedefinedFieldLength() {
			return CTC_CCYY_2802_REDEFINED_LENGTH;
		}

}
  
