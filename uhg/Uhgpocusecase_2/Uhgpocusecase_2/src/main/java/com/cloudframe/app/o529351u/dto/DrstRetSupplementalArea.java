package com.cloudframe.app.o529351u.dto;

/**
*  The class DrstRetSupplementalArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;


@Data
public class DrstRetSupplementalArea extends DrstRetSupplementalAreaSerialized { 
   
      private List<char[]> drstRetSupplementalEntry; 

	
	/**
	* Constructor for DrstRetSupplementalArea
	**/
    public DrstRetSupplementalArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DrstRetSupplementalArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DrstRetSupplementalArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
