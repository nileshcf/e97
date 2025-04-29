package com.cloudframe.app.ar640010.dto;

/**
*  The class TarafxsApplTknNam is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TarafxsApplTknNam extends TarafxsApplTknNamSerialized { 
   

								@Getter @Setter private short tarafxsApplTknNamLen;

						@Getter @Setter private char[] tarafxsApplTknNamTxt = Field.fillLowValue(128);
	
	/**
	* Constructor for TarafxsApplTknNam
	**/
    public TarafxsApplTknNam() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TarafxsApplTknNam. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxsApplTknNam(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
