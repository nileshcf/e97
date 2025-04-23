package com.cloudframe.app.ip670010.dto;

/**
*  The class CtcDate802 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.ip670010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CtcDate802 extends CtcDate802Serialized {
   

								private int ctcCcyy802;
				private CtcCcyy802Redefined ctcCcyy802Redefined = new CtcCcyy802Redefined();
				private CtcMmdd802 ctcMmdd802 = new CtcMmdd802();
				private CtcJddd802 ctcJddd802 = new CtcJddd802();
	
	/**
	* Constructor for CtcDate802
	**/
    public CtcDate802() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ctcCcyy802Redefined.setParent(this,getStartOffset() + 0);
	       			ctcMmdd802.setParent(this,getStartOffset() + 4);
	       			ctcJddd802.setParent(this,getStartOffset() + 4);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ctcCcyy802
	 *	@return ctcCcyy802
	 */
	public int getCtcCcyy802() throws CFException {
       if (isCtcCcyy802Modified()) { 
           ctcCcyy802 = refreshCtcCcyy802();
        }
   		return ctcCcyy802;
	}
	

	
	   
	/**
	 * 	Update CtcCcyy802 with the passed value
	 *  Corresponding COBOL Variable is 802-CTC-CCYY
	 *	@param number
	 */
	public void setCtcCcyy802(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ctcCcyy802 = checkCtcCcyy802MaxLimit(number); 
		serializeCtcCcyy802(ctcCcyy802);
	}
	

	public void setCtcCcyy802(long number) {
	    number = checkCtcCcyy802MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtcCcyy802((int)number);
	}
	
	/**
	 * 	Update CtcCcyy802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcCcyy802(char[] value) throws CFException {
		 ctcCcyy802 = serializeCtcCcyy802(value);
	}
	/**
	 * 	Update CtcCcyy802 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcCcyy802String(char[] value) throws CFException {
		 setCtcCcyy802(value);
	}
	/**
	 *	Returns the value of ctcCcyy802Redefined
	 *	@return ctcCcyy802Redefined
	 */   
	 public CtcCcyy802Redefined getCtcCcyy802Redefined() {
   	return ctcCcyy802Redefined;
   }
   /**
	* 	Update CtcCcyy802Redefined with the passed value
	*   Corresponding COBOL Variable is 802-CTC-CCYY-REDEFINED
	*	@param value
	*/
   public void setCtcCcyy802Redefined(char[] value) {
      ctcCcyy802Redefined.setString(value); 
   }   
    
     /**
	 * 	Update CtcCcyy802Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCtcCcyy802Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ctcCcyy802Redefined.begin,ctcCcyy802Redefined.length());
   }
   
     /**
	 * 	Update CtcCcyy802Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCtcCcyy802Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ctcCcyy802Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CtcCcyy802Redefined with another Field
	 *	@param value
	 */
   public void setCtcCcyy802Redefined(Field source) {
   	replace(source,0,source.length(),ctcCcyy802Redefined.begin,ctcCcyy802Redefined.length());
   }  
   
     /**
	 * 	Update CtcCcyy802Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCtcCcyy802Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ctcCcyy802Redefined.begin,ctcCcyy802Redefined.length());
   }
   
     /**
	 * 	Update CtcCcyy802Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCtcCcyy802Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ctcCcyy802Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ctcMmdd802
	 *	@return ctcMmdd802
	 */   
	 public CtcMmdd802 getCtcMmdd802() {
   	return ctcMmdd802;
   }
   /**
	* 	Update CtcMmdd802 with the passed value
	*   Corresponding COBOL Variable is 802-CTC-MMDD
	*	@param value
	*/
   public void setCtcMmdd802(char[] value) {
      ctcMmdd802.setString(value); 
   }   
    
     /**
	 * 	Update CtcMmdd802 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCtcMmdd802(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ctcMmdd802.begin,ctcMmdd802.length());
   }
   
     /**
	 * 	Update CtcMmdd802 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCtcMmdd802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ctcMmdd802.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CtcMmdd802 with another Field
	 *	@param value
	 */
   public void setCtcMmdd802(Field source) {
   	replace(source,0,source.length(),ctcMmdd802.begin,ctcMmdd802.length());
   }  
   
     /**
	 * 	Update CtcMmdd802 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCtcMmdd802(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ctcMmdd802.begin,ctcMmdd802.length());
   }
   
     /**
	 * 	Update CtcMmdd802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCtcMmdd802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ctcMmdd802.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ctcJddd802
	 *	@return ctcJddd802
	 */   
	 public CtcJddd802 getCtcJddd802() {
   	return ctcJddd802;
   }
   /**
	* 	Update CtcJddd802 with the passed value
	*   Corresponding COBOL Variable is 802-CTC-JDDD
	*	@param value
	*/
   public void setCtcJddd802(char[] value) {
      ctcJddd802.setString(value); 
   }   
    
     /**
	 * 	Update CtcJddd802 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCtcJddd802(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ctcJddd802.begin,ctcJddd802.length());
   }
   
     /**
	 * 	Update CtcJddd802 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCtcJddd802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ctcJddd802.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CtcJddd802 with another Field
	 *	@param value
	 */
   public void setCtcJddd802(Field source) {
   	replace(source,0,source.length(),ctcJddd802.begin,ctcJddd802.length());
   }  
   
     /**
	 * 	Update CtcJddd802 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCtcJddd802(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ctcJddd802.begin,ctcJddd802.length());
   }
   
     /**
	 * 	Update CtcJddd802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCtcJddd802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ctcJddd802.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCtcDate802FieldLength() {
			return CTC_DATE_802_LENGTH;
		}

}
  
