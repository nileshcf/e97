package com.cloudframe.app.divide0.dto;

/**
*  The class DaTblEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class DaTblEntries extends DaTblEntriesSerialized { 
   

								@Getter @Setter private BigDecimal daPercent = BigDecimal.ZERO;
	
	/**
	* Constructor for DaTblEntries
	**/
    public DaTblEntries() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DaTblEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DaTblEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
