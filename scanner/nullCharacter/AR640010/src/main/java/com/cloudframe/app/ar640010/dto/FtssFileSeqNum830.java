package com.cloudframe.app.ar640010.dto;

/**
*  The class FtssFileSeqNum830 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FtssFileSeqNum830 extends FtssFileSeqNum830Serialized { 
   

								@Getter @Setter private int ftssFileCyclNum830;
	
	/**
	* Constructor for FtssFileSeqNum830
	**/
    public FtssFileSeqNum830() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FtssFileSeqNum830. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FtssFileSeqNum830(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
