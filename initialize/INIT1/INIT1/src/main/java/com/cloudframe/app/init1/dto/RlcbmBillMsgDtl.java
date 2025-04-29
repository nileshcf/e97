package com.cloudframe.app.init1.dto;

/**
*  The class RlcbmBillMsgDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RlcbmBillMsgDtl extends RlcbmBillMsgDtlSerialized { 
   
				@Getter @Setter private RlcbmBillMessageRec rlcbmBillMessageRec = new RlcbmBillMessageRec();
	
	/**
	* Constructor for RlcbmBillMsgDtl
	**/
    public RlcbmBillMsgDtl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RlcbmBillMsgDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlcbmBillMsgDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getRlcbmBillMessageRec().setParent(this,getStartOffset() + 1);
    } 



}
  
