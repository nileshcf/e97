package com.cloudframe.app.search3.dto;

/**
*  The class Ip66601UserElementId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip66601UserElementId extends Ip66601UserElementIdSerialized { 
   

								@Getter @Setter private short ip66601UserTagType;

								@Getter @Setter private short ip66601UserTagNo;
	
	/**
	* Constructor for Ip66601UserElementId
	**/
    public Ip66601UserElementId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip66601UserElementId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66601UserElementId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
