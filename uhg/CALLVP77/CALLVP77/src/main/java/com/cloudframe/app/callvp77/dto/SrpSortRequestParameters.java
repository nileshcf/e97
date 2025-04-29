package com.cloudframe.app.callvp77.dto;

/**
*  The class SrpSortRequestParameters is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class SrpSortRequestParameters extends SrpSortRequestParametersSerialized {
   

						@Getter @Setter private char[] srpReturnCode = Field.fillLowValue(2);

								@Getter @Setter private int srpEntryCount;

								@Getter @Setter private int srpEntryLength;

								@Getter @Setter private int srpKeyStart;

								@Getter @Setter private int srpKeyLength;

						@Getter @Setter private char[] srpSequence = Field.fillLowValue(1);
	
	/**
	* Constructor for SrpSortRequestParameters
	**/
    public SrpSortRequestParameters() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes SrpSortRequestParameters
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setSrpReturnCode(CONSTANTS.SPACE_2);
                     setSrpEntryCount(0);
                     setSrpEntryLength(0);
                     setSrpKeyStart(0);
                     setSrpKeyLength(0);
         setSrpSequence(CONSTANTS.SPACE);
   }


}
  
