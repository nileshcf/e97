package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse18aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse18aTGrpGroup")

@Data
public class Wse18aTGrpGroup extends Wse18aTGrpGroupSerialized  implements InitializingBean {
   
					@Getter @Setter private Wse18aTGrp wse18aTGrp = new Wse18aTGrp();

						@Getter @Setter private char[] wse18aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse18aTGrpGroup
	**/
    public Wse18aTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getWse18aTGrp().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
