package com.cloudframe.app.ip829010.dto;

/**
*  The class MrsRowCnt608 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class MrsRowCnt608 extends MrsRowCnt608Serialized {
   



								private long mrsIsrtCnt608;
	
	/**
	* Constructor for MrsRowCnt608
	**/
    public MrsRowCnt608() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP829010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
       replaceValue( // serialize and save the value
             ("NO. OF RECS INSERTED INTO TIPAMRS   =      ").toCharArray()
             , getStartOffset() + 9
             ,43
             );
    }


 

	/**
	 *	Returns the value of mrsIsrtCnt608
	 *	@return mrsIsrtCnt608
	 */
	public long getMrsIsrtCnt608() throws CFException {
       if (isMrsIsrtCnt608Modified()) { 
           mrsIsrtCnt608 = refreshMrsIsrtCnt608();
        }
   		return mrsIsrtCnt608;
	}
	

	
	   
	/**
	 * 	Update MrsIsrtCnt608 with the passed value
	 *  Corresponding COBOL Variable is 608-MRS-ISRT-CNT
	 *	@param number
	 */
	public void setMrsIsrtCnt608(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    mrsIsrtCnt608 = checkMrsIsrtCnt608MaxLimit(number); 
		serializeMrsIsrtCnt608(mrsIsrtCnt608);
	}
	

	/**
	 * 	Update MrsIsrtCnt608 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMrsIsrtCnt608(char[] value) throws CFException {
		 mrsIsrtCnt608 = serializeMrsIsrtCnt608(value);
	}
	/**
	 * 	Update MrsIsrtCnt608 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMrsIsrtCnt608String(char[] value) throws CFException {
		 setMrsIsrtCnt608(value);
	}

	
	
	

		public static int getMrsRowCnt608FieldLength() {
			return MRS_ROW_CNT_608_LENGTH;
		}

}
  
