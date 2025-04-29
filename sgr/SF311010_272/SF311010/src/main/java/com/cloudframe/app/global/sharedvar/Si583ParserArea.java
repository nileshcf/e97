package com.cloudframe.app.global.sharedvar;

/**
*  The class Si583ParserArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_si583ParserArea")

@Data
public class Si583ParserArea extends Si583ParserAreaSerialized  implements InitializingBean {
   

								@Getter @Setter private int si583DataAddr;

								@Getter @Setter private int si583DataPtr;

								@Getter @Setter private int si583FormatAddr;

								@Getter @Setter private int si583FormatPtr;

								@Getter @Setter private short si583ReturnCode;

								@Getter @Setter private short si583DataElementInError;

						@Getter @Setter private char[] si583ReturnMessage = Field.fillLowValue(80);

						@Getter @Setter private char[] si583Mti1 = Field.fillLowValue(4);

						@Getter @Setter private char[] si583Mti2 = Field.fillLowValue(4);

								@Getter @Setter private int si583DataLength;

								@Getter @Setter private int si583FormatLength;

						@Getter @Setter private char[] si583ExtendData = Field.fillLowValue(32768);
				@Getter @Setter private Si583DataElementWorkArea1 si583DataElementWorkArea1 = new Si583DataElementWorkArea1();
				@Getter @Setter private Si583DataElementWorkArea2 si583DataElementWorkArea2 = new Si583DataElementWorkArea2();
	
	/**
	* Constructor for Si583ParserArea
	**/
    public Si583ParserArea() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getSi583DataElementWorkArea1().setParent(this,getStartOffset() + 32876);
					getSi583DataElementWorkArea2().setParent(this,getStartOffset() + 33516);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Si583ParserArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setSi583DataAddr(0);
                     setSi583FormatAddr(0);
         	setSi583ReturnCode((short)0);
         	setSi583DataElementInError((short)0);
         setSi583ReturnMessage(CONSTANTS.SPACE_80);
         setSi583Mti1(CONSTANTS.SPACE_4);
         setSi583Mti2(CONSTANTS.SPACE_4);
                     setSi583DataLength(0);
                     setSi583FormatLength(0);
         setSi583ExtendData(CONSTANTS.SPACE_32768);
          getSi583DataElementWorkArea1().initialize();
     
          getSi583DataElementWorkArea2().initialize();
     
   }


}
  
