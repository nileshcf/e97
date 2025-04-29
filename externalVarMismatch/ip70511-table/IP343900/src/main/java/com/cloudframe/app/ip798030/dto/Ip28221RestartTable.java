package com.cloudframe.app.ip798030.dto;

/**
*  The class Ip28221RestartTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip28221RestartTable extends Ip28221RestartTableSerialized { 
   

						@Getter @Setter private char[] ip28221ApplSysId = Field.fillLowValue(3);

						@Getter @Setter private char[] ip28221Db2PrimBackupInd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip28221RestartTable
	**/
    public Ip28221RestartTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip28221RestartTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip28221RestartTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
