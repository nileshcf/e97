package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50921Variables is used to handle fields declared in it
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

            @Component("global_ip50921Variables")

@Data
public class Ip50921Variables extends Ip50921VariablesSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip50921CurrentTs = Field.fillLowValue(26);

						@Getter @Setter private char[] ip50921Filler1 = Field.fillLowValue(54);
	
	/**
	* Constructor for Ip50921Variables
	**/
    public Ip50921Variables() {
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
	 * 	initializes Ip50921Variables
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50921CurrentTs(CONSTANTS.SPACE_26);
         setIp50921Filler1(CONSTANTS.SPACE_54);
   }


}
  
