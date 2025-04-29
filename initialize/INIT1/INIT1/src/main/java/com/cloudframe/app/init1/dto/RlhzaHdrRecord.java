package com.cloudframe.app.init1.dto;

/**
*  The class RlhzaHdrRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RlhzaHdrRecord extends RlhzaHdrRecordSerialized { 
   

								@Getter @Setter private long rlhzaRcBlAsOfDtIso;
				@Getter @Setter private RlhzaFiller02 rlhzaFiller02 = new RlhzaFiller02();
	
	/**
	* Constructor for RlhzaHdrRecord
	**/
    public RlhzaHdrRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RlhzaHdrRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlhzaHdrRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getRlhzaFiller02().setParent(this,getStartOffset() + 12);
    } 



}
  
