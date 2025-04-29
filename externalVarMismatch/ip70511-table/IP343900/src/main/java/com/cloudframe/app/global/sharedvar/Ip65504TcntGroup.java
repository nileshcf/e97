package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504TcntGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip65504TcntGroup")

@Data
public class Ip65504TcntGroup extends Ip65504TcntGroupSerialized  implements InitializingBean {
   

								@Getter @Setter private short ip65504Tcnt;
	
	/**
	* Constructor for Ip65504TcntGroup
	**/
    public Ip65504TcntGroup() {
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
  
