package com.cloudframe.app.ar640010.dto;

/**
*  The class McinfoErrorMsg621 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class McinfoErrorMsg621 extends McinfoErrorMsg621Serialized {
   


								@Getter @Setter private int mcinfoReturnCode621;
	
	/**
	* Constructor for McinfoErrorMsg621
	**/
    public McinfoErrorMsg621() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("2010-MCINFO ERROR ENCOUNTERED, RETURN-CODE: ").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setMcinfoReturnCode621(0);
    }





}
  
