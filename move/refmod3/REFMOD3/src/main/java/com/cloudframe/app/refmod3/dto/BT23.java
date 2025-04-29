package com.cloudframe.app.refmod3.dto;

/**
*  The class BT23 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT23 extends BT23Serialized {
   

						@Getter @Setter private char[] bTFld123 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld223 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld323 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT23
	**/
    public BT23() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes BT23
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld123(CONSTANTS.SPACE_20);
         setBTFld223(CONSTANTS.SPACE_40);
         setBTFld323(CONSTANTS.SPACE_30);
   }


}
  
