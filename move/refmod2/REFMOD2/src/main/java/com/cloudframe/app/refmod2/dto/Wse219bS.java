package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse219bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse219bS extends Wse219bSSerialized {
   

						@Getter @Setter private char[] wse219bSFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse219bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse219bS
	**/
    public Wse219bS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes Wse219bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse219bSFld1(CONSTANTS.SPACE_30);
         setWse219bSFld2(CONSTANTS.SPACE_30);
   }


}
  
