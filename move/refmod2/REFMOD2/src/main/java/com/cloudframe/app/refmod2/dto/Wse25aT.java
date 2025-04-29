package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse25aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse25aT extends Wse25aTSerialized {
   

						@Getter @Setter private char[] wse25aTFld1 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse25aTFld2 = Field.fillLowValue(40);
	
	/**
	* Constructor for Wse25aT
	**/
    public Wse25aT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes Wse25aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse25aTFld1(CONSTANTS.SPACE_20);
         setWse25aTFld2(CONSTANTS.SPACE_40);
   }


}
  
