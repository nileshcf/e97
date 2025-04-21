package com.cloudframe.app.global.sharedvar;

/**
*  The class SvcStkCountGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_svcStkCountGroup800")

public class SvcStkCountGroup800 extends SvcStkCountGroup800Serialized  implements InitializingBean {
   

								private int svcStkCount800;
	
	/**
	* Constructor for SvcStkCountGroup800
	**/
    public SvcStkCountGroup800() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
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
  
