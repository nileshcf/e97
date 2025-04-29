package com.cloudframe.app.bm8090m.dto;

/**
*  The class WZonAlmPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class WZonAlmPe8090m extends WZonAlmPe8090mSerialized { 
   

								@Getter @Setter private int wTipAlmPe8090m;

								@Getter @Setter private int wIeqAlmPe8090m;

						@Getter @Setter private char[] wNomAlmPe8090m = Field.fillLowValue(60);

								@Getter @Setter private int wNcnAlmPe8090m;

						@Getter @Setter private char[] wNo1AlmPe8090m = Field.fillLowValue(40);

								@Getter @Setter private int wNc1AlmPe8090m;

						@Getter @Setter private char[] wNo2AlmPe8090m = Field.fillLowValue(24);

								@Getter @Setter private int wNc2AlmPe8090m;

						@Getter @Setter private char[] wNreAlmPe8090m = Field.fillLowValue(20);

						@Getter @Setter private char[] wPraAlmPe8090m = Field.fillLowValue(20);

						@Getter @Setter private char[] wSeaAlmPe8090m = Field.fillLowValue(20);

								@Getter @Setter private int wCpeAlmPe8090m;
	
	/**
	* Constructor for WZonAlmPe8090m
	**/
    public WZonAlmPe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WZonAlmPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WZonAlmPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WZonAlmPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWTipAlmPe8090m(0);
                     setWIeqAlmPe8090m(0);
         setWNomAlmPe8090m(CONSTANTS.SPACE_60);
                     setWNcnAlmPe8090m(0);
         setWNo1AlmPe8090m(CONSTANTS.SPACE_40);
                     setWNc1AlmPe8090m(0);
         setWNo2AlmPe8090m(CONSTANTS.SPACE_24);
                     setWNc2AlmPe8090m(0);
         setWNreAlmPe8090m(CONSTANTS.SPACE_20);
         setWPraAlmPe8090m(CONSTANTS.SPACE_20);
         setWSeaAlmPe8090m(CONSTANTS.SPACE_20);
                     setWCpeAlmPe8090m(0);
   }


}
  
