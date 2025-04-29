package com.cloudframe.app.global.sharedvar;

/**
*  The class SeprTableGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_seprTableGroup")

@Data
public class SeprTableGroup extends SeprTableGroupSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] seprTable = Field.fillLowValue(600);
					@Getter @Setter private SeprTableRedefined seprTableRedefined = new SeprTableRedefined();
	
	/**
	* Constructor for SeprTableGroup
	**/
    public SeprTableGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getSeprTableRedefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
