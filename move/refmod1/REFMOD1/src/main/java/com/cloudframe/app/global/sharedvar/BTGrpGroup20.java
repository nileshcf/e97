package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrpGroup20 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGrpGroup20")

@Data
public class BTGrpGroup20 extends BTGrpGroup20Serialized  implements InitializingBean {
   
					@Getter @Setter private BTGrp20 bTGrp20 = new BTGrp20();

						@Getter @Setter private char[] bTGrpR20 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGrpGroup20
	**/
    public BTGrpGroup20() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getBTGrp20().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
