package com.cloudframe.app.init1.dto;

/**
*  The class TV20Tbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class TV20Tbl extends TV20TblSerialized { 
   

								@Getter @Setter private int tV20OffrTypId;

						@Getter @Setter private char[] tV20OffrTypCd = Field.fillLowValue(2);
	
	/**
	* Constructor for TV20Tbl
	**/
    public TV20Tbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TV20Tbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TV20Tbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes TV20Tbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setTV20OffrTypId(0);
         setTV20OffrTypCd(CONSTANTS.SPACE_2);
   }


}
  
