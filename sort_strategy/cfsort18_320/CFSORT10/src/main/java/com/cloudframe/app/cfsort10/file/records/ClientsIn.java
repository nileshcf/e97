package com.cloudframe.app.cfsort10.file.records;

/**
*  The class ClientsIn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:01. using version 5.0.0.254
**/


import com.cloudframe.app.cfsort10.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;


public class ClientsIn extends ClientsInSerialized {
   

	
	/**
	* Constructor for ClientsIn
	**/
    public ClientsIn() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 


	
	
	

		public static int getClientsInFieldLength() {
			return CLIENTS_IN_LENGTH;
		}

}
  
