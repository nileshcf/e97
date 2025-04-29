package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70511Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip70511Table")

@Data
public class Ip70511Table extends Ip70511TableSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip70511TableKey ip70511TableKey = new Ip70511TableKey();

						@Getter @Setter private char[] ip70511MqBypassSw = Field.fillLowValue(1);
				@Getter @Setter private Ip70511RequestDetails ip70511RequestDetails = new Ip70511RequestDetails();
				@Getter @Setter private Ip70511ResponseDetails ip70511ResponseDetails = new Ip70511ResponseDetails();
	
	/**
	* Constructor for Ip70511Table
	**/
    public Ip70511Table() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp70511TableKey().setParent(this,getStartOffset() + 0);
					getIp70511RequestDetails().setParent(this,getStartOffset() + 33);
					getIp70511ResponseDetails().setParent(this,getStartOffset() + 129);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip70511Table
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp70511TableKey().initialize();
     
         setIp70511MqBypassSw(CONSTANTS.SPACE);
          getIp70511RequestDetails().initialize();
     
          getIp70511ResponseDetails().initialize();
     
   }


}
  
