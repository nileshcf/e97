package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RldusInEocRefBlDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RldusInEocRefBlDtl extends RldusInEocRefBlDtlSerialized { 
   

						@Getter @Setter private char[] rldusCpduRec = Field.fillLowValue(161);
	
	/**
	* Constructor for RldusInEocRefBlDtl
	**/
    public RldusInEocRefBlDtl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RldusInEocRefBlDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RldusInEocRefBlDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
