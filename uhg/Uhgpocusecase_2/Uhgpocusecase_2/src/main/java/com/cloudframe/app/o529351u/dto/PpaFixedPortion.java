package com.cloudframe.app.o529351u.dto;

/**
*  The class PpaFixedPortion is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class PpaFixedPortion extends PpaFixedPortionSerialized { 
   
				@Getter @Setter private PpaKey ppaKey = new PpaKey();

								@Getter @Setter private int ppaLastUpdDate;

								@Getter @Setter private int ppaLastUpdTime;

								@Getter @Setter private short ppaPpoIdCount;
	
	/**
	* Constructor for PpaFixedPortion
	**/
    public PpaFixedPortion() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for PpaFixedPortion. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PpaFixedPortion(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getPpaKey().setParent(this,getStartOffset() + 0);
    } 



}
  
