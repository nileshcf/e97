package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup18 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGrpGroup18")

@Data
public class ATGrpGroup18 extends ATGrpGroup18Serialized  implements InitializingBean {
   
					@Getter @Setter private ATGrp18 aTGrp18 = new ATGrp18();

						@Getter @Setter private char[] aTGrpR18 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup18
	**/
    public ATGrpGroup18() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getATGrp18().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
