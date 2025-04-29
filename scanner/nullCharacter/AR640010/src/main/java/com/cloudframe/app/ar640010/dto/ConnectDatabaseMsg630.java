package com.cloudframe.app.ar640010.dto;

/**
*  The class ConnectDatabaseMsg630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ConnectDatabaseMsg630 extends ConnectDatabaseMsg630Serialized {
   


						@Getter @Setter private char[] connectGftDbid630 = new char[8];


						@Getter @Setter private char[] connectUserDbid630 = new char[16];
	
	/**
	* Constructor for ConnectDatabaseMsg630
	**/
    public ConnectDatabaseMsg630() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("3001-GFT DATABASE ID: ").toCharArray()
             , getStartOffset() + 0
             ,22
             );
								setConnectGftDbid630(fillSpace(8));
       replaceValue( // serialize and save the value
             (" USER SERVER: ").toCharArray()
             , getStartOffset() + 30
             ,14
             );
								setConnectUserDbid630(fillSpace(16));
    }





}
  
