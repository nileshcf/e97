package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse19bTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse19bTGrpGroup")

@Data
public class Wse19bTGrpGroup extends Wse19bTGrpGroupSerialized  implements InitializingBean {
   
					@Getter @Setter private Wse19bTGrp wse19bTGrp = new Wse19bTGrp();

						@Getter @Setter private char[] wse19bTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse19bTGrpGroup
	**/
    public Wse19bTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getWse19bTGrp().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
