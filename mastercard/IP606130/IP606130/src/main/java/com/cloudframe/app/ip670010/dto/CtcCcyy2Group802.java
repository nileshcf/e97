package com.cloudframe.app.ip670010.dto;

/**
*  The class CtcCcyy2Group802 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/


import com.cloudframe.app.ip670010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CtcCcyy2Group802 extends CtcCcyy2Group802Serialized { 
   

								private int ctcCcyy2802;
					private CtcCcyy2802Redefined ctcCcyy2802Redefined = new CtcCcyy2802Redefined();
	
	/**
	* Constructor for CtcCcyy2Group802
	**/
    public CtcCcyy2Group802() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ctcCcyy2802Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ctcCcyy2802
	 *	@return ctcCcyy2802
	 */
	public int getCtcCcyy2802() throws CFException {
       if (isCtcCcyy2802Modified()) { 
           ctcCcyy2802 = refreshCtcCcyy2802();
        }
   		return ctcCcyy2802;
	}
	

	
	   
	/**
	 * 	Update CtcCcyy2802 with the passed value
	 *  Corresponding COBOL Variable is 802-CTC-CCYY-2
	 *	@param number
	 */
	public void setCtcCcyy2802(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ctcCcyy2802 = checkCtcCcyy2802MaxLimit(number); 
		serializeCtcCcyy2802(ctcCcyy2802);
	}
	

	public void setCtcCcyy2802(long number) {
	    number = checkCtcCcyy2802MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtcCcyy2802((int)number);
	}
	
	/**
	 * 	Update CtcCcyy2802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcCcyy2802(char[] value) throws CFException {
		 ctcCcyy2802 = serializeCtcCcyy2802(value);
	}
	/**
	 * 	Update CtcCcyy2802 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcCcyy2802String(char[] value) throws CFException {
		 setCtcCcyy2802(value);
	}
	/**
	 *	Returns the value of ctcCcyy2802Redefined
	 *	@return ctcCcyy2802Redefined
	 */   
	 public CtcCcyy2802Redefined getCtcCcyy2802Redefined() {
   	return ctcCcyy2802Redefined;
   }
   /**
	* 	Update CtcCcyy2802Redefined with the passed value
	*   Corresponding COBOL Variable is 802-CTC-CCYY-2-REDEFINED
	*	@param value
	*/
   public void setCtcCcyy2802Redefined(char[] value) {
      ctcCcyy2802Redefined.setString(value); 
   }   
    
     /**
	 * 	Update CtcCcyy2802Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCtcCcyy2802Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ctcCcyy2802Redefined.begin,ctcCcyy2802Redefined.length());
   }
   
     /**
	 * 	Update CtcCcyy2802Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCtcCcyy2802Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ctcCcyy2802Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CtcCcyy2802Redefined with another Field
	 *	@param value
	 */
   public void setCtcCcyy2802Redefined(Field source) {
   	replace(source,0,source.length(),ctcCcyy2802Redefined.begin,ctcCcyy2802Redefined.length());
   }  
   
     /**
	 * 	Update CtcCcyy2802Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCtcCcyy2802Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ctcCcyy2802Redefined.begin,ctcCcyy2802Redefined.length());
   }
   
     /**
	 * 	Update CtcCcyy2802Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCtcCcyy2802Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ctcCcyy2802Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCtcCcyy2Group802FieldLength() {
			return CTC_CCYY_2_GROUP_802_LENGTH;
		}

}
  
