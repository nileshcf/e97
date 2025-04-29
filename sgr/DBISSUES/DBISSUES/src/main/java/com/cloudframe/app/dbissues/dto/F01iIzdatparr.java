package com.cloudframe.app.dbissues.dto;

/**
*  The class F01iIzdatparr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class F01iIzdatparr extends F01iIzdatparrSerialized { 
   

								@Getter @Setter private int f01iIzfinprf;
	
	/**
	* Constructor for F01iIzdatparr
	**/
    public F01iIzdatparr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for F01iIzdatparr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01iIzdatparr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
