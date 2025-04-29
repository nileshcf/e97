package com.cloudframe.app.o529351u.dto;

/**
*  The class PlanVarRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class PlanVarRec extends PlanVarRecSerialized { 
   

						@Getter @Setter private char[] fesaPolicy01 = Field.fillLowValue(6);

								@Getter @Setter private int fesaPlanVar01;

								@Getter @Setter private int fesaEffDate01;

								@Getter @Setter private int fesaSpiNbr01;

						@Getter @Setter private char[] fesaPosTierCd = Field.fillLowValue(1);

						@Getter @Setter private char[] fesaSpiPriDiagInd = Field.fillLowValue(1);

						@Getter @Setter private char[] fesaSpiDiagElgInd = Field.fillLowValue(1);
	
	/**
	* Constructor for PlanVarRec
	**/
    public PlanVarRec() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for PlanVarRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PlanVarRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
