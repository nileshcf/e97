package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse9aSGrp is used to handle fields declared in it
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

            @Component("global_wse9aSGrp")

@Data
public class Wse9aSGrp extends Wse9aSGrpSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] wseFiller08 = Field.fillLowValue(3);
				@Getter @Setter private Wse9aS wse9aS = new Wse9aS();
	
	/**
	* Constructor for Wse9aSGrp
	**/
    public Wse9aSGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getWse9aS().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Wse9aSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller08(CONSTANTS.SPACE_3);
          getWse9aS().initialize();
     
   }


}
  
