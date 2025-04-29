package com.cloudframe.app.global.sharedvar;

/**
*  The class ASGrp15 is used to handle fields declared in it
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

            @Component("global_aSGrp15")

@Data
public class ASGrp15 extends ASGrp15Serialized  implements InitializingBean {
   

						@Getter @Setter private char[] fillerWs028 = Field.fillLowValue(3);
				@Getter @Setter private AS15 aS15 = new AS15();
	
	/**
	* Constructor for ASGrp15
	**/
    public ASGrp15() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getAS15().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


	/**
	 * 	initializes ASGrp15
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs028(CONSTANTS.SPACE_3);
          getAS15().initialize();
     
   }


}
  
