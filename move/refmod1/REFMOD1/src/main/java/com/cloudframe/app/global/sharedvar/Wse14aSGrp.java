package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse14aSGrp is used to handle fields declared in it
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

            @Component("global_wse14aSGrp")

@Data
public class Wse14aSGrp extends Wse14aSGrpSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] wseFiller024 = Field.fillLowValue(3);

						@Getter @Setter private char[] wse14aS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse14aSGrp
	**/
    public Wse14aSGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


	/**
	 * 	initializes Wse14aSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller024(CONSTANTS.SPACE_3);
         setWse14aS(CONSTANTS.SPACE_60);
   }


}
  
