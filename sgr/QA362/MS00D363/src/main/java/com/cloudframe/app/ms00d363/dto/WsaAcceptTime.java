package com.cloudframe.app.ms00d363.dto;

/**
*  The class WsaAcceptTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WsaAcceptTime extends WsaAcceptTimeSerialized {
   

								@Getter @Setter private long wsaTimeOfDay;

	
	/**
	* Constructor for WsaAcceptTime
	**/
    public WsaAcceptTime() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWsaTimeOfDay(0L);
       replaceValue(pad(2,"0","0",LEFT_PAD),getStartOffset() + 6,2);
    }





}
  
