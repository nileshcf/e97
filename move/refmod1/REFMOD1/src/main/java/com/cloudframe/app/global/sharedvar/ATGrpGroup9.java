package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGrpGroup9")

@Data
public class ATGrpGroup9 extends ATGrpGroup9Serialized  implements InitializingBean {
   
					@Getter @Setter private ATGrp9 aTGrp9 = new ATGrp9();

						@Getter @Setter private char[] aTGrpR9 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup9
	**/
    public ATGrpGroup9() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getATGrp9().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
