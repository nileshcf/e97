package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdBondDatedMmddyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdBondDatedMmddyy extends MsdBondDatedMmddyySerialized { 
   

								@Getter @Setter private int msdBondDatedMm;

								@Getter @Setter private int msdBondDatedDd;

								@Getter @Setter private int msdBondDatedYy;
	
	/**
	* Constructor for MsdBondDatedMmddyy
	**/
    public MsdBondDatedMmddyy() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdBondDatedMmddyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondDatedMmddyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdBondDatedMmddyy
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdBondDatedMm(0);
                     setMsdBondDatedDd(0);
                     setMsdBondDatedYy(0);
   }


}
  
