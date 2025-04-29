package com.cloudframe.app.mdsnum.dto;

/**
*  The class MiscAreas is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class MiscAreas extends MiscAreasSerialized {
   

						@Getter @Setter private char[] amtd = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd0 = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd1 = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd2 = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd3 = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd4 = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd5 = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd6 = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd7 = Field.fillLowValue(18);
	
	/**
	* Constructor for MiscAreas
	**/
    public MiscAreas() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes MiscAreas
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setAmtd(CONSTANTS.SPACE_18);
   }


}
  
