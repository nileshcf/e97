package com.cloudframe.app.ms00d363.dto;

/**
*  The class WsaWhenCompiled2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WsaWhenCompiled2 extends WsaWhenCompiled2Serialized {
   

						@Getter @Setter private char[] wsaCompiledDate2 = new char[8];


						@Getter @Setter private char[] wsaCompiledTime2 = new char[12];
	
	/**
	* Constructor for WsaWhenCompiled2
	**/
    public WsaWhenCompiled2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWsaCompiledDate2(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 8
             ,1
             );
								setWsaCompiledTime2(fillSpace(12));
    }





}
  
