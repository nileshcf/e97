package com.cloudframe.app.search2.dto;

/**
*  The class TblsRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TblsRedefined extends TblsRedefinedSerialized { 
   

								@Getter @Setter private long sbid;

						@Getter @Setter private char[] ecp = Field.fillLowValue(6);
	
	/**
	* Constructor for TblsRedefined
	**/
    public TblsRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TblsRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TblsRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
