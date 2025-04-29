package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip69931Linkage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip69931Linkage")

@Data
public class Ip69931Linkage extends Ip69931LinkageSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip69931InputFields ip69931InputFields = new Ip69931InputFields();
				@Getter @Setter private Ip69931OutputFields ip69931OutputFields = new Ip69931OutputFields();
	
	/**
	* Constructor for Ip69931Linkage
	**/
    public Ip69931Linkage() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp69931InputFields().setParent(this,getStartOffset() + 0);
					getIp69931OutputFields().setParent(this,getStartOffset() + 14);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip69931Linkage
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp69931InputFields().initialize();
     
          getIp69931OutputFields().initialize();
     
   }


}
  
