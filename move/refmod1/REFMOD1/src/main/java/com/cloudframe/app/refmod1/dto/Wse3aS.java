package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse3aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse3aS extends Wse3aSSerialized {
   

						@Getter @Setter private char[] wse3aSFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse3aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse3aS
	**/
    public Wse3aS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes Wse3aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse3aSFld1(CONSTANTS.SPACE_30);
         setWse3aSFld2(CONSTANTS.SPACE_30);
   }


}
  
