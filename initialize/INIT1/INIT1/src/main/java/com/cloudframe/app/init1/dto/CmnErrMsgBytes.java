package com.cloudframe.app.init1.dto;

/**
*  The class CmnErrMsgBytes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;


@Data
public class CmnErrMsgBytes extends CmnErrMsgBytesSerialized { 
   
      private List<char[]> cmnErrByte; 

	
	/**
	* Constructor for CmnErrMsgBytes
	**/
    public CmnErrMsgBytes() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnErrMsgBytes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnErrMsgBytes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
