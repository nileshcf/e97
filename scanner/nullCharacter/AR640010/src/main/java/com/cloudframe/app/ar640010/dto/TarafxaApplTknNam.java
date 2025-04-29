package com.cloudframe.app.ar640010.dto;

/**
*  The class TarafxaApplTknNam is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TarafxaApplTknNam extends TarafxaApplTknNamSerialized { 
   

								@Getter @Setter private short tarafxaApplTknNamLen;

						@Getter @Setter private char[] tarafxaApplTknNamTxt = Field.fillLowValue(128);
	
	/**
	* Constructor for TarafxaApplTknNam
	**/
    public TarafxaApplTknNam() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TarafxaApplTknNam. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxaApplTknNam(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
