package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip662011ErrSubscriptGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip662011ErrSubscriptGroup")

@Data
public class Ip662011ErrSubscriptGroup extends Ip662011ErrSubscriptGroupSerialized  implements InitializingBean {
   

								@Getter @Setter private int ip662011ErrSubscript;
	
	/**
	* Constructor for Ip662011ErrSubscriptGroup
	**/
    public Ip662011ErrSubscriptGroup() {
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
  
