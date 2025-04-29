package com.cloudframe.app.o529351u.dto;

/**
*  The class SceRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SceRecord extends SceRecordSerialized { 
   
				@Getter @Setter private SceKey sceKey = new SceKey();
				@Getter @Setter private SceAltKey sceAltKey = new SceAltKey();

						@Getter @Setter private char[] sceFromHcpcsCpt = Field.fillLowValue(5);
	
	/**
	* Constructor for SceRecord
	**/
    public SceRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SceRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SceRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSceKey().setParent(this,getStartOffset() + 0);
					getSceAltKey().setParent(this,getStartOffset() + 17);
    } 



}
  
