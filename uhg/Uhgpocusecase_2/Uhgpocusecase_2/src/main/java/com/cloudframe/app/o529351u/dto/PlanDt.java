package com.cloudframe.app.o529351u.dto;

/**
*  The class PlanDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class PlanDt extends PlanDtSerialized { 
   

								@Getter @Setter private int planCc;

								@Getter @Setter private int planYy;

								@Getter @Setter private int planMm;

								@Getter @Setter private int planDd;
	
	/**
	* Constructor for PlanDt
	**/
    public PlanDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for PlanDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PlanDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
