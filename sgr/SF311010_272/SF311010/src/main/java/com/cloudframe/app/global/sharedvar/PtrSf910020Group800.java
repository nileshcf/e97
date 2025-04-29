package com.cloudframe.app.global.sharedvar;

/**
*  The class PtrSf910020Group800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ptrSf910020Group800")

@Data
public class PtrSf910020Group800 extends PtrSf910020Group800Serialized  implements InitializingBean {
   

						@Getter @Setter private char[] ptrSf910020800 = new char[8];
	
	/**
	* Constructor for PtrSf910020Group800
	**/
    public PtrSf910020Group800() {
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
  
