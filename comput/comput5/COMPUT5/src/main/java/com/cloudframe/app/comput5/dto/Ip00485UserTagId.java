package com.cloudframe.app.comput5.dto;

/**
*  The class Ip00485UserTagId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00485UserTagId extends Ip00485UserTagIdSerialized { 
   

								@Getter @Setter private short ip00485UserTagOccurrence;

								@Getter @Setter private short ip00485UserTagSubfldNo;

								@Getter @Setter private short ip00485MemberId;
	
	/**
	* Constructor for Ip00485UserTagId
	**/
    public Ip00485UserTagId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00485UserTagId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00485UserTagId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
