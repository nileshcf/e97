package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1SrtVariableArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dt1SrtVariableArea extends Dt1SrtVariableAreaSerialized { 
   
				@Getter @Setter private Dt1SrtArray dt1SrtArray = new Dt1SrtArray();
	
	/**
	* Constructor for Dt1SrtVariableArea
	**/
    public Dt1SrtVariableArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dt1SrtVariableArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1SrtVariableArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getDt1SrtArray().setParent(this,getStartOffset() + 0);
    } 



}
  
