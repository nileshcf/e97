package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005ClearingDtTm is used to handle fields declared in it
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

            @Component("global_ip50005ClearingDtTm")

@Data
public class Ip50005ClearingDtTm extends Ip50005ClearingDtTmSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip50005ClearingDt = Field.fillLowValue(8);

						@Getter @Setter private char[] ip50005ClearingTm = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50005ClearingDtTm
	**/
    public Ip50005ClearingDtTm() {
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
	 * 	initializes Ip50005ClearingDtTm
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50005ClearingDt(CONSTANTS.SPACE_8);
         setIp50005ClearingTm(CONSTANTS.SPACE_2);
   }


}
  
