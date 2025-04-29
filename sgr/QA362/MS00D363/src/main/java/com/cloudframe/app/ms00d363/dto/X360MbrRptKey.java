package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360MbrRptKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360MbrRptKey extends X360MbrRptKeySerialized { 
   

								@Getter @Setter private long x360MbrEndpoint;

								@Getter @Setter private long x360MbrEntIca;

								@Getter @Setter private long x360MbrMbrIca;

								@Getter @Setter private int x360MbrCutTime;

						@Getter @Setter private char[] x360MbrErlyDelFlag = Field.fillLowValue(1);

	
	/**
	* Constructor for X360MbrRptKey
	**/
    public X360MbrRptKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360MbrRptKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360MbrRptKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
