package com.cloudframe.app.init1.dto;

/**
*  The class CmnNumTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnNumTime extends CmnNumTimeSerialized { 
   

								@Getter @Setter private int cmnNumTimeHh;

								@Getter @Setter private int cmnNumTimeMm;

								@Getter @Setter private int cmnNumTimeSs;
	
	/**
	* Constructor for CmnNumTime
	**/
    public CmnNumTime() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnNumTime. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnNumTime(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
