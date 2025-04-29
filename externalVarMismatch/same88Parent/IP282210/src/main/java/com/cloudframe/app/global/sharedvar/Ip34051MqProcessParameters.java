package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip34051MqProcessParameters is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip34051MqProcessParameters")

@Data
public class Ip34051MqProcessParameters extends Ip34051MqProcessParametersSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip34051ProcessSwitch = Field.fillLowValue(1);

						@Getter @Setter private char[] ip34051QueueType = Field.fillLowValue(1);

						@Getter @Setter private char[] ip34051ServCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip34051FuncCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip34051TipacliSwitch = Field.fillLowValue(1);

						@Getter @Setter private char[] ip34051TipasvcSwitch = Field.fillLowValue(1);

						@Getter @Setter private char[] ip34051CallFromIp545110 = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip34051MqProcessParameters
	**/
    public Ip34051MqProcessParameters() {
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
	 * 	initializes Ip34051MqProcessParameters
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp34051ProcessSwitch(CONSTANTS.SPACE);
         setIp34051QueueType(CONSTANTS.SPACE);
         setIp34051ServCd(CONSTANTS.SPACE_4);
         setIp34051FuncCd(CONSTANTS.SPACE_4);
         setIp34051TipacliSwitch(CONSTANTS.SPACE);
         setIp34051TipasvcSwitch(CONSTANTS.SPACE);
         setIp34051CallFromIp545110(CONSTANTS.SPACE);
   }


}
  
