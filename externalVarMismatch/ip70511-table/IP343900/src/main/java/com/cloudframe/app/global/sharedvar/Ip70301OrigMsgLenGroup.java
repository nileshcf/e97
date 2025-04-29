package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301OrigMsgLenGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip70301OrigMsgLenGroup")

@Data
public class Ip70301OrigMsgLenGroup extends Ip70301OrigMsgLenGroupSerialized  implements InitializingBean {
   

								@Getter @Setter private long ip70301OrigMsgLen;
	
	/**
	* Constructor for Ip70301OrigMsgLenGroup
	**/
    public Ip70301OrigMsgLenGroup() {
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
  
