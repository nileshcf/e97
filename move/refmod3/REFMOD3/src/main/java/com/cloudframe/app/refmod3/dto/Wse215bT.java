package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse215bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse215bT extends Wse215bTSerialized {
   

						@Getter @Setter private char[] wse215bTFld1 = Field.fillLowValue(10);

						@Getter @Setter private char[] wse215bTFld2 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse215bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse215bT
	**/
    public Wse215bT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes Wse215bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse215bTFld1(CONSTANTS.SPACE_10);
         setWse215bTFld2(CONSTANTS.SPACE_20);
         setWse215bTFld3(CONSTANTS.SPACE_30);
   }


}
  
