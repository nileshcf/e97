package com.cloudframe.app.refmod2.dto;

/**
*  The class AT24 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT24 extends AT24Serialized {
   

						@Getter @Setter private char[] aTFld124 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld224 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT24
	**/
    public AT24() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes AT24
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld124(CONSTANTS.SPACE_20);
         setATFld224(CONSTANTS.SPACE_40);
   }


}
  
