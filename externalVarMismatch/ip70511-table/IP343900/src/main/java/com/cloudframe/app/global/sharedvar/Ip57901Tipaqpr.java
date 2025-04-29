package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip57901Tipaqpr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip57901Tipaqpr")

@Data
public class Ip57901Tipaqpr extends Ip57901TipaqprSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip57901TipaqprEntries ip57901TipaqprEntries = new Ip57901TipaqprEntries();
	
	/**
	* Constructor for Ip57901Tipaqpr
	**/
    public Ip57901Tipaqpr() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp57901TipaqprEntries().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip57901Tipaqpr
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp57901TipaqprEntries().initialize();
     
   }


}
  
