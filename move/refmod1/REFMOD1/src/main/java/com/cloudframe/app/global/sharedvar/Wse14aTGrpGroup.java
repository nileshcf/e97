package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse14aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse14aTGrpGroup")

@Data
public class Wse14aTGrpGroup extends Wse14aTGrpGroupSerialized  implements InitializingBean {
   
					@Getter @Setter private Wse14aTGrp wse14aTGrp = new Wse14aTGrp();

						@Getter @Setter private char[] wse14aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse14aTGrpGroup
	**/
    public Wse14aTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getWse14aTGrp().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
