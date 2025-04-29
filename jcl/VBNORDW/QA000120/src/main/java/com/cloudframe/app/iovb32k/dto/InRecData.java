package com.cloudframe.app.iovb32k.dto;

/**
*  The class InRecData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;


@Data
public class InRecData extends InRecDataSerialized { 
   
      private List<char[]> inRecByte; 

	
	/**
	* Constructor for InRecData
	**/
    public InRecData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for InRecData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InRecData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
