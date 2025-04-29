package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip996021JobInformation is used to handle fields declared in it
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

            @Component("global_ip996021JobInformation")

@Data
public class Ip996021JobInformation extends Ip996021JobInformationSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip996021JobId = Field.fillLowValue(8);

						@Getter @Setter private char[] ip996021JobName = Field.fillLowValue(8);

						@Getter @Setter private char[] ip996021UserId = Field.fillLowValue(8);

						@Getter @Setter private char[] ip996021LparName = Field.fillLowValue(4);

	
	/**
	* Constructor for Ip996021JobInformation
	**/
    public Ip996021JobInformation() {
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
	 * 	initializes Ip996021JobInformation
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp996021JobId(CONSTANTS.SPACE_8);
         setIp996021JobName(CONSTANTS.SPACE_8);
         setIp996021UserId(CONSTANTS.SPACE_8);
         setIp996021LparName(CONSTANTS.SPACE_4);
   }


}
  
