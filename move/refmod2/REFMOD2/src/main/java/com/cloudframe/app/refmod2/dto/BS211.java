package com.cloudframe.app.refmod2.dto;

/**
*  The class BS211 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BS211 extends BS211Serialized {
   

						@Getter @Setter private char[] bSFld1211 = Field.fillLowValue(30);

						@Getter @Setter private char[] bSFld2211 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS211
	**/
    public BS211() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes BS211
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld1211(CONSTANTS.SPACE_30);
         setBSFld2211(CONSTANTS.SPACE_40);
   }


}
  
