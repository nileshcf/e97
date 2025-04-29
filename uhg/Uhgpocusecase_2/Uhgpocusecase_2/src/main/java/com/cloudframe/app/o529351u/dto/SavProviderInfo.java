package com.cloudframe.app.o529351u.dto;

/**
*  The class SavProviderInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SavProviderInfo extends SavProviderInfoSerialized { 
   

						@Getter @Setter private char[] savHAttendingPhysicianId = Field.fillLowValue(30);
				@Getter @Setter private SavMAttendingPhysicianId savMAttendingPhysicianId = new SavMAttendingPhysicianId();
	
	/**
	* Constructor for SavProviderInfo
	**/
    public SavProviderInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SavProviderInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavProviderInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSavMAttendingPhysicianId().setParent(this,getStartOffset() + 30);
    } 



}
  
