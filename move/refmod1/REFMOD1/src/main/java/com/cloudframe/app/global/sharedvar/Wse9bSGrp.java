package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse9bSGrp is used to handle fields declared in it
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

            @Component("global_wse9bSGrp")

@Data
public class Wse9bSGrp extends Wse9bSGrpSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] wseFiller010 = Field.fillLowValue(3);
				@Getter @Setter private Wse9bS wse9bS = new Wse9bS();
	
	/**
	* Constructor for Wse9bSGrp
	**/
    public Wse9bSGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getWse9bS().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Wse9bSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller010(CONSTANTS.SPACE_3);
          getWse9bS().initialize();
     
   }


}
  
