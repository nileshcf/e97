package com.cloudframe.app.mcissues.dto;

/**
*  The class DtlCntZ800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtlCntZ800 extends DtlCntZ800Serialized { 
   

								@Getter @Setter private long dtlCntZo800;
	
	/**
	* Constructor for DtlCntZ800
	**/
    public DtlCntZ800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DtlCntZ800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DtlCntZ800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
