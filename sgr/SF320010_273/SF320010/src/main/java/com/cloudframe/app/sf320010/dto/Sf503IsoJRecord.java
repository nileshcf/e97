package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503IsoJRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503IsoJRecord extends Sf503IsoJRecordSerialized { 
   

						@Getter @Setter private char[] sf503IsoJData = Field.fillLowValue(32677);
				@Getter @Setter private Sf503IsoJDataRedefined sf503IsoJDataRedefined = new Sf503IsoJDataRedefined();
	
	/**
	* Constructor for Sf503IsoJRecord
	**/
    public Sf503IsoJRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503IsoJRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503IsoJRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSf503IsoJDataRedefined().setParent(this,getStartOffset() + 60);
    } 



}
  
