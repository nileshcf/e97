package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGrpGroup8")

@Data
public class ATGrpGroup8 extends ATGrpGroup8Serialized  implements InitializingBean {
   
					@Getter @Setter private ATGrp8 aTGrp8 = new ATGrp8();

						@Getter @Setter private char[] aTGrpR8 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup8
	**/
    public ATGrpGroup8() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getATGrp8().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
