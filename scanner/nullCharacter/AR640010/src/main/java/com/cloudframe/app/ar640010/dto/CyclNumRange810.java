package com.cloudframe.app.ar640010.dto;

/**
*  The class CyclNumRange810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CyclNumRange810 extends CyclNumRange810Serialized { 
   

								@Getter @Setter private short cyclNumLo810;

								@Getter @Setter private short cyclNumHi810;
	
	/**
	* Constructor for CyclNumRange810
	**/
    public CyclNumRange810() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CyclNumRange810. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CyclNumRange810(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCyclNumLo810((short)0);
								setCyclNumHi810((short)0);
    } 



}
  
