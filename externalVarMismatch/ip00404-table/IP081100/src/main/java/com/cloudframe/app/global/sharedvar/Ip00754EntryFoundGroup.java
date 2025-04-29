package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00754EntryFoundGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip00754EntryFoundGroup")

@Data
public class Ip00754EntryFoundGroup extends Ip00754EntryFoundGroupSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip00754EntryFound = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00754EntryFoundGroup
	**/
    public Ip00754EntryFoundGroup() {
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
  
