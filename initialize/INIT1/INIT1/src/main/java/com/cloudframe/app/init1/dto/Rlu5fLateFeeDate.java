package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fLateFeeDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Rlu5fLateFeeDate extends Rlu5fLateFeeDateSerialized { 
   

								@Getter @Setter private int rlu5fLateFeeDateMm;

								@Getter @Setter private int rlu5fLateFeeDateDd;

								@Getter @Setter private int rlu5fLateFeeDateCc;

								@Getter @Setter private int rlu5fLateFeeDateYy;
	
	/**
	* Constructor for Rlu5fLateFeeDate
	**/
    public Rlu5fLateFeeDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rlu5fLateFeeDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fLateFeeDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Rlu5fLateFeeDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setRlu5fLateFeeDateMm(0);
                     setRlu5fLateFeeDateDd(0);
                     setRlu5fLateFeeDateCc(0);
                     setRlu5fLateFeeDateYy(0);
   }


}
  
