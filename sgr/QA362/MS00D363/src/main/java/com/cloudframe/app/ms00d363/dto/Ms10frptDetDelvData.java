package com.cloudframe.app.ms00d363.dto;

/**
*  The class Ms10frptDetDelvData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ms10frptDetDelvData extends Ms10frptDetDelvDataSerialized { 
   
				@Getter @Setter private Ms10frptDetDelvKey ms10frptDetDelvKey = new Ms10frptDetDelvKey();

								@Getter @Setter private long ms10frptDetProc2;
	
	/**
	* Constructor for Ms10frptDetDelvData
	**/
    public Ms10frptDetDelvData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ms10frptDetDelvData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ms10frptDetDelvData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMs10frptDetDelvKey().setParent(this,getStartOffset() + 0);
    } 



}
  
