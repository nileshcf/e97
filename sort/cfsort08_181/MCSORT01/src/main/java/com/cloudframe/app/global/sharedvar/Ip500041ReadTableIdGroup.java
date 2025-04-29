package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip500041ReadTableIdGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip500041ReadTableIdGroup")

@Data
public class Ip500041ReadTableIdGroup extends Ip500041ReadTableIdGroupSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip500041ReadTableId = Field.fillLowValue(8);
					@Getter @Setter private Ip500041ReadTableIdRedefined ip500041ReadTableIdRedefined = new Ip500041ReadTableIdRedefined();
	
	/**
	* Constructor for Ip500041ReadTableIdGroup
	**/
    public Ip500041ReadTableIdGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp500041ReadTableIdRedefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
