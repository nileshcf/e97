package com.cloudframe.app.mcissues.dto;

/**
*  The class AbBusslBussiValues800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AbBusslBussiValues800 extends AbBusslBussiValues800Serialized {
   

						@Getter @Setter private char[] ab800 = new char[3];

								@Getter @Setter private int bussl800;

								@Getter @Setter private int bussi800;
	
	/**
	* Constructor for AbBusslBussiValues800
	**/
    public AbBusslBussiValues800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAb800(fillSpace(3));
								setBussl800(0);
								setBussi800(0);
    }



	/**
	 * 	initializes AbBusslBussiValues800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setAb800(CONSTANTS.SPACE_3);
                     setBussl800(0);
                     setBussi800(0);
   }


}
  
