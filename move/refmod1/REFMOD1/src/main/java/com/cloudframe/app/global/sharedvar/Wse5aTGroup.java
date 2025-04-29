package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse5aTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse5aTGroup")

@Data
public class Wse5aTGroup extends Wse5aTGroupSerialized  implements InitializingBean {
   
					@Getter @Setter private Wse5aT wse5aT = new Wse5aT();

						@Getter @Setter private char[] wse5aTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse5aTGroup
	**/
    public Wse5aTGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getWse5aT().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
