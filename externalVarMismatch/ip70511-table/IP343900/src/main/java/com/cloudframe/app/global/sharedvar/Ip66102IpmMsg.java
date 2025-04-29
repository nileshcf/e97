package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66102IpmMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip66102IpmMsg")

@Data
public class Ip66102IpmMsg extends Ip66102IpmMsgSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip66102NormalIpmMsg ip66102NormalIpmMsg = new Ip66102NormalIpmMsg();
				@Getter @Setter private Ip66102NormalIpmMsgRedefined ip66102NormalIpmMsgRedefined = new Ip66102NormalIpmMsgRedefined();
	
	/**
	* Constructor for Ip66102IpmMsg
	**/
    public Ip66102IpmMsg() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp66102NormalIpmMsg().setParent(this,getStartOffset() + 0);
					getIp66102NormalIpmMsgRedefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip66102IpmMsg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp66102NormalIpmMsg().initialize();
     
   }


}
  
