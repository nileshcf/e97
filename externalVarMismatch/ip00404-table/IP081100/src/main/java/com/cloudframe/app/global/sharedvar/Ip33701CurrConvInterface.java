package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip33701CurrConvInterface is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip33701CurrConvInterface")

@Data
public class Ip33701CurrConvInterface extends Ip33701CurrConvInterfaceSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip33701CurrConvInput ip33701CurrConvInput = new Ip33701CurrConvInput();
				@Getter @Setter private Ip33701CurrConvOutput ip33701CurrConvOutput = new Ip33701CurrConvOutput();
	
	/**
	* Constructor for Ip33701CurrConvInterface
	**/
    public Ip33701CurrConvInterface() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp33701CurrConvInput().setParent(this,getStartOffset() + 0);
					getIp33701CurrConvOutput().setParent(this,getStartOffset() + 39);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip33701CurrConvInterface
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp33701CurrConvInput().initialize();
     
          getIp33701CurrConvOutput().initialize();
     
   }


}
  
