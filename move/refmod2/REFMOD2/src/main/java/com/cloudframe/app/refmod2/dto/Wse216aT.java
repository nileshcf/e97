package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse216aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse216aT extends Wse216aTSerialized {
   

						@Getter @Setter private char[] wse216aTFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse216aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse216aT
	**/
    public Wse216aT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes Wse216aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse216aTFld1(CONSTANTS.SPACE_30);
         setWse216aTFld2(CONSTANTS.SPACE_30);
   }


}
  
