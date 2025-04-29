package com.cloudframe.app.global.sharedvar;

/**
*  The class AS11 is used to handle fields declared in it
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

            @Component("global_aS11")

@Data
public class AS11 extends AS11Serialized  implements InitializingBean {
   

						@Getter @Setter private char[] aSFld111 = Field.fillLowValue(30);

						@Getter @Setter private char[] aSFld211 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS11
	**/
    public AS11() {
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
	 * 	initializes AS11
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld111(CONSTANTS.SPACE_30);
         setASFld211(CONSTANTS.SPACE_40);
   }


}
  
