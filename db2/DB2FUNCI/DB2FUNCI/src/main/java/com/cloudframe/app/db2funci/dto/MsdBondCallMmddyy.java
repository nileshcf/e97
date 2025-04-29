package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdBondCallMmddyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdBondCallMmddyy extends MsdBondCallMmddyySerialized { 
   

								@Getter @Setter private int msdBondCallMm;

								@Getter @Setter private int msdBondCallDd;

								@Getter @Setter private int msdBondCallYy;
	
	/**
	* Constructor for MsdBondCallMmddyy
	**/
    public MsdBondCallMmddyy() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdBondCallMmddyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondCallMmddyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdBondCallMmddyy
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdBondCallMm(0);
                     setMsdBondCallDd(0);
                     setMsdBondCallYy(0);
   }


}
  
