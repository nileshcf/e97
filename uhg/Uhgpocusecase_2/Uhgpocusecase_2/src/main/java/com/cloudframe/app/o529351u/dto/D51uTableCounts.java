package com.cloudframe.app.o529351u.dto;

/**
*  The class D51uTableCounts is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uTableCounts extends D51uTableCountsSerialized { 
   

								@Getter @Setter private int d51uPlnvCnt;

								@Getter @Setter private int d51uSpiCnt;

								@Getter @Setter private int d51uFrtoCnt;

								@Getter @Setter private int d51uPtypCnt;

								@Getter @Setter private int d51uIpaCnt;

								@Getter @Setter private int d51uCausCnt;

								@Getter @Setter private int d51uFcndCnt;

								@Getter @Setter private int d51uIcdCnt;

								@Getter @Setter private int d51uMoreIcdCnt;

								@Getter @Setter private int d51uCflgCnt;
	
	/**
	* Constructor for D51uTableCounts
	**/
    public D51uTableCounts() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uTableCounts. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uTableCounts(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
