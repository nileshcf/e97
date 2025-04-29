package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse14bTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse14bTGrpGroup")

@Data
public class Wse14bTGrpGroup extends Wse14bTGrpGroupSerialized  implements InitializingBean {
   
					@Getter @Setter private Wse14bTGrp wse14bTGrp = new Wse14bTGrp();

						@Getter @Setter private char[] wse14bTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse14bTGrpGroup
	**/
    public Wse14bTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getWse14bTGrp().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
