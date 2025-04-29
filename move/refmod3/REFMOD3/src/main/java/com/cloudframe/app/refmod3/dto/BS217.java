package com.cloudframe.app.refmod3.dto;

/**
*  The class BS217 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BS217 extends BS217Serialized {
   

						@Getter @Setter private char[] bSFld1217 = Field.fillLowValue(30);

						@Getter @Setter private char[] bSFld2217 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS217
	**/
    public BS217() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes BS217
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld1217(CONSTANTS.SPACE_30);
         setBSFld2217(CONSTANTS.SPACE_40);
   }


}
  
