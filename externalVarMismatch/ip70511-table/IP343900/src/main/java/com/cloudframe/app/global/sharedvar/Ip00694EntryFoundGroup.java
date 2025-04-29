package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00694EntryFoundGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip00694EntryFoundGroup")

@Data
public class Ip00694EntryFoundGroup extends Ip00694EntryFoundGroupSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip00694EntryFound = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00694EntryFoundGroup
	**/
    public Ip00694EntryFoundGroup() {
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
  
