package com.cloudframe.app.o529351u.dto;

/**
*  The class PpaPpoaltRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class PpaPpoaltRecord extends PpaPpoaltRecordSerialized { 
   
				@Getter @Setter private PpaFixedPortion ppaFixedPortion = new PpaFixedPortion();
			@Getter @Setter private List<PpaPpoId> ppaPpoId = new ArrayList<>();
    	
	
	/**
	* Constructor for PpaPpoaltRecord
	**/
    public PpaPpoaltRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for PpaPpoaltRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PpaPpoaltRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getPpaFixedPortion().setParent(this,getStartOffset() + 0);
				for (int arrayIndex = 0; arrayIndex < PPA_PPO_ID_SIZE;arrayIndex++) {
						getPpaPpoId().add(new PpaPpoId(this, beginPpaPpoId + 
						arrayIndex * PpaPpoId.getPpaPpoIdFieldLength()));
				}
    } 



}
  
