package com.cloudframe.app.sorttbl.dto;

/**
*  The class Ip00854wTableData01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00854wTableData01 extends Ip00854wTableData01Serialized { 
   

								@Getter @Setter private int ip00854wTxnCurrCd;

						@Getter @Setter private char[] ip00854wTxnCurrCdX = Field.fillLowValue(3);

								@Getter @Setter private int ip00854wReconCurrCd;

						@Getter @Setter private char[] ip00854wReconCurrCdX = Field.fillLowValue(3);

								@Getter @Setter private long ip00854wRuleEffDate;
	
	/**
	* Constructor for Ip00854wTableData01
	**/
    public Ip00854wTableData01() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00854wTableData01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00854wTableData01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
