package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse26aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse26aT extends Wse26aTSerialized {
   

						@Getter @Setter private char[] wse26aTFld1 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse26aTFld2 = Field.fillLowValue(40);
	
	/**
	* Constructor for Wse26aT
	**/
    public Wse26aT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes Wse26aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse26aTFld1(CONSTANTS.SPACE_20);
         setWse26aTFld2(CONSTANTS.SPACE_40);
   }


}
  
