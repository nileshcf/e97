package com.cloudframe.app.ar640010.dto;

/**
*  The class ConnectPackageMsg630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ConnectPackageMsg630 extends ConnectPackageMsg630Serialized {
   


						@Getter @Setter private char[] connectGftDbpkg630 = new char[18];


						@Getter @Setter private char[] connectUserDbpkg630 = new char[18];
	
	/**
	* Constructor for ConnectPackageMsg630
	**/
    public ConnectPackageMsg630() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("3002-GFT PACKAGE SET: ").toCharArray()
             , getStartOffset() + 0
             ,22
             );
								setConnectGftDbpkg630(fillSpace(18));
       replaceValue( // serialize and save the value
             (" USER PACKAGE SET: ").toCharArray()
             , getStartOffset() + 40
             ,19
             );
								setConnectUserDbpkg630(fillSpace(18));
    }





}
  
