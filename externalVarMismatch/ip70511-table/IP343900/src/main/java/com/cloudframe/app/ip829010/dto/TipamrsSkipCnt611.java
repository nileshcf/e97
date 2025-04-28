package com.cloudframe.app.ip829010.dto;

/**
*  The class TipamrsSkipCnt611 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class TipamrsSkipCnt611 extends TipamrsSkipCnt611Serialized {
   



								private long mrsSkipCnt611;
	
	/**
	* Constructor for TipamrsSkipCnt611
	**/
    public TipamrsSkipCnt611() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP829010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
       replaceValue( // serialize and save the value
             ("NO. OF RECS SKIPPED FROM MRS INSERT =      ").toCharArray()
             , getStartOffset() + 9
             ,43
             );
    }


 

	/**
	 *	Returns the value of mrsSkipCnt611
	 *	@return mrsSkipCnt611
	 */
	public long getMrsSkipCnt611() throws CFException {
       if (isMrsSkipCnt611Modified()) { 
           mrsSkipCnt611 = refreshMrsSkipCnt611();
        }
   		return mrsSkipCnt611;
	}
	

	
	   
	/**
	 * 	Update MrsSkipCnt611 with the passed value
	 *  Corresponding COBOL Variable is 611-MRS-SKIP-CNT
	 *	@param number
	 */
	public void setMrsSkipCnt611(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    mrsSkipCnt611 = checkMrsSkipCnt611MaxLimit(number); 
		serializeMrsSkipCnt611(mrsSkipCnt611);
	}
	

	/**
	 * 	Update MrsSkipCnt611 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMrsSkipCnt611(char[] value) throws CFException {
		 mrsSkipCnt611 = serializeMrsSkipCnt611(value);
	}
	/**
	 * 	Update MrsSkipCnt611 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMrsSkipCnt611String(char[] value) throws CFException {
		 setMrsSkipCnt611(value);
	}

	
	
	

		public static int getTipamrsSkipCnt611FieldLength() {
			return TIPAMRS_SKIP_CNT_611_LENGTH;
		}

}
  
