package com.cloudframe.app.bm8090m.dto;

/**
*  The class WZonFpfPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class WZonFpfPe8090m extends WZonFpfPe8090mSerialized { 
   

								@Getter @Setter private int wNupFpfPe8090m;

								@Getter @Setter private int wTipFpfPe8090m;

						@Getter @Setter private char[] wMasFpfPe8090m = Field.fillLowValue(18);

								@Getter @Setter private int wTmaFpfPe8090m;

								@Getter @Setter private int wNcmFpfPe8090m;
	
	/**
	* Constructor for WZonFpfPe8090m
	**/
    public WZonFpfPe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WZonFpfPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WZonFpfPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WZonFpfPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWNupFpfPe8090m(0);
                     setWTipFpfPe8090m(0);
         setWMasFpfPe8090m(CONSTANTS.SPACE_18);
                     setWTmaFpfPe8090m(0);
                     setWNcmFpfPe8090m(0);
   }


}
  
