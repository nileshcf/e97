package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf31IsoCnvDteCcyymmdd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf31IsoCnvDteCcyymmdd extends Sf31IsoCnvDteCcyymmddSerialized { 
   

						@Getter @Setter private char[] sf31IsoCnvDteCc = new char[2];

						@Getter @Setter private char[] sf31IsoCnvDteYy = new char[2];

						@Getter @Setter private char[] sf31IsoDe16CnvDteMmdd = new char[4];
	
	/**
	* Constructor for Sf31IsoCnvDteCcyymmdd
	**/
    public Sf31IsoCnvDteCcyymmdd() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf31IsoCnvDteCcyymmdd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoCnvDteCcyymmdd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSf31IsoCnvDteCc(fillSpace(2));
								setSf31IsoCnvDteYy(fillSpace(2));
								setSf31IsoDe16CnvDteMmdd(fillSpace(4));
    } 



}
  
