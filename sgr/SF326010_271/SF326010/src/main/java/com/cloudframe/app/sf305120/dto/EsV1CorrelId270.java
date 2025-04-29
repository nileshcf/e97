package com.cloudframe.app.sf305120.dto;

/**
*  The class EsV1CorrelId270 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class EsV1CorrelId270 extends EsV1CorrelId270Serialized { 
   

						@Getter @Setter private char[] esV1SrvId270 = new char[4];

						@Getter @Setter private char[] esV1SrvreqId270 = new char[6];
	
	/**
	* Constructor for EsV1CorrelId270
	**/
    public EsV1CorrelId270() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for EsV1CorrelId270. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EsV1CorrelId270(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setEsV1SrvId270(fillSpace(4));
								setEsV1SrvreqId270(fillSpace(6));
    } 



}
  
