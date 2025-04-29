package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FCurrentDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360FCurrentDate extends X360FCurrentDateSerialized { 
   

								@Getter @Setter private int x360FCurYy;

								@Getter @Setter private int x360FCurMm;

								@Getter @Setter private int x360FCurDd;
	
	/**
	* Constructor for X360FCurrentDate
	**/
    public X360FCurrentDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360FCurrentDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FCurrentDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
