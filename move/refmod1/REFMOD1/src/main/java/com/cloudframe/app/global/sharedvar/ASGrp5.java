package com.cloudframe.app.global.sharedvar;

/**
*  The class ASGrp5 is used to handle fields declared in it
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

            @Component("global_aSGrp5")

@Data
public class ASGrp5 extends ASGrp5Serialized  implements InitializingBean {
   

						@Getter @Setter private char[] fillerWs = Field.fillLowValue(3);
				@Getter @Setter private AS5 aS5 = new AS5();
	
	/**
	* Constructor for ASGrp5
	**/
    public ASGrp5() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getAS5().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


	/**
	 * 	initializes ASGrp5
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs(CONSTANTS.SPACE_3);
          getAS5().initialize();
     
   }


}
  
