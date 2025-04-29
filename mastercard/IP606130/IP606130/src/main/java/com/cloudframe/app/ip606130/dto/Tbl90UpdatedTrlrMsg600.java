package com.cloudframe.app.ip606130.dto;

/**
*  The class Tbl90UpdatedTrlrMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class Tbl90UpdatedTrlrMsg600 extends Tbl90UpdatedTrlrMsg600Serialized {
   


								@Getter @Setter private char[] table90UpdateCount600 = new char[10];
							
	
	/**
	* Constructor for Tbl90UpdatedTrlrMsg600
	**/
    public Tbl90UpdatedTrlrMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("UPDATED  TABLE90 TRAILER RECORD COUNT      :").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setTable90UpdateCount600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }





}
  
