package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50211Tipafac is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip50211Tipafac")

@Data
public class Ip50211Tipafac extends Ip50211TipafacSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip50211FnsDataFields ip50211FnsDataFields = new Ip50211FnsDataFields();
	
	/**
	* Constructor for Ip50211Tipafac
	**/
    public Ip50211Tipafac() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp50211FnsDataFields().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip50211Tipafac
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp50211FnsDataFields().initialize();
     
   }


}
  
