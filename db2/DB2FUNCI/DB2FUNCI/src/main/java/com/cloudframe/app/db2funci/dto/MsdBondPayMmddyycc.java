package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdBondPayMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdBondPayMmddyycc extends MsdBondPayMmddyyccSerialized { 
   

								@Getter @Setter private long msdBondPayMmddyy;

								@Getter @Setter private int msdBondPayCc;
	
	/**
	* Constructor for MsdBondPayMmddyycc
	**/
    public MsdBondPayMmddyycc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdBondPayMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondPayMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdBondPayMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdBondPayMmddyy(0);
                     setMsdBondPayCc(0);
   }


}
  
