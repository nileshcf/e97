package com.cloudframe.app.o529351u.dto;

/**
*  The class D51uReturnData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uReturnData extends D51uReturnDataSerialized { 
   

						@Getter @Setter private char[] d51uRetFeSpi = Field.fillLowValue(7);

						@Getter @Setter private char[] d51uRetPolicy = Field.fillLowValue(6);

								@Getter @Setter private int d51uRetPlan;

						@Getter @Setter private char[] d51uRetEffDt = Field.fillLowValue(10);

						@Getter @Setter private char[] d51uRetCanDt = Field.fillLowValue(10);

						@Getter @Setter private char[] d51uRetStatus = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uRetPosTierCd = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uRetPriDiagInd = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uRetDiagElgInd = Field.fillLowValue(1);
	
	/**
	* Constructor for D51uReturnData
	**/
    public D51uReturnData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uReturnData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uReturnData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
