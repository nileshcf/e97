package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse24aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse24aT extends Wse24aTSerialized {
   

						@Getter @Setter private char[] wse24aTFld1 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse24aTFld2 = Field.fillLowValue(40);
	
	/**
	* Constructor for Wse24aT
	**/
    public Wse24aT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes Wse24aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse24aTFld1(CONSTANTS.SPACE_20);
         setWse24aTFld2(CONSTANTS.SPACE_40);
   }


}
  
