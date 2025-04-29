package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse11aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse11aTGrpGroup")

@Data
public class Wse11aTGrpGroup extends Wse11aTGrpGroupSerialized  implements InitializingBean {
   
					@Getter @Setter private Wse11aTGrp wse11aTGrp = new Wse11aTGrp();

						@Getter @Setter private char[] wse11aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse11aTGrpGroup
	**/
    public Wse11aTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getWse11aTGrp().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
