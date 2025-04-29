package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FWorkOfDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360FWorkOfDate extends X360FWorkOfDateSerialized { 
   

								@Getter @Setter private int x360FWoYy;

								@Getter @Setter private int x360FWoMm;

								@Getter @Setter private int x360FWoDd;
	
	/**
	* Constructor for X360FWorkOfDate
	**/
    public X360FWorkOfDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360FWorkOfDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FWorkOfDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
