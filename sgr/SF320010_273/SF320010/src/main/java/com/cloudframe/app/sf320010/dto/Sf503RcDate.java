package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503RcDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503RcDate extends Sf503RcDateSerialized { 
   

								@Getter @Setter private int sf503RcDateMm;

								@Getter @Setter private int sf503RcDateDd;

								@Getter @Setter private int sf503RcDateYy;
	
	/**
	* Constructor for Sf503RcDate
	**/
    public Sf503RcDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503RcDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503RcDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
