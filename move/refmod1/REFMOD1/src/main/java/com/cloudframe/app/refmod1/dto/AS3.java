package com.cloudframe.app.refmod1.dto;

/**
*  The class AS3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AS3 extends AS3Serialized {
   

						@Getter @Setter private char[] aSFld13 = Field.fillLowValue(30);

						@Getter @Setter private char[] aSFld23 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS3
	**/
    public AS3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes AS3
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld13(CONSTANTS.SPACE_30);
         setASFld23(CONSTANTS.SPACE_40);
   }


}
  
