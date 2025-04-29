package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip90354L1Ctlmtifunc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip90354L1Ctlmtifunc extends Ip90354L1CtlmtifuncSerialized { 
   

								@Getter @Setter private int ip90354L1Ctlmti;

								@Getter @Setter private int ip90354L1Ctlfunc;
	
	/**
	* Constructor for Ip90354L1Ctlmtifunc
	**/
    public Ip90354L1Ctlmtifunc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip90354L1Ctlmtifunc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90354L1Ctlmtifunc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
