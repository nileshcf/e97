package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pm2Table is used to handle fields declared in it
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

            @Component("global_ip7051pm2Table")

@Data
public class Ip7051pm2Table extends Ip7051pm2TableSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip7051pm2TableKey ip7051pm2TableKey = new Ip7051pm2TableKey();

						@Getter @Setter private char[] ip7051pm2MqBypassSw = Field.fillLowValue(1);
				@Getter @Setter private Ip7051pm2RequestDetails ip7051pm2RequestDetails = new Ip7051pm2RequestDetails();
				@Getter @Setter private Ip7051pm2ResponseDetails ip7051pm2ResponseDetails = new Ip7051pm2ResponseDetails();
	
	/**
	* Constructor for Ip7051pm2Table
	**/
    public Ip7051pm2Table() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp7051pm2TableKey().setParent(this,getStartOffset() + 0);
					getIp7051pm2RequestDetails().setParent(this,getStartOffset() + 33);
					getIp7051pm2ResponseDetails().setParent(this,getStartOffset() + 129);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip7051pm2Table
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp7051pm2TableKey().initialize();
     
         setIp7051pm2MqBypassSw(CONSTANTS.SPACE);
          getIp7051pm2RequestDetails().initialize();
     
          getIp7051pm2ResponseDetails().initialize();
     
   }


}
  
