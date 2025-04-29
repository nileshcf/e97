package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fDateTo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Rlu5fDateTo extends Rlu5fDateToSerialized { 
   

								@Getter @Setter private int rlu5fDateToMm;

								@Getter @Setter private int rlu5fDateToDd;

								@Getter @Setter private int rlu5fDateToCc;

								@Getter @Setter private int rlu5fDateToYy;
	
	/**
	* Constructor for Rlu5fDateTo
	**/
    public Rlu5fDateTo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rlu5fDateTo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fDateTo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Rlu5fDateTo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setRlu5fDateToMm(0);
                     setRlu5fDateToDd(0);
                     setRlu5fDateToCc(0);
                     setRlu5fDateToYy(0);
   }


}
  
