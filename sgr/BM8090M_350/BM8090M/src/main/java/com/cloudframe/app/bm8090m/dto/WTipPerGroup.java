package com.cloudframe.app.bm8090m.dto;

/**
*  The class WTipPerGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WTipPerGroup extends WTipPerGroupSerialized { 
   

								private int wTipPer01;
					private WtipPer wtipPer = new WtipPer();
	
	/**
	* Constructor for WTipPerGroup
	**/
    public WTipPerGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wtipPer.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWTipPer01(0);
    }


 

	/**
	 *	Returns the value of wTipPer01
	 *	@return wTipPer01
	 */
	public int getWTipPer01() throws CFException {
       if (isWTipPer01Modified()) { 
           wTipPer01 = refreshWTipPer01();
        }
   		return wTipPer01;
	}
	

	
	   
	/**
	 * 	Update WTipPer01 with the passed value
	 *  Corresponding COBOL Variable is W-TIP-PER
	 *	@param number
	 */
	public void setWTipPer01(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wTipPer01 = checkWTipPer01MaxLimit(number); 
		serializeWTipPer01(wTipPer01);
	}
	

	public void setWTipPer01(long number) {
	    number = checkWTipPer01MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWTipPer01((int)number);
	}
	
	/**
	 * 	Update WTipPer01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWTipPer01(char[] value) throws CFException {
		 wTipPer01 = serializeWTipPer01(value);
	}
	/**
	 * 	Update WTipPer01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWTipPer01String(char[] value) throws CFException {
		 setWTipPer01(value);
	}
	/**
	 *	Returns the value of wtipPer
	 *	@return wtipPer
	 */   
	 public WtipPer getWtipPer() {
   	return wtipPer;
   }
   /**
	* 	Update WtipPer with the passed value
	*   Corresponding COBOL Variable is WTIP-PER
	*	@param value
	*/
   public void setWtipPer(char[] value) {
      wtipPer.setString(value); 
   }   
    
     /**
	 * 	Update WtipPer 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWtipPer(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wtipPer.begin,wtipPer.length());
   }
   
     /**
	 * 	Update WtipPer 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWtipPer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wtipPer.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WtipPer with another Field
	 *	@param value
	 */
   public void setWtipPer(Field source) {
   	replace(source,0,source.length(),wtipPer.begin,wtipPer.length());
   }  
   
     /**
	 * 	Update WtipPer 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWtipPer(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wtipPer.begin,wtipPer.length());
   }
   
     /**
	 * 	Update WtipPer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWtipPer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wtipPer.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWTipPerGroupFieldLength() {
			return W_TIP_PER_GROUP_LENGTH;
		}

}
  
