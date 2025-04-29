package com.cloudframe.app.ar640010.dto;

/**
*  The class MciseqioLabelCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MciseqioLabelCodes extends MciseqioLabelCodesSerialized { 
   

						@Getter @Setter private char[] mciseqioLabelOnDd = new char[2];

						@Getter @Setter private char[] mciseqioNoLabel = new char[2];

						@Getter @Setter private char[] mciseqioStdLabel = new char[2];
	
	/**
	* Constructor for MciseqioLabelCodes
	**/
    public MciseqioLabelCodes() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MciseqioLabelCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioLabelCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMciseqioLabelOnDd(fillSpace(2));
								setMciseqioNoLabel(("NL").toCharArray());
								setMciseqioStdLabel(("SL").toCharArray());
    } 



}
  
