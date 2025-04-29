package com.cloudframe.app.refmod2.dto;

/**
*  The class BT25 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT25 extends BT25Serialized {
   

						@Getter @Setter private char[] bTFld125 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld225 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld325 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT25
	**/
    public BT25() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes BT25
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld125(CONSTANTS.SPACE_20);
         setBTFld225(CONSTANTS.SPACE_40);
         setBTFld325(CONSTANTS.SPACE_30);
   }


}
  
