package com.cloudframe.app.sf305120.dto;

/**
*  The class FuncCurrentDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FuncCurrentDate800 extends FuncCurrentDate800Serialized {
   
				@Getter @Setter private FuncCurrDate800 funcCurrDate800 = new FuncCurrDate800();
				@Getter @Setter private FuncCurrTime800 funcCurrTime800 = new FuncCurrTime800();

	
	/**
	* Constructor for FuncCurrentDate800
	**/
    public FuncCurrentDate800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getFuncCurrDate800().setParent(this,getStartOffset() + 0);
					getFuncCurrTime800().setParent(this,getStartOffset() + 8);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 14
             ,7
             );
    }





}
  
