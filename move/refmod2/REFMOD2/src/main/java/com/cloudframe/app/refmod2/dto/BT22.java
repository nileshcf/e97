package com.cloudframe.app.refmod2.dto;

/**
*  The class BT22 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT22 extends BT22Serialized {
   

						@Getter @Setter private char[] bTFld122 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld222 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld322 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT22
	**/
    public BT22() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes BT22
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld122(CONSTANTS.SPACE_20);
         setBTFld222(CONSTANTS.SPACE_40);
         setBTFld322(CONSTANTS.SPACE_30);
   }


}
  
