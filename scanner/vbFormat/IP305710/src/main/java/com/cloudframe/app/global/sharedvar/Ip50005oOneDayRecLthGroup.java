package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005oOneDayRecLthGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip50005oOneDayRecLthGroup")

@Data
public class Ip50005oOneDayRecLthGroup extends Ip50005oOneDayRecLthGroupSerialized  implements InitializingBean {
   

								@Getter @Setter private long ip50005oOneDayRecLth;

								@Getter @Setter private long ip50005oTableDataLength;
	
	/**
	* Constructor for Ip50005oOneDayRecLthGroup
	**/
    public Ip50005oOneDayRecLthGroup() {
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
  
