package com.cloudframe.app.sf305120.dto;

/**
*  The class Sf539ServiceTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf539ServiceTable extends Sf539ServiceTableSerialized { 
   

								@Getter @Setter private int sf539ServiceReqNo;

						@Getter @Setter private char[] sf539ServiceRefno = Field.fillLowValue(6);

						@Getter @Setter private char[] sf539ServiceCode = Field.fillLowValue(4);

						@Getter @Setter private char[] sf539ServiceStatus = Field.fillLowValue(1);

						@Getter @Setter private char[] sf539ServiceRc = Field.fillLowValue(1);

								@Getter @Setter private int sf539SrvDataLnth;

						@Getter @Setter private char[] sf539ServiceData = Field.fillLowValue(50);

	
	/**
	* Constructor for Sf539ServiceTable
	**/
    public Sf539ServiceTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf539ServiceTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf539ServiceTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
