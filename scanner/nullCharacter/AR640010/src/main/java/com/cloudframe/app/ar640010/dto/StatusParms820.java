package com.cloudframe.app.ar640010.dto;

/**
*  The class StatusParms820 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class StatusParms820 extends StatusParms820Serialized {
   

						@Getter @Setter private char[] setupValue820 = new char[1];

						@Getter @Setter private char[] oldStatCdInd820 = new char[1];

						@Getter @Setter private char[] newStatCdInd820 = new char[1];

						@Getter @Setter private char[] stsMessage820 = new char[80];
	
	/**
	* Constructor for StatusParms820
	**/
    public StatusParms820() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSetupValue820(fillSpace(1));
								setOldStatCdInd820(fillSpace(1));
								setNewStatCdInd820(fillSpace(1));
								setStsMessage820(pad(80," ".toCharArray(),' ',RIGHT_PAD));
    }



	/**
	 * 	initializes StatusParms820
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setSetupValue820(CONSTANTS.SPACE);
         setOldStatCdInd820(CONSTANTS.SPACE);
         setNewStatCdInd820(CONSTANTS.SPACE);
         setStsMessage820(CONSTANTS.SPACE_80);
   }


}
  
