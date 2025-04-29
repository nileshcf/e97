package com.cloudframe.app.sf305120.dto;

/**
*  The class AdditionalRuc260 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AdditionalRuc260 extends AdditionalRuc260Serialized { 
   

								@Getter @Setter private int logcElapsedTime260;

								@Getter @Setter private short logcSeg1Length260;

								@Getter @Setter private short logcSeg2Length260;

	
	/**
	* Constructor for AdditionalRuc260
	**/
    public AdditionalRuc260() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AdditionalRuc260. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AdditionalRuc260(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setLogcElapsedTime260(0);
								setLogcSeg1Length260((short)0);
								setLogcSeg2Length260((short)0);
       replaceValue( // serialize and save the value
             pad(73," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 8
             ,73
             );
    } 



}
  
