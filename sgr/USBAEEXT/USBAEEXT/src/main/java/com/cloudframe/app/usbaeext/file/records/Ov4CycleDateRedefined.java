package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4CycleDateRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ov4CycleDateRedefined extends Ov4CycleDateRedefinedSerialized { 
   

								@Getter @Setter private int ov4CycleDateMm;

								@Getter @Setter private int ov4CycleDateDd;

								@Getter @Setter private int ov4CycleDateYy;
	
	/**
	* Constructor for Ov4CycleDateRedefined
	**/
    public Ov4CycleDateRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ov4CycleDateRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4CycleDateRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
