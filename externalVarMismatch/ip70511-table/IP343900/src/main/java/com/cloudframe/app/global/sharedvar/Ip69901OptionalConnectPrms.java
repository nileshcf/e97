package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip69901OptionalConnectPrms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip69901OptionalConnectPrms")

@Data
public class Ip69901OptionalConnectPrms extends Ip69901OptionalConnectPrmsSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip69901DatabaseId = Field.fillLowValue(18);

						@Getter @Setter private char[] ip69901CollectionId = Field.fillLowValue(18);
	
	/**
	* Constructor for Ip69901OptionalConnectPrms
	**/
    public Ip69901OptionalConnectPrms() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip69901OptionalConnectPrms
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp69901DatabaseId(CONSTANTS.SPACE_18);
         setIp69901CollectionId(CONSTANTS.SPACE_18);
   }


}
  
