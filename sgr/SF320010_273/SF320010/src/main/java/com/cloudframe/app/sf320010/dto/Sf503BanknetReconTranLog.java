package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503BanknetReconTranLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503BanknetReconTranLog extends Sf503BanknetReconTranLogSerialized { 
   

	
	/**
	* Constructor for Sf503BanknetReconTranLog
	**/
    public Sf503BanknetReconTranLog() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503BanknetReconTranLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503BanknetReconTranLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getSf503BanknetReconTranLogFieldLength() {
			return SF_503_BANKNET_RECON_TRAN_LOG_LENGTH;
		}

}
  
