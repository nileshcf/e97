package com.cloudframe.app.global.sharedvar;

/**
*  The class SvcStkCountGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;


@GlobalDto
public class SvcStkCountGroup800 extends SvcStkCountGroup800Serialized { 
   

								private int svcStkCount800;
	
	/**
	* Constructor for SvcStkCountGroup800
	**/
    public SvcStkCountGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	public int getSvcStkCount800() throws CFException {
        if (isSvcStkCount800Modified()) { 
           svcStkCount800 = refreshSvcStkCount800();
        }
   		return svcStkCount800;
	}
	
	/**
	 * 	Update SvcStkCount800 with the passed value
	 *  Corresponding COBOL Variable is 800-SVC-STK-COUNT
	 *	@param number
	 */
	public void setSvcStkCount800(int number) {
			svcStkCount800 = checkSvcStkCount800MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSvcStkCount800(svcStkCount800);
	}


	public void setSvcStkCount800(long number) {
	    number = checkSvcStkCount800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSvcStkCount800((int)number);
	}
	

	
	
	

		public static int getSvcStkCountGroup800FieldLength() {
			return SVC_STK_COUNT_GROUP_800_LENGTH;
		}

}
  
