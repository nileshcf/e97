package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014wEntriesCntGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip02014wEntriesCntGroup")

@Data
public class Ip02014wEntriesCntGroup extends Ip02014wEntriesCntGroupSerialized  implements InitializingBean {
   

								@Getter @Setter private short ip02014wEntriesCnt;
	
	/**
	* Constructor for Ip02014wEntriesCntGroup
	**/
    public Ip02014wEntriesCntGroup() {
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
  
