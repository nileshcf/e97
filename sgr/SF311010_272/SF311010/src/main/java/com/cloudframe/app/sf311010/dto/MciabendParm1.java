package com.cloudframe.app.sf311010.dto;

/**
*  The class MciabendParm1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MciabendParm1 extends MciabendParm1Serialized { 
   

						@Getter @Setter private char[] mciabendDumpOpt = new char[1];


								@Getter @Setter private int mciabendAbendCode;
	
	/**
	* Constructor for MciabendParm1
	**/
    public MciabendParm1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MciabendParm1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciabendParm1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMciabendDumpOpt(fillSpace(1));
    } 



}
  
