package com.cloudframe.app.o529351u.dto;

/**
*  The class SavMAttendingPhysicianId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SavMAttendingPhysicianId extends SavMAttendingPhysicianIdSerialized { 
   

						@Getter @Setter private char[] savDrNmFst = Field.fillLowValue(10);
	
	/**
	* Constructor for SavMAttendingPhysicianId
	**/
    public SavMAttendingPhysicianId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SavMAttendingPhysicianId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavMAttendingPhysicianId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
