package com.cloudframe.app.sf305120.dto;

/**
*  The class FuncWhenCompiled800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FuncWhenCompiled800 extends FuncWhenCompiled800Serialized {
   
				@Getter @Setter private WhenCompDate800 whenCompDate800 = new WhenCompDate800();
				@Getter @Setter private WhenCompTime800 whenCompTime800 = new WhenCompTime800();

	
	/**
	* Constructor for FuncWhenCompiled800
	**/
    public FuncWhenCompiled800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWhenCompDate800().setParent(this,getStartOffset() + 0);
					getWhenCompTime800().setParent(this,getStartOffset() + 8);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 14
             ,7
             );
    }





}
  
