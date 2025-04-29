package com.cloudframe.app.ms00d363.dto;

/**
*  The class WsaCurrentDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WsaCurrentDate extends WsaCurrentDateSerialized {
   

								@Getter @Setter private int wsaCurrentDateMm;


								@Getter @Setter private int wsaCurrentDateDd;


								@Getter @Setter private int wsaCurrentDateYy;
	
	/**
	* Constructor for WsaCurrentDate
	**/
    public WsaCurrentDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWsaCurrentDateMm(0);
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setWsaCurrentDateDd(0);
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setWsaCurrentDateYy(0);
    }





}
  
