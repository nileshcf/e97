package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30881Db2McwaitInputValue is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip30881Db2McwaitInputValue")

@Data
public class Ip30881Db2McwaitInputValue extends Ip30881Db2McwaitInputValueSerialized  implements InitializingBean {
   

								@Getter @Setter private int ip30881911RetryValue;
	
	/**
	* Constructor for Ip30881Db2McwaitInputValue
	**/
    public Ip30881Db2McwaitInputValue() {
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
	 * 	initializes Ip30881Db2McwaitInputValue
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp30881911RetryValue(0);
   }


}
  
