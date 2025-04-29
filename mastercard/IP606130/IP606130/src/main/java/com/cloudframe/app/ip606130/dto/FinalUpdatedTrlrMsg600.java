package com.cloudframe.app.ip606130.dto;

/**
*  The class FinalUpdatedTrlrMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class FinalUpdatedTrlrMsg600 extends FinalUpdatedTrlrMsg600Serialized {
   


								@Getter @Setter private char[] finalTrlrUpdatedCnt600 = new char[10];
							
	
	/**
	* Constructor for FinalUpdatedTrlrMsg600
	**/
    public FinalUpdatedTrlrMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("UPDATED  FINAL   TRAILER RECORD COUNT      :").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setFinalTrlrUpdatedCnt600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }





}
  
