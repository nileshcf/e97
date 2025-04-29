package com.cloudframe.app.ip989010.dto;

/**
*  The class De31S1S2S3S4800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class De31S1S2S3S4800 extends De31S1S2S3S4800Serialized { 
   

								@Getter @Setter private int de31S1800;

								@Getter @Setter private long de31S2800;

								@Getter @Setter private int de31S3800;

								@Getter @Setter private long de31S4800;
	
	/**
	* Constructor for De31S1S2S3S4800
	**/
    public De31S1S2S3S4800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for De31S1S2S3S4800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De31S1S2S3S4800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setDe31S1800(0);
								setDe31S2800(0L);
								setDe31S3800(0);
								setDe31S4800(0L);
    } 



}
  
