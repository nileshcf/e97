package com.cloudframe.app.global.sharedvar;

/**
*  The class ASGrp13 is used to handle fields declared in it
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

            @Component("global_aSGrp13")

@Data
public class ASGrp13 extends ASGrp13Serialized  implements InitializingBean {
   

						@Getter @Setter private char[] fillerWs020 = Field.fillLowValue(3);
				@Getter @Setter private AS13 aS13 = new AS13();
	
	/**
	* Constructor for ASGrp13
	**/
    public ASGrp13() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getAS13().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


	/**
	 * 	initializes ASGrp13
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs020(CONSTANTS.SPACE_3);
          getAS13().initialize();
     
   }


}
  
