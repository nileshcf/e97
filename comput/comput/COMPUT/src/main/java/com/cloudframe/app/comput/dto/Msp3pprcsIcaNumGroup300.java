package com.cloudframe.app.comput.dto;

/**
*  The class Msp3pprcsIcaNumGroup300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:42. using version 5.0.0.254
**/


import com.cloudframe.app.comput.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Msp3pprcsIcaNumGroup300 extends Msp3pprcsIcaNumGroup300Serialized { 
   

								private long msp3pprcsIcaNum300;
					private Msp3pprcsIcaNum300Redefined msp3pprcsIcaNum300Redefined = new Msp3pprcsIcaNum300Redefined();
	
	/**
	* Constructor for Msp3pprcsIcaNumGroup300
	**/
    public Msp3pprcsIcaNumGroup300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			msp3pprcsIcaNum300Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setMsp3pprcsIcaNum300(0L);
    }


 

	/**
	 *	Returns the value of msp3pprcsIcaNum300
	 *	@return msp3pprcsIcaNum300
	 */
	public long getMsp3pprcsIcaNum300() throws CFException {
       if (isMsp3pprcsIcaNum300Modified()) { 
           msp3pprcsIcaNum300 = refreshMsp3pprcsIcaNum300();
        }
   		return msp3pprcsIcaNum300;
	}
	

	
	   
	/**
	 * 	Update Msp3pprcsIcaNum300 with the passed value
	 *  Corresponding COBOL Variable is 300-MSP-3PPRCS-ICA-NUM
	 *	@param number
	 */
	public void setMsp3pprcsIcaNum300(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msp3pprcsIcaNum300 = checkMsp3pprcsIcaNum300MaxLimit(number); 
		serializeMsp3pprcsIcaNum300(msp3pprcsIcaNum300);
	}
	

	/**
	 * 	Update Msp3pprcsIcaNum300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsp3pprcsIcaNum300(char[] value) throws CFException {
		 msp3pprcsIcaNum300 = serializeMsp3pprcsIcaNum300(value);
	}
	/**
	 * 	Update Msp3pprcsIcaNum300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsp3pprcsIcaNum300String(char[] value) throws CFException {
		 setMsp3pprcsIcaNum300(value);
	}
	/**
	 *	Returns the value of msp3pprcsIcaNum300Redefined
	 *	@return msp3pprcsIcaNum300Redefined
	 */   
	 public Msp3pprcsIcaNum300Redefined getMsp3pprcsIcaNum300Redefined() {
   	return msp3pprcsIcaNum300Redefined;
   }
   /**
	* 	Update Msp3pprcsIcaNum300Redefined with the passed value
	*   Corresponding COBOL Variable is 300-MSP-3PPRCS-ICA-NUM-REDEFINED
	*	@param value
	*/
   public void setMsp3pprcsIcaNum300Redefined(char[] value) {
      msp3pprcsIcaNum300Redefined.setString(value); 
   }   
    
     /**
	 * 	Update Msp3pprcsIcaNum300Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsp3pprcsIcaNum300Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msp3pprcsIcaNum300Redefined.begin,msp3pprcsIcaNum300Redefined.length());
   }
   
     /**
	 * 	Update Msp3pprcsIcaNum300Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsp3pprcsIcaNum300Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msp3pprcsIcaNum300Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Msp3pprcsIcaNum300Redefined with another Field
	 *	@param value
	 */
   public void setMsp3pprcsIcaNum300Redefined(Field source) {
   	replace(source,0,source.length(),msp3pprcsIcaNum300Redefined.begin,msp3pprcsIcaNum300Redefined.length());
   }  
   
     /**
	 * 	Update Msp3pprcsIcaNum300Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsp3pprcsIcaNum300Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msp3pprcsIcaNum300Redefined.begin,msp3pprcsIcaNum300Redefined.length());
   }
   
     /**
	 * 	Update Msp3pprcsIcaNum300Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsp3pprcsIcaNum300Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msp3pprcsIcaNum300Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getMsp3pprcsIcaNumGroup300FieldLength() {
			return MSP_3PPRCS_ICA_NUM_GROUP_300_LENGTH;
		}

}
  
