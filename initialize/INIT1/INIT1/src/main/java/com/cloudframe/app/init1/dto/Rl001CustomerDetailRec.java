package com.cloudframe.app.init1.dto;

/**
*  The class Rl001CustomerDetailRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Rl001CustomerDetailRec extends Rl001CustomerDetailRecSerialized { 
   

						@Getter @Setter private char[] rl001VbmCustInd = new char[1];
				@Getter @Setter private Rl001MachToMachInfo rl001MachToMachInfo = new Rl001MachToMachInfo();

						@Getter @Setter private char[] rl001MachToMachInfoRedefined = Field.fillLowValue(2);

						@Getter @Setter private char[] rl001PricingLabInd = new char[1];

						@Getter @Setter private char[] rl001FirstBillInd = new char[1];
	
	/**
	* Constructor for Rl001CustomerDetailRec
	**/
    public Rl001CustomerDetailRec() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rl001CustomerDetailRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl001CustomerDetailRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getRl001MachToMachInfo().setParent(this,getStartOffset() + 173);
								setRl001VbmCustInd(("N").toCharArray());
								setRl001PricingLabInd(fillSpace(1));
								setRl001FirstBillInd(("N").toCharArray());
    } 



}
  
