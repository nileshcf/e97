package com.cloudframe.app.sf311010.dto;

/**
*  The class AsmBitSw880 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AsmBitSw880 extends AsmBitSw880Serialized { 
   

								@Getter @Setter private int bit0880;

								@Getter @Setter private int bit1880;

								@Getter @Setter private int bit2880;

								@Getter @Setter private int bit3880;

								@Getter @Setter private int bit4880;

								@Getter @Setter private int bit5880;

								@Getter @Setter private int bit6880;

								@Getter @Setter private int bit7880;
	
	/**
	* Constructor for AsmBitSw880
	**/
    public AsmBitSw880() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AsmBitSw880. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsmBitSw880(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
