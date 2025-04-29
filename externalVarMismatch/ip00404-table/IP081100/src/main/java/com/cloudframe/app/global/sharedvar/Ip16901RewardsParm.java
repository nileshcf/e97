package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip16901RewardsParm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip16901RewardsParm")

@Data
public class Ip16901RewardsParm extends Ip16901RewardsParmSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip16901RewardParms ip16901RewardParms = new Ip16901RewardParms();
	
	/**
	* Constructor for Ip16901RewardsParm
	**/
    public Ip16901RewardsParm() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp16901RewardParms().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip16901RewardsParm
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp16901RewardParms().initialize();
     
   }


}
  
