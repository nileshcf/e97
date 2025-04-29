package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FIssIfeeAmt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360FIssIfeeAmt extends X360FIssIfeeAmtSerialized { 
   

								@Getter @Setter private long x360FIssFinIfeeDb;

								@Getter @Setter private long x360FIssFinIfeeCr;

								@Getter @Setter private long x360FIssNfIfeeDb;

								@Getter @Setter private long x360FIssNfIfeeCr;

								@Getter @Setter private long x360FIssPctIfeeDb;

								@Getter @Setter private long x360FIssPctIfeeCr;

								@Getter @Setter private long x360FIssNobillIfeeDb;

								@Getter @Setter private long x360FIssNobillIfeeCr;
	
	/**
	* Constructor for X360FIssIfeeAmt
	**/
    public X360FIssIfeeAmt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360FIssIfeeAmt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FIssIfeeAmt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
