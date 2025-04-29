package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGroup15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGroup15")

@Data
public class BTGroup15 extends BTGroup15Serialized  implements InitializingBean {
   
					@Getter @Setter private BT15 bT15 = new BT15();

						@Getter @Setter private char[] bTR15 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGroup15
	**/
    public BTGroup15() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getBT15().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
