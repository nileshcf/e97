package com.cloudframe.app.ip606130.dto;

/**
*  The class TotalDefaultsMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class TotalDefaultsMsg600 extends TotalDefaultsMsg600Serialized {
   


								@Getter @Setter private char[] defaultsBuild600 = new char[11];
							
	
	/**
	* Constructor for TotalDefaultsMsg600
	**/
    public TotalDefaultsMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("TOTAL NO. OF DEFAULTS CREATED              :").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setDefaultsBuild600(CFUtil.cobolNumberFormatter("ZZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }





}
  
