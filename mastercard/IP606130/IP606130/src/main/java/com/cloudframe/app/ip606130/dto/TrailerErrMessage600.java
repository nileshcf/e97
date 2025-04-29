package com.cloudframe.app.ip606130.dto;

/**
*  The class TrailerErrMessage600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class TrailerErrMessage600 extends TrailerErrMessage600Serialized {
   


								@Getter @Setter private char[] errorInpCount600 = new char[10];
							


								@Getter @Setter private char[] errorTrlCount600 = new char[10];
							


						@Getter @Setter private char[] errorTableNbr600 = new char[8];
	
	/**
	* Constructor for TrailerErrMessage600
	**/
    public TrailerErrMessage600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("INPUT RECORD COUNT ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setErrorInpCount600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             (" DOES NOT MATCH THE TRAILER COUNT ").toCharArray()
             , getStartOffset() + 29
             ,34
             );
								setErrorTrlCount600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             (" FOR TABLE ").toCharArray()
             , getStartOffset() + 73
             ,11
             );
								setErrorTableNbr600(fillSpace(8));
    }





}
  
