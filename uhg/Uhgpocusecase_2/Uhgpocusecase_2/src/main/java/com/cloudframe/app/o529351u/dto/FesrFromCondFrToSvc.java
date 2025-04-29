package com.cloudframe.app.o529351u.dto;

/**
*  The class FesrFromCondFrToSvc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FesrFromCondFrToSvc extends FesrFromCondFrToSvcSerialized { 
   

						@Getter @Setter private char[] fesrFromFrSvc = Field.fillLowValue(7);

						@Getter @Setter private char[] fesrFromToSvc = Field.fillLowValue(7);

						@Getter @Setter private char[] fesrSvcInd = Field.fillLowValue(1);
	
	/**
	* Constructor for FesrFromCondFrToSvc
	**/
    public FesrFromCondFrToSvc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FesrFromCondFrToSvc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrFromCondFrToSvc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
