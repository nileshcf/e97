package com.cloudframe.app.o529351u.dto;

/**
*  The class DrstEditErrorValueTxt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DrstEditErrorValueTxt extends DrstEditErrorValueTxtSerialized { 
   

								@Getter @Setter private char[] drstEditErrorValueInt = Field.fillLowValue(15);

								@Getter @Setter private char[] drstEditErrorValueDec = Field.fillLowValue(15);
	
	/**
	* Constructor for DrstEditErrorValueTxt
	**/
    public DrstEditErrorValueTxt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DrstEditErrorValueTxt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DrstEditErrorValueTxt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
