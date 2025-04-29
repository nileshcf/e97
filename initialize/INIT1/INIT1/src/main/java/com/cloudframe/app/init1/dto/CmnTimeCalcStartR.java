package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeCalcStartR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnTimeCalcStartR extends CmnTimeCalcStartRSerialized { 
   

								@Getter @Setter private int cmnTimeCalcStartHh;

								@Getter @Setter private int cmnTimeCalcStartMm;

								@Getter @Setter private int cmnTimeCalcStartSs;
	
	/**
	* Constructor for CmnTimeCalcStartR
	**/
    public CmnTimeCalcStartR() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnTimeCalcStartR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcStartR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
