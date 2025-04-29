package com.cloudframe.app.bm8090m.dto;

/**
*  The class WEloPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class WEloPe8090m extends WEloPe8090mSerialized { 
   

								@Getter @Setter private int wTioPe8090m;

								@Getter @Setter private int wIeoPe8090m;

						@Getter @Setter private char[] wNobPe8090m = Field.fillLowValue(6);

								@Getter @Setter private int wNcoPe8090m;

								@Getter @Setter private int wInrPe8090m;

								@Getter @Setter private int wIsoPe8090m;
	
	/**
	* Constructor for WEloPe8090m
	**/
    public WEloPe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WEloPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WEloPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WEloPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWTioPe8090m(0);
                     setWIeoPe8090m(0);
         setWNobPe8090m(CONSTANTS.SPACE_6);
                     setWNcoPe8090m(0);
                     setWInrPe8090m(0);
                     setWIsoPe8090m(0);
   }


}
  
