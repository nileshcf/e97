package com.cloudframe.app.global.sharedvar;

/**
*  The class EnvArea800 is used to handle fields declared in it
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

            @Component("global_envArea800")

@Data
public class EnvArea800 extends EnvArea800Serialized  implements InitializingBean {
   

						@Getter @Setter private char[] environmentInd800 = Field.fillLowValue(3);

						@Getter @Setter private char[] filler800 = Field.fillLowValue(77);
	
	/**
	* Constructor for EnvArea800
	**/
    public EnvArea800() {
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
	 * 	initializes EnvArea800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setEnvironmentInd800(CONSTANTS.SPACE_3);
         setFiller800(CONSTANTS.SPACE_77);
   }


}
  
