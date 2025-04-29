package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip16901EntryFoundYGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip16901EntryFoundYGroup")

@Data
public class Ip16901EntryFoundYGroup extends Ip16901EntryFoundYGroupSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip16901EntryFoundY = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip16901EntryFoundYGroup
	**/
    public Ip16901EntryFoundYGroup() {
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
  
