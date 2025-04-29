package com.cloudframe.app.refmod2.dto;

/**
*  The class BT26 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BT26 extends BT26Serialized {
   

						@Getter @Setter private char[] bTFld126 = Field.fillLowValue(20);

						@Getter @Setter private char[] bTFld226 = Field.fillLowValue(40);

						@Getter @Setter private char[] bTFld326 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT26
	**/
    public BT26() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes BT26
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld126(CONSTANTS.SPACE_20);
         setBTFld226(CONSTANTS.SPACE_40);
         setBTFld326(CONSTANTS.SPACE_30);
   }


}
  
