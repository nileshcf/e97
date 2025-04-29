package com.cloudframe.app.ms00d363.dto;

/**
*  The class WsaAcceptDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WsaAcceptDate extends WsaAcceptDateSerialized {
   

								@Getter @Setter private int wsaAcceptDateYy;

								@Getter @Setter private int wsaAcceptDateMm;

								@Getter @Setter private int wsaAcceptDateDd;
	
	/**
	* Constructor for WsaAcceptDate
	**/
    public WsaAcceptDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWsaAcceptDateYy(0);
								setWsaAcceptDateMm(0);
								setWsaAcceptDateDd(0);
    }





}
  
