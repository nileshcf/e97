package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf31IsoBkntTraceData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf31IsoBkntTraceData extends Sf31IsoBkntTraceDataSerialized { 
   

						@Getter @Setter private char[] sf31IsoBkntProdDesc = new char[3];

						@Getter @Setter private char[] sf31IsoBkntRefNo = new char[6];
	
	/**
	* Constructor for Sf31IsoBkntTraceData
	**/
    public Sf31IsoBkntTraceData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf31IsoBkntTraceData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoBkntTraceData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSf31IsoBkntProdDesc(fillSpace(3));
								setSf31IsoBkntRefNo(fillSpace(6));
    } 



}
  
