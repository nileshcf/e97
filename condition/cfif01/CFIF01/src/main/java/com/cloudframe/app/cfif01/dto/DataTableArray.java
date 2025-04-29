package com.cloudframe.app.cfif01.dto;

/**
*  The class DataTableArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class DataTableArray extends DataTableArraySerialized { 
   

								@Getter @Setter private int dataHmAirQty;

								@Getter @Setter private BigDecimal dataHmAirQtyDec = BigDecimal.ZERO;
	
	/**
	* Constructor for DataTableArray
	**/
    public DataTableArray() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DataTableArray. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DataTableArray(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
