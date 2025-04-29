package com.cloudframe.app.o529351u.dto;

/**
*  The class FesrFromCondPrvTyp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FesrFromCondPrvTyp extends FesrFromCondPrvTypSerialized { 
   

						@Getter @Setter private char[] fesrFromPrvTyp = Field.fillLowValue(2);
	
	/**
	* Constructor for FesrFromCondPrvTyp
	**/
    public FesrFromCondPrvTyp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FesrFromCondPrvTyp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrFromCondPrvTyp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
