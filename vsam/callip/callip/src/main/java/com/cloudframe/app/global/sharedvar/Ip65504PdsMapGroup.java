package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsMapGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip65504PdsMapGroup")

@Data
public class Ip65504PdsMapGroup extends Ip65504PdsMapGroupSerialized  implements InitializingBean {
   
					@Getter @Setter private Ip65504PdsMap ip65504PdsMap = new Ip65504PdsMap();
					@Getter @Setter private Ip65504PdsNames ip65504PdsNames = new Ip65504PdsNames();
	
	/**
	* Constructor for Ip65504PdsMapGroup
	**/
    public Ip65504PdsMapGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp65504PdsMap().setParent(this,getStartOffset() + 0);
					getIp65504PdsNames().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
