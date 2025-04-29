package com.cloudframe.app.dbissues.dto;

/**
*  The class F01oIzdatparr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class F01oIzdatparr extends F01oIzdatparrSerialized { 
   

								@Getter @Setter private int f01oIzfinprf;
	
	/**
	* Constructor for F01oIzdatparr
	**/
    public F01oIzdatparr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for F01oIzdatparr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01oIzdatparr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
