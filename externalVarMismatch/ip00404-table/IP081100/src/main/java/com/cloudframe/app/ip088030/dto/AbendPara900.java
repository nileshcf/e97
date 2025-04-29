package com.cloudframe.app.ip088030.dto;

/**
*  The class AbendPara900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class AbendPara900 extends AbendPara900Serialized {
   


						@Getter @Setter private char[] abendParaName900 = new char[30];
	
	/**
	* Constructor for AbendPara900
	**/
    public AbendPara900() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("PARA NAME : ").toCharArray()
             , getStartOffset() + 0
             ,12
             );
								setAbendParaName900(fillSpace(30));
    }





}
  
