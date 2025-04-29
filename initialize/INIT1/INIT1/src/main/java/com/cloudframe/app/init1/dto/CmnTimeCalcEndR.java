package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeCalcEndR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnTimeCalcEndR extends CmnTimeCalcEndRSerialized { 
   

								@Getter @Setter private int cmnTimeCalcEndHh;

								@Getter @Setter private int cmnTimeCalcEndMm;

								@Getter @Setter private int cmnTimeCalcEndSs;
	
	/**
	* Constructor for CmnTimeCalcEndR
	**/
    public CmnTimeCalcEndR() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnTimeCalcEndR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcEndR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
