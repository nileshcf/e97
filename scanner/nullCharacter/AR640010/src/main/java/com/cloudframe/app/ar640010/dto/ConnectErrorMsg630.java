package com.cloudframe.app.ar640010.dto;

/**
*  The class ConnectErrorMsg630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ConnectErrorMsg630 extends ConnectErrorMsg630Serialized {
   



						@Getter @Setter private char[] connectResponse630 = new char[4];
	
	/**
	* Constructor for ConnectErrorMsg630
	**/
    public ConnectErrorMsg630() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("3000-CANNOT CONNECT TO GFT DATABASE").toCharArray()
             , getStartOffset() + 0
             ,35
             );
       replaceValue( // serialize and save the value
             (", RESPONSE CODE: ").toCharArray()
             , getStartOffset() + 35
             ,17
             );
								setConnectResponse630(String.join("", java.util.Collections.nCopies(4, "?")).toCharArray());
    }





}
  
