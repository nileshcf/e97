package com.cloudframe.app.bm8090m.dto;

/**
*  The class WDatVarPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class WDatVarPe8090m extends WDatVarPe8090mSerialized { 
   

								@Getter @Setter private int wCntPerPe8090m;

								@Getter @Setter private int wCntFisPe8090m;

								@Getter @Setter private int wCntOblPe8090m;

								@Getter @Setter private int wCntRelPe8090m;

								@Getter @Setter private int wOcuTitPe8090m;

								@Getter @Setter private int wOblTitPe8090m;

								@Getter @Setter private int wCntGioPe8090m;

								@Getter @Setter private int wIndGioPe8090m;

								@Getter @Setter private int wMaxTitPe8090m;

								@Getter @Setter private int wPoiNtePe8090m;

								@Getter @Setter private int wPoiGuaPe8090m;

						@Getter @Setter private char[] wIdiApe = Field.fillLowValue(2);
	
	/**
	* Constructor for WDatVarPe8090m
	**/
    public WDatVarPe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WDatVarPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WDatVarPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WDatVarPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWCntPerPe8090m(0);
                     setWCntFisPe8090m(0);
                     setWCntOblPe8090m(0);
                     setWCntRelPe8090m(0);
                     setWOcuTitPe8090m(0);
                     setWOblTitPe8090m(0);
                     setWCntGioPe8090m(0);
                     setWIndGioPe8090m(0);
                     setWMaxTitPe8090m(0);
                     setWPoiNtePe8090m(0);
                     setWPoiGuaPe8090m(0);
         setWIdiApe(CONSTANTS.SPACE_2);
   }


}
  
