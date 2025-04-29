package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse24bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse24bT extends Wse24bTSerialized {
   

						@Getter @Setter private char[] wse24bTFld1 = Field.fillLowValue(10);

						@Getter @Setter private char[] wse24bTFld2 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse24bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse24bT
	**/
    public Wse24bT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes Wse24bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse24bTFld1(CONSTANTS.SPACE_10);
         setWse24bTFld2(CONSTANTS.SPACE_20);
         setWse24bTFld3(CONSTANTS.SPACE_30);
   }


}
  
