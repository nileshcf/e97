package com.cloudframe.app.global.sharedvar;

/**
*  The class StrtLngth800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_strtLngth800")

@Data
public class StrtLngth800 extends StrtLngth800Serialized  implements InitializingBean {
   

								@Getter @Setter private short candidateStrt800;

								@Getter @Setter private short candidateLnth800;
	
	/**
	* Constructor for StrtLngth800
	**/
    public StrtLngth800() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


	/**
	 * 	initializes StrtLngth800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setCandidateStrt800((short)0);
         	setCandidateLnth800((short)0);
   }


}
  
