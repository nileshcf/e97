package com.cloudframe.app.sf305120.dto;

/**
*  The class SrvreqHeader802 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SrvreqHeader802 extends SrvreqHeader802Serialized { 
   

						@Getter @Setter private char[] srHeaderId802 = new char[2];

						@Getter @Setter private char[] srHeaderVer802 = new char[3];

						@Getter @Setter private char[] srRequestCount802 = new char[1];
	
	/**
	* Constructor for SrvreqHeader802
	**/
    public SrvreqHeader802() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SrvreqHeader802. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SrvreqHeader802(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSrHeaderId802(("SR").toCharArray());
								setSrHeaderVer802(fillSpace(3));
								setSrRequestCount802(fillLowValue(1));
    } 



}
  
