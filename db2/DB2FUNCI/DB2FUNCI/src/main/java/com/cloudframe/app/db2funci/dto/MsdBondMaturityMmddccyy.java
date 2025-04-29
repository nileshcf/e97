package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdBondMaturityMmddccyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdBondMaturityMmddccyy extends MsdBondMaturityMmddccyySerialized { 
   

								@Getter @Setter private int msdBondMaturityMm;

								@Getter @Setter private int msdBondMaturityDd;

								@Getter @Setter private int msdBondMaturityCc;

								@Getter @Setter private int msdBondMaturityYy;
	
	/**
	* Constructor for MsdBondMaturityMmddccyy
	**/
    public MsdBondMaturityMmddccyy() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdBondMaturityMmddccyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondMaturityMmddccyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdBondMaturityMmddccyy
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdBondMaturityMm(0);
                     setMsdBondMaturityDd(0);
                     setMsdBondMaturityCc(0);
                     setMsdBondMaturityYy(0);
   }


}
  
