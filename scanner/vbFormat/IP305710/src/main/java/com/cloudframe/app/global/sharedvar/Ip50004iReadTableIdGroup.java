package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50004iReadTableIdGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip50004iReadTableIdGroup")

@Data
public class Ip50004iReadTableIdGroup extends Ip50004iReadTableIdGroupSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip50004iReadTableId = Field.fillLowValue(8);
					@Getter @Setter private Ip50004iReadTableIdRedefined ip50004iReadTableIdRedefined = new Ip50004iReadTableIdRedefined();
	
	/**
	* Constructor for Ip50004iReadTableIdGroup
	**/
    public Ip50004iReadTableIdGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp50004iReadTableIdRedefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
