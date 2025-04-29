package com.cloudframe.app.global.sharedvar;

/**
*  The class CheckPutQueueGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_checkPutQueueGroup100")

@Data
public class CheckPutQueueGroup100 extends CheckPutQueueGroup100Serialized  implements InitializingBean {
   

						@Getter @Setter private char[] checkPutQueue100 = Field.fillLowValue(1);
	
	/**
	* Constructor for CheckPutQueueGroup100
	**/
    public CheckPutQueueGroup100() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }




}
  
