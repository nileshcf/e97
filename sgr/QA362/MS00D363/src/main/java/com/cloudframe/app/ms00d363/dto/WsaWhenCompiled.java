package com.cloudframe.app.ms00d363.dto;

/**
*  The class WsaWhenCompiled is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WsaWhenCompiled extends WsaWhenCompiledSerialized {
   

						@Getter @Setter private char[] wsaCompiledDate = new char[8];

						@Getter @Setter private char[] wsaCompiledTime = new char[12];
	
	/**
	* Constructor for WsaWhenCompiled
	**/
    public WsaWhenCompiled() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWsaCompiledDate(fillSpace(8));
								setWsaCompiledTime(fillSpace(12));
    }





}
  
