package com.cloudframe.app.ar640010.dto;

/**
*  The class FunctionTs800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FunctionTs800 extends FunctionTs800Serialized { 
   

								@Getter @Setter private long functionDate800;
				@Getter @Setter private FunctionDate800Redefined functionDate800Redefined = new FunctionDate800Redefined();

								@Getter @Setter private int functionHour800;

								@Getter @Setter private int functionMinute800;

								@Getter @Setter private int functionSecond800;

								@Getter @Setter private int functionHundredth800;

						@Getter @Setter private char[] functionGmtAdjust800 = new char[1];

						@Getter @Setter private char[] functionGmtHours800 = new char[2];

						@Getter @Setter private char[] functionGmtMinutes800 = new char[2];
	
	/**
	* Constructor for FunctionTs800
	**/
    public FunctionTs800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FunctionTs800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FunctionTs800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getFunctionDate800Redefined().setParent(this,getStartOffset() + 0);
							getFunctionDate800Redefined().setString(fillSpace(8));
								setFunctionGmtAdjust800(fillSpace(1));
								setFunctionGmtHours800(fillSpace(2));
								setFunctionGmtMinutes800(fillSpace(2));
    } 



}
  
