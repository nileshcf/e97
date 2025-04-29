package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip43501FsFileStatusInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip43501FsFileStatusInfo extends Ip43501FsFileStatusInfoSerialized { 
   

						@Getter @Setter private char[] ip43501FsFileStatus = Field.fillLowValue(1);

						@Getter @Setter private char[] ip43501FsFileErrorSw = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip43501FsFileStatusInfo
	**/
    public Ip43501FsFileStatusInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip43501FsFileStatusInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501FsFileStatusInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
