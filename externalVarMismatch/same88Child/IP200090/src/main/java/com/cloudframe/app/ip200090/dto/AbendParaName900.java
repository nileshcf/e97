package com.cloudframe.app.ip200090.dto;

/**
*  The class AbendParaName900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AbendParaName900 extends AbendParaName900Serialized {
   


						@Getter @Setter private char[] abendPara900 = Field.fillLowValue(30);
	
	/**
	* Constructor for AbendParaName900
	**/
    public AbendParaName900() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("PARA NAME : ").toCharArray()
             , getStartOffset() + 0
             ,12
             );
    }





}
  
