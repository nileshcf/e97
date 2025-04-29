package com.cloudframe.app.o529351u.dto;

/**
*  The class SavMcdsChargeInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SavMcdsChargeInfo extends SavMcdsChargeInfoSerialized { 
   

						@Getter @Setter private char[] savNatDrugCd = Field.fillLowValue(11);
				@Getter @Setter private SavFiller savFiller = new SavFiller();
	
	/**
	* Constructor for SavMcdsChargeInfo
	**/
    public SavMcdsChargeInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SavMcdsChargeInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavMcdsChargeInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSavFiller().setParent(this,getStartOffset() + 101);
    } 



}
  
