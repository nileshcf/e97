package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00694TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip00694TableEntry")

@Data
public class Ip00694TableEntry extends Ip00694TableEntrySerialized  implements InitializingBean {
   
				@Getter @Setter private Ip00694TableData ip00694TableData = new Ip00694TableData();
	
	/**
	* Constructor for Ip00694TableEntry
	**/
    public Ip00694TableEntry() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp00694TableData().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip00694TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp00694TableData().initialize();
     
   }


}
  
