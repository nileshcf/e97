package com.cloudframe.app.o529351u.dto;

/**
*  The class FesrKey01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FesrKey01 extends FesrKey01Serialized { 
   

								@Getter @Setter private int fesrSpiNbr01;

						@Getter @Setter private char[] fesrToPs01 = Field.fillLowValue(2);

						@Getter @Setter private char[] fesrToSvc01 = Field.fillLowValue(6);

						@Getter @Setter private char[] fesrToCause01 = Field.fillLowValue(1);
	
	/**
	* Constructor for FesrKey01
	**/
    public FesrKey01() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FesrKey01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrKey01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
