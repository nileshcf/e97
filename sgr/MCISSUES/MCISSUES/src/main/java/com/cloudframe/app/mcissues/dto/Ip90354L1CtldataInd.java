package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip90354L1CtldataInd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip90354L1CtldataInd extends Ip90354L1CtldataIndSerialized { 
   

								@Getter @Setter private int ip90354L1IndFld;
	
	/**
	* Constructor for Ip90354L1CtldataInd
	**/
    public Ip90354L1CtldataInd() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip90354L1CtldataInd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90354L1CtldataInd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
