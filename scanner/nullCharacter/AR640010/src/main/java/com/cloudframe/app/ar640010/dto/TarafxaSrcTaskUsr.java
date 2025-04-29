package com.cloudframe.app.ar640010.dto;

/**
*  The class TarafxaSrcTaskUsr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TarafxaSrcTaskUsr extends TarafxaSrcTaskUsrSerialized { 
   

								@Getter @Setter private short tarafxaSrcTaskUsrLen;

						@Getter @Setter private char[] tarafxaSrcTaskUsrTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TarafxaSrcTaskUsr
	**/
    public TarafxaSrcTaskUsr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TarafxaSrcTaskUsr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxaSrcTaskUsr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
