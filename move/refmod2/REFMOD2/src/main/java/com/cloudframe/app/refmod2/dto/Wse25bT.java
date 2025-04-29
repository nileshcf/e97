package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse25bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse25bT extends Wse25bTSerialized {
   

						@Getter @Setter private char[] wse25bTFld1 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse25bTFld2 = Field.fillLowValue(40);

						@Getter @Setter private char[] wse25bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse25bT
	**/
    public Wse25bT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes Wse25bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse25bTFld1(CONSTANTS.SPACE_20);
         setWse25bTFld2(CONSTANTS.SPACE_40);
         setWse25bTFld3(CONSTANTS.SPACE_30);
   }


}
  
