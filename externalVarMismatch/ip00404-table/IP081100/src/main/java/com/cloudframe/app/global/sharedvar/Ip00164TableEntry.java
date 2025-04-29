package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00164TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip00164TableEntry")

@Data
public class Ip00164TableEntry extends Ip00164TableEntrySerialized  implements InitializingBean {
   
				@Getter @Setter private Ip00164TableData ip00164TableData = new Ip00164TableData();
	
	/**
	* Constructor for Ip00164TableEntry
	**/
    public Ip00164TableEntry() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp00164TableData().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip00164TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp00164TableData().initialize();
     
   }


}
  
