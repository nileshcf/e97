package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGroup16 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGroup16")

@Data
public class BTGroup16 extends BTGroup16Serialized  implements InitializingBean {
   
					@Getter @Setter private BT16 bT16 = new BT16();

						@Getter @Setter private char[] bTR16 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGroup16
	**/
    public BTGroup16() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getBT16().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
