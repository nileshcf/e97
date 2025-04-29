package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1ClmVariableArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class Dt1ClmVariableArea extends Dt1ClmVariableAreaSerialized { 
   
			@Getter @Setter private List<Dt1ClmClaimItem> dt1ClmClaimItem = new ArrayList<>();
    	
	
	/**
	* Constructor for Dt1ClmVariableArea
	**/
    public Dt1ClmVariableArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dt1ClmVariableArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClmVariableArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
