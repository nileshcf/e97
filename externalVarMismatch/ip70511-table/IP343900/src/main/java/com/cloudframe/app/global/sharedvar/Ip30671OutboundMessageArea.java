package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30671OutboundMessageArea is used to handle fields declared in it
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

            @Component("global_ip30671OutboundMessageArea")

@Data
public class Ip30671OutboundMessageArea extends Ip30671OutboundMessageAreaSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip30671SortKey = Field.fillLowValue(212);

						@Getter @Setter private char[] ip30671MessageArea = Field.fillLowValue(32544);
	
	/**
	* Constructor for Ip30671OutboundMessageArea
	**/
    public Ip30671OutboundMessageArea() {
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
	 * 	initializes Ip30671OutboundMessageArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp30671SortKey(CONSTANTS.SPACE_212);
         setIp30671MessageArea(CONSTANTS.SPACE_32544);
   }


}
  
