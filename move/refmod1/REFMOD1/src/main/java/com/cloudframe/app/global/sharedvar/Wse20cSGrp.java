package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse20cSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse20cSGrp")

@Data
public class Wse20cSGrp extends Wse20cSGrpSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] wseFiller040 = Field.fillLowValue(5);
				@Getter @Setter private Wse20cS wse20cS = new Wse20cS();
	
	/**
	* Constructor for Wse20cSGrp
	**/
    public Wse20cSGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getWse20cS().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Wse20cSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller040(CONSTANTS.SPACE_5);
          getWse20cS().initialize();
     
   }


}
  
