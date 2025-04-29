package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdBondRecordMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdBondRecordMmddyycc extends MsdBondRecordMmddyyccSerialized { 
   

								@Getter @Setter private long msdBondRecordMmddyy;

								@Getter @Setter private int msdBondRecordCc;
	
	/**
	* Constructor for MsdBondRecordMmddyycc
	**/
    public MsdBondRecordMmddyycc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdBondRecordMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondRecordMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdBondRecordMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdBondRecordMmddyy(0);
                     setMsdBondRecordCc(0);
   }


}
  
