package com.cloudframe.app.init1.dto;

/**
*  The class Rl001DtlRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Rl001DtlRecord extends Rl001DtlRecordSerialized { 
   
				@Getter @Setter private Rl001CustomerDetailRec rl001CustomerDetailRec = new Rl001CustomerDetailRec();
	
	/**
	* Constructor for Rl001DtlRecord
	**/
    public Rl001DtlRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rl001DtlRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl001DtlRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getRl001CustomerDetailRec().setParent(this,getStartOffset() + 19);
    } 



}
  
