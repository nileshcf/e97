package com.cloudframe.app.ip606130.dto;

/**
*  The class Sys001Read300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class Sys001Read300 extends Sys001Read300Serialized {
   


								@Getter @Setter private char[] sys001Rec300 = new char[11];
							
	
	/**
	* Constructor for Sys001Read300
	**/
    public Sys001Read300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("NUMBER OF INPUT RECORDS READ               :").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setSys001Rec300(CFUtil.cobolNumberFormatter("ZZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }





}
  
