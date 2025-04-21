package com.cloudframe.app.ip670010.dto;

/**
*  The class CtcCcyy802Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip670010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CtcCcyy802Redefined extends CtcCcyy802RedefinedSerialized { 
   

								private int ctcCc802;

						private char[] ctcCcx802 = Field.fillLowValue(2);
	
	/**
	* Constructor for CtcCcyy802Redefined
	**/
    public CtcCcyy802Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CtcCcyy802Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CtcCcyy802Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ctcCc802
	 *	@return ctcCc802
	 */
	public int getCtcCc802() throws CFException {
       if (isCtcCc802Modified()) { 
           ctcCc802 = refreshCtcCc802();
        }
   		return ctcCc802;
	}
	

	
	   
	/**
	 * 	Update CtcCc802 with the passed value
	 *  Corresponding COBOL Variable is 802-CTC-CC
	 *	@param number
	 */
	public void setCtcCc802(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ctcCc802 = checkCtcCc802MaxLimit(number); 
		serializeCtcCc802(ctcCc802);
	}
	

	public void setCtcCc802(long number) {
	    number = checkCtcCc802MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtcCc802((int)number);
	}
	
	/**
	 * 	Update CtcCc802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcCc802(char[] value) throws CFException {
		 ctcCc802 = serializeCtcCc802(value);
	}
	/**
	 * 	Update CtcCc802 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcCc802String(char[] value) throws CFException {
		 setCtcCc802(value);
	}
	/**
	 *	Returns the value of ctcCcx802
	 *	@return ctcCcx802
	 */
   public char[] getCtcCcx802() throws CFException{
     if (isCtcCcx802Modified()) { 
        ctcCcx802 = refreshCtcCcx802();
     }
   		return ctcCcx802;
   }

  
	/**
	*  set variable ctcCcx802
	*  Corresponding COBOL Variable is 802-CTC-CCX
	*  @param value
	**/
   public void setCtcCcx802(char[] value) {
      ctcCcx802 = checkCtcCcx802Constraints(value);
      serializeCtcCcx802(ctcCcx802);
   } 

     /**
	 * 	Update CtcCcx802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCtcCcx802(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCtcCcx802,ctcCcx802.length);
   	
   }
   
   public void setCtcCcx802(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCtcCcx802,ctcCcx802.length);
   	
   }
   
     /**
	 * 	Update CtcCcx802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCtcCcx802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCtcCcx802+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CtcCcx802 with another Field
	 *	@param value
	 */
   public void setCtcCcx802(Field source) {
       replace(source,0,source.length(),beginCtcCcx802,CTC_CCX_802_LEN);
   	
   }  
   
     /**
	 * 	Update CtcCcx802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCtcCcx802(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCtcCcx802,CTC_CCX_802_LEN);
   	
   }
   
     /**
	 * 	Update CtcCcx802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCtcCcx802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCtcCcx802+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCtcCcyy802RedefinedFieldLength() {
			return CTC_CCYY_802_REDEFINED_LENGTH;
		}

}
  
