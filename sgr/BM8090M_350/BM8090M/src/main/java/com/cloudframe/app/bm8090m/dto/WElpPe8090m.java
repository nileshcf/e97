package com.cloudframe.app.bm8090m.dto;

/**
*  The class WElpPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class WElpPe8090m extends WElpPe8090mSerialized { 
   

								@Getter @Setter private int wTipPe8090m;

								@Getter @Setter private int wIeqPe8090m;

						@Getter @Setter private char[] wNomPe8090m = Field.fillLowValue(62);

								@Getter @Setter private int wNcaNomPe8090m;

						@Getter @Setter private char[] wNo1Pe8090m = Field.fillLowValue(40);

								@Getter @Setter private int wNcaNo1Pe8090m;

						@Getter @Setter private char[] wNo2Pe8090m = Field.fillLowValue(24);

								@Getter @Setter private int wNcaNo2Pe8090m;

								@Getter @Setter private int wNsePerPe8090m;

								@Getter @Setter private int wIsePe8090m;

						@Getter @Setter private char[] wMasSepPe8090m = Field.fillLowValue(18);

								@Getter @Setter private int wTmaSepPe8090m;

								@Getter @Setter private int wNmaSepPe8090m;

								@Getter @Setter private int wPerGruPe8090m;

								@Getter @Setter private int wTpeNrePe8090m;

						@Getter @Setter private char[] wNomNrePe8090m = Field.fillLowValue(20);

						@Getter @Setter private char[] wPraNrePe8090m = Field.fillLowValue(20);

						@Getter @Setter private char[] wSeaNrePe8090m = Field.fillLowValue(20);

								@Getter @Setter private int wCpeNomPe8090m;
	
	/**
	* Constructor for WElpPe8090m
	**/
    public WElpPe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WElpPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WElpPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WElpPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWTipPe8090m(0);
                     setWIeqPe8090m(0);
         setWNomPe8090m(CONSTANTS.SPACE_62);
                     setWNcaNomPe8090m(0);
         setWNo1Pe8090m(CONSTANTS.SPACE_40);
                     setWNcaNo1Pe8090m(0);
         setWNo2Pe8090m(CONSTANTS.SPACE_24);
                     setWNcaNo2Pe8090m(0);
                     setWNsePerPe8090m(0);
                     setWIsePe8090m(0);
         setWMasSepPe8090m(CONSTANTS.SPACE_18);
                     setWTmaSepPe8090m(0);
                     setWNmaSepPe8090m(0);
                     setWPerGruPe8090m(0);
                     setWTpeNrePe8090m(0);
         setWNomNrePe8090m(CONSTANTS.SPACE_20);
         setWPraNrePe8090m(CONSTANTS.SPACE_20);
         setWSeaNrePe8090m(CONSTANTS.SPACE_20);
                     setWCpeNomPe8090m(0);
   }


}
  
