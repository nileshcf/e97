package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051f4Table is used to handle fields declared in it
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

            @Component("global_ip7051f4Table")

@Data
public class Ip7051f4Table extends Ip7051f4TableSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip7051f4TableKey ip7051f4TableKey = new Ip7051f4TableKey();

						@Getter @Setter private char[] ip7051f4MqBypassSw = Field.fillLowValue(1);
				@Getter @Setter private Ip7051f4RequestDetails ip7051f4RequestDetails = new Ip7051f4RequestDetails();
				@Getter @Setter private Ip7051f4ResponseDetails ip7051f4ResponseDetails = new Ip7051f4ResponseDetails();
	
	/**
	* Constructor for Ip7051f4Table
	**/
    public Ip7051f4Table() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp7051f4TableKey().setParent(this,getStartOffset() + 0);
					getIp7051f4RequestDetails().setParent(this,getStartOffset() + 33);
					getIp7051f4ResponseDetails().setParent(this,getStartOffset() + 129);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip7051f4Table
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp7051f4TableKey().initialize();
     
         setIp7051f4MqBypassSw(CONSTANTS.SPACE);
          getIp7051f4RequestDetails().initialize();
     
          getIp7051f4ResponseDetails().initialize();
     
   }


}
  
