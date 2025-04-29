package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50201Tipafaa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip50201Tipafaa")

@Data
public class Ip50201Tipafaa extends Ip50201TipafaaSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip50201FnsDataFields ip50201FnsDataFields = new Ip50201FnsDataFields();
	
	/**
	* Constructor for Ip50201Tipafaa
	**/
    public Ip50201Tipafaa() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp50201FnsDataFields().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip50201Tipafaa
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp50201FnsDataFields().initialize();
     
   }


}
  
