package com.cloudframe.app.d5427dt1.dto;

/**
*  The class HvNextKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HvNextKey extends HvNextKeySerialized { 
   

						@Getter @Setter private char[] hvNextProcDt = new char[10];

						@Getter @Setter private char[] hvNextProcTm = new char[8];

						@Getter @Setter private char[] hvNextPgmIdLstCharVal = new char[1];

								@Getter @Setter private short hvNextIcnSufxVersNbr;

						@Getter @Setter private char[] hvNextInvnCtlNbr = new char[10];

						@Getter @Setter private char[] hvNextIcnSufxCd = new char[3];

								@Getter @Setter private short hvNextLnId;
	
	/**
	* Constructor for HvNextKey
	**/
    public HvNextKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HvNextKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvNextKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvNextProcDt(("9999-12-31").toCharArray());
								setHvNextProcTm(("23.59.59").toCharArray());
								setHvNextPgmIdLstCharVal(("9").toCharArray());
								setHvNextIcnSufxVersNbr((short)9999);
								setHvNextInvnCtlNbr(("0000000000").toCharArray());
								setHvNextIcnSufxCd(("999").toCharArray());
								setHvNextLnId((short)9999);
    } 



}
  
