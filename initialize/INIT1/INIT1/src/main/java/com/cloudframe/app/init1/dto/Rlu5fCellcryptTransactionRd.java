package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fCellcryptTransactionRd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Rlu5fCellcryptTransactionRd extends Rlu5fCellcryptTransactionRdSerialized { 
   

								@Getter @Setter private int rlu5fCellcryptTransactionMm;

								@Getter @Setter private int rlu5fCellcryptTransactionDd;

								@Getter @Setter private int rlu5fCellcryptTransactionCc;

								@Getter @Setter private int rlu5fCellcryptTransactionYy;
	
	/**
	* Constructor for Rlu5fCellcryptTransactionRd
	**/
    public Rlu5fCellcryptTransactionRd() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rlu5fCellcryptTransactionRd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fCellcryptTransactionRd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
