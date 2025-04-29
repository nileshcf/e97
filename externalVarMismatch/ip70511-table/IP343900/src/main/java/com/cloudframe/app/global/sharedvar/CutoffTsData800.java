package com.cloudframe.app.global.sharedvar;

/**
*  The class CutoffTsData800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_cutoffTsData800")

@Data
public class CutoffTsData800 extends CutoffTsData800Serialized  implements InitializingBean {
   

						@Getter @Setter private char[] cutoffPmtBegin800 = Field.fillLowValue(26);

						@Getter @Setter private char[] cutoffPmaBegin800 = Field.fillLowValue(26);

						@Getter @Setter private char[] cutoffPalBegin800 = Field.fillLowValue(26);

						@Getter @Setter private char[] cutoffTmtBegin800 = Field.fillLowValue(26);

						@Getter @Setter private char[] cutoffPmiBegin800 = Field.fillLowValue(26);

						@Getter @Setter private char[] cutoffPmapBegin800 = Field.fillLowValue(26);

						@Getter @Setter private char[] cutoffPimBegin800 = Field.fillLowValue(26);
	
	/**
	* Constructor for CutoffTsData800
	**/
    public CutoffTsData800() {
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
	 * 	initializes CutoffTsData800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCutoffPmtBegin800(CONSTANTS.SPACE_26);
         setCutoffPmaBegin800(CONSTANTS.SPACE_26);
         setCutoffPalBegin800(CONSTANTS.SPACE_26);
         setCutoffTmtBegin800(CONSTANTS.SPACE_26);
         setCutoffPmiBegin800(CONSTANTS.SPACE_26);
         setCutoffPmapBegin800(CONSTANTS.SPACE_26);
         setCutoffPimBegin800(CONSTANTS.SPACE_26);
   }


}
  
