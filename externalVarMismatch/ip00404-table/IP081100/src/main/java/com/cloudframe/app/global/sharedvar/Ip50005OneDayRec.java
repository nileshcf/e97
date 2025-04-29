package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005OneDayRec is used to handle fields declared in it
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

            @Component("global_ip50005OneDayRec")

@Data
public class Ip50005OneDayRec extends Ip50005OneDayRecSerialized  implements InitializingBean {
   
				@Getter @Setter private Ip50005TableKeyAll ip50005TableKeyAll = new Ip50005TableKeyAll();

						@Getter @Setter private char[] ip50005TableData = Field.fillLowValue(32730);
	
	/**
	* Constructor for Ip50005OneDayRec
	**/
    public Ip50005OneDayRec() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp50005TableKeyAll().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip50005OneDayRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp50005TableKeyAll().initialize();
     
         setIp50005TableData(CONSTANTS.SPACE_32730);
   }


}
  
