package com.cloudframe.app.ip989010.dto;

/**
*  The class De31800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class De31800 extends De31800Serialized { 
   
				@Getter @Setter private De31S1S2S3S4800 de31S1S2S3S4800 = new De31S1S2S3S4800();

								@Getter @Setter private int de31S5800;
	
	/**
	* Constructor for De31800
	**/
    public De31800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for De31800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De31800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getDe31S1S2S3S4800().setParent(this,getStartOffset() + 0);
								setDe31S5800(0);
    } 



}
  
