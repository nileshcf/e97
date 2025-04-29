package com.cloudframe.app.refmod2.dto;

/**
*  The class AT216 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AT216 extends AT216Serialized {
   

						@Getter @Setter private char[] aTFld1216 = Field.fillLowValue(20);

						@Getter @Setter private char[] aTFld2216 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT216
	**/
    public AT216() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes AT216
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1216(CONSTANTS.SPACE_20);
         setATFld2216(CONSTANTS.SPACE_40);
   }


}
  
