package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503IsoRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503IsoRecord extends Sf503IsoRecordSerialized { 
   

						@Getter @Setter private char[] sf503IsoData = Field.fillLowValue(32691);
				@Getter @Setter private Sf503IsoDataRedefined sf503IsoDataRedefined = new Sf503IsoDataRedefined();
	
	/**
	* Constructor for Sf503IsoRecord
	**/
    public Sf503IsoRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503IsoRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503IsoRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSf503IsoDataRedefined().setParent(this,getStartOffset() + 46);
    } 



}
  
