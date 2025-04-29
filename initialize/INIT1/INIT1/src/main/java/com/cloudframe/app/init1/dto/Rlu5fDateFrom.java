package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fDateFrom is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Rlu5fDateFrom extends Rlu5fDateFromSerialized { 
   

								@Getter @Setter private int rlu5fDateFromMm;

								@Getter @Setter private int rlu5fDateFromDd;

								@Getter @Setter private int rlu5fDateFromCc;

								@Getter @Setter private int rlu5fDateFromYy;
	
	/**
	* Constructor for Rlu5fDateFrom
	**/
    public Rlu5fDateFrom() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rlu5fDateFrom. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fDateFrom(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Rlu5fDateFrom
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setRlu5fDateFromMm(0);
                     setRlu5fDateFromDd(0);
                     setRlu5fDateFromCc(0);
                     setRlu5fDateFromYy(0);
   }


}
  
