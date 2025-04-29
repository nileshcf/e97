package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse13aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse13aTGrpGroup")

@Data
public class Wse13aTGrpGroup extends Wse13aTGrpGroupSerialized  implements InitializingBean {
   
					@Getter @Setter private Wse13aTGrp wse13aTGrp = new Wse13aTGrp();

						@Getter @Setter private char[] wse13aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse13aTGrpGroup
	**/
    public Wse13aTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getWse13aTGrp().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
