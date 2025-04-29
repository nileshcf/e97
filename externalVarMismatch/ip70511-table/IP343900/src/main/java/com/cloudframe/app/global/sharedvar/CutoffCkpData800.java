package com.cloudframe.app.global.sharedvar;

/**
*  The class CutoffCkpData800 is used to handle fields declared in it
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

            @Component("global_cutoffCkpData800")

@Data
public class CutoffCkpData800 extends CutoffCkpData800Serialized  implements InitializingBean {
   

						@Getter @Setter private char[] cutoffPmtCkp800 = Field.fillLowValue(26);

						@Getter @Setter private char[] cutoffPmaCkp800 = Field.fillLowValue(26);

						@Getter @Setter private char[] cutoffPalCkp800 = Field.fillLowValue(26);

						@Getter @Setter private char[] cutoffTmtCkp800 = Field.fillLowValue(26);

						@Getter @Setter private char[] cutoffPmiCkp800 = Field.fillLowValue(26);

						@Getter @Setter private char[] cutoffPmapCkp800 = Field.fillLowValue(26);

						@Getter @Setter private char[] cutoffPimCkp800 = Field.fillLowValue(26);
	
	/**
	* Constructor for CutoffCkpData800
	**/
    public CutoffCkpData800() {
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
	 * 	initializes CutoffCkpData800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCutoffPmtCkp800(CONSTANTS.SPACE_26);
         setCutoffPmaCkp800(CONSTANTS.SPACE_26);
         setCutoffPalCkp800(CONSTANTS.SPACE_26);
         setCutoffTmtCkp800(CONSTANTS.SPACE_26);
         setCutoffPmiCkp800(CONSTANTS.SPACE_26);
         setCutoffPmapCkp800(CONSTANTS.SPACE_26);
         setCutoffPimCkp800(CONSTANTS.SPACE_26);
   }


}
  
