package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503PsTimeInSystem is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503PsTimeInSystem extends Sf503PsTimeInSystemSerialized { 
   

								@Getter @Setter private int sf503PsTimeInSystemHh;

								@Getter @Setter private int sf503PsTimeInSystemMm;

								@Getter @Setter private int sf503PsTimeInSystemSs;
	
	/**
	* Constructor for Sf503PsTimeInSystem
	**/
    public Sf503PsTimeInSystem() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503PsTimeInSystem. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503PsTimeInSystem(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
