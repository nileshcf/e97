package com.cloudframe.app.refmod2.dto;

/**
*  The class AT22 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT22 extends AT22Serialized {
   

						@Getter @Setter private char[] aTFld122 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld222 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT22
	**/
    public AT22() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes AT22
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld122(CONSTANTS.SPACE_20);
         setATFld222(CONSTANTS.SPACE_40);
   }


}
  
