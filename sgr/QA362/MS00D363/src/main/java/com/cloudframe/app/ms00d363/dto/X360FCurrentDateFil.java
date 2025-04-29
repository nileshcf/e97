package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FCurrentDateFil is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360FCurrentDateFil extends X360FCurrentDateFilSerialized { 
   

								@Getter @Setter private int x360FCurYyFil;

								@Getter @Setter private int x360FCurMmFil;

								@Getter @Setter private int x360FCurDdFil;
	
	/**
	* Constructor for X360FCurrentDateFil
	**/
    public X360FCurrentDateFil() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360FCurrentDateFil. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FCurrentDateFil(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
