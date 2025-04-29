package com.cloudframe.app.vsammon4.dto;

/**
*  The class RewriteData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RewriteData extends RewriteDataSerialized { 
   

								@Getter @Setter private long rwKey;

								@Getter @Setter private long rwTaskNo;

								@Getter @Setter private long rwReqSize;

								@Getter @Setter private int rwDataLen;
	
	/**
	* Constructor for RewriteData
	**/
    public RewriteData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RewriteData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RewriteData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
