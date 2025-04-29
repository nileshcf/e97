package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PmtRusMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301PmtRusMqSrvActiveGroup")

@Data
public class Ip70301PmtRusMqSrvActiveGroup extends Ip70301PmtRusMqSrvActiveGroupSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip70301PmtRusMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PmtRusMqSrvActiveGroup
	**/
    public Ip70301PmtRusMqSrvActiveGroup() {
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
  
