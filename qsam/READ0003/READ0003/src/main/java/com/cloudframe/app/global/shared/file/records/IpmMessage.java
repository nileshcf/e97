package com.cloudframe.app.global.shared.file.records;

/**
*  The class IpmMessage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.List;

            @Component("global_ipmMessage")

@Data
public class IpmMessage extends IpmMessageSerialized  implements InitializingBean {
   
      private List<char[]> filler; 

	
	/**
	* Constructor for IpmMessage
	**/
    public IpmMessage() {
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
  
