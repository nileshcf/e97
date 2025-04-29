package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrpGroup14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGrpGroup14")

@Data
public class BTGrpGroup14 extends BTGrpGroup14Serialized  implements InitializingBean {
   
					@Getter @Setter private BTGrp14 bTGrp14 = new BTGrp14();

						@Getter @Setter private char[] bTGrpR14 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGrpGroup14
	**/
    public BTGrpGroup14() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getBTGrp14().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
