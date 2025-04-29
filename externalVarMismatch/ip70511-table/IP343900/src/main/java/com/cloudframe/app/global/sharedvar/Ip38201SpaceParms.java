package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip38201SpaceParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip38201SpaceParms extends Ip38201SpaceParmsSerialized { 
   

						@Getter @Setter private char[] ip38201TrackCylinderInd = Field.fillLowValue(1);

								@Getter @Setter private long ip38201PrimarySpace;

								@Getter @Setter private long ip38201SecondarySpace;

						@Getter @Setter private char[] ip38201ReleaseIndicator = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip38201SpaceParms
	**/
    public Ip38201SpaceParms() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip38201SpaceParms. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip38201SpaceParms(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip38201SpaceParms
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp38201TrackCylinderInd(CONSTANTS.SPACE);
                     setIp38201PrimarySpace(0);
                     setIp38201SecondarySpace(0);
         setIp38201ReleaseIndicator(CONSTANTS.SPACE);
   }


}
  
