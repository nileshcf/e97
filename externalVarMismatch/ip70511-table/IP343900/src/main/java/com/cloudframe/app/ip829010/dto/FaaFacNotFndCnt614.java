package com.cloudframe.app.ip829010.dto;

/**
*  The class FaaFacNotFndCnt614 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class FaaFacNotFndCnt614 extends FaaFacNotFndCnt614Serialized {
   



								private long facNotFndCnt614;
	
	/**
	* Constructor for FaaFacNotFndCnt614
	**/
    public FaaFacNotFndCnt614() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP829010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
       replaceValue( // serialize and save the value
             ("NO. OF TXNS NOT FOUND IN FAA/FAC    =      ").toCharArray()
             , getStartOffset() + 9
             ,43
             );
    }


 

	/**
	 *	Returns the value of facNotFndCnt614
	 *	@return facNotFndCnt614
	 */
	public long getFacNotFndCnt614() throws CFException {
       if (isFacNotFndCnt614Modified()) { 
           facNotFndCnt614 = refreshFacNotFndCnt614();
        }
   		return facNotFndCnt614;
	}
	

	
	   
	/**
	 * 	Update FacNotFndCnt614 with the passed value
	 *  Corresponding COBOL Variable is 614-FAC-NOT-FND-CNT
	 *	@param number
	 */
	public void setFacNotFndCnt614(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    facNotFndCnt614 = checkFacNotFndCnt614MaxLimit(number); 
		serializeFacNotFndCnt614(facNotFndCnt614);
	}
	

	/**
	 * 	Update FacNotFndCnt614 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFacNotFndCnt614(char[] value) throws CFException {
		 facNotFndCnt614 = serializeFacNotFndCnt614(value);
	}
	/**
	 * 	Update FacNotFndCnt614 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFacNotFndCnt614String(char[] value) throws CFException {
		 setFacNotFndCnt614(value);
	}

	
	
	

		public static int getFaaFacNotFndCnt614FieldLength() {
			return FAA_FAC_NOT_FND_CNT_614_LENGTH;
		}

}
  
