package com.cloudframe.app.global.sharedvar;

/**
*  The class PtrIp280010Group800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ptrIp280010Group800")

@Data
public class PtrIp280010Group800 extends PtrIp280010Group800Serialized  implements InitializingBean {
   

						@Getter @Setter private char[] ptrIp280010800 = new char[8];
	
	/**
	* Constructor for PtrIp280010Group800
	**/
    public PtrIp280010Group800() {
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
  
