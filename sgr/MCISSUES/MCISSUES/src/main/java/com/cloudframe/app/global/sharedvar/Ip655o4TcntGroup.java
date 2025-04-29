package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip655o4TcntGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip655o4TcntGroup")

@Data
public class Ip655o4TcntGroup extends Ip655o4TcntGroupSerialized  implements InitializingBean {
   

								@Getter @Setter private short ip655o4Tcnt;
	
	/**
	* Constructor for Ip655o4TcntGroup
	**/
    public Ip655o4TcntGroup() {
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
  
