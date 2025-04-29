package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50004iOneDayRecLthGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip50004iOneDayRecLthGroup")

@Data
public class Ip50004iOneDayRecLthGroup extends Ip50004iOneDayRecLthGroupSerialized  implements InitializingBean {
   

								@Getter @Setter private long ip50004iOneDayRecLth;
	
	/**
	* Constructor for Ip50004iOneDayRecLthGroup
	**/
    public Ip50004iOneDayRecLthGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }




}
  
