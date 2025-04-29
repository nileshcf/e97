package com.cloudframe.app.init1.dto;

/**
*  The class RlcbmBillMessageRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RlcbmBillMessageRec extends RlcbmBillMessageRecSerialized { 
   

								@Getter @Setter private long rlcbmInvoiceNo;

						@Getter @Setter private char[] rlcbmCustTypCd = Field.fillLowValue(2);

								@Getter @Setter private int rlcbmEcpdProfileId;

								@Getter @Setter private int rlcbmActiveMtnsQty;
	
	/**
	* Constructor for RlcbmBillMessageRec
	**/
    public RlcbmBillMessageRec() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RlcbmBillMessageRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlcbmBillMessageRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
