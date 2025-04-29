package com.cloudframe.app.o529351u.dto;

/**
*  The class McrCheckTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class McrCheckTable extends McrCheckTableSerialized { 
   

								@Getter @Setter private int mcrLineNbr;

								@Getter @Setter private BigDecimal mcrLineCharge = BigDecimal.ZERO;
	
	/**
	* Constructor for McrCheckTable
	**/
    public McrCheckTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for McrCheckTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public McrCheckTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
