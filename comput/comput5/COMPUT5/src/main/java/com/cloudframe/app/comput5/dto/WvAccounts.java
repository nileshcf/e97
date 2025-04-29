package com.cloudframe.app.comput5.dto;

/**
*  The class WvAccounts is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;


@Data
public class WvAccounts extends WvAccountsSerialized { 
   

						@Getter @Setter private char[] wvAccountMnem = Field.fillLowValue(9);
			@Getter @Setter private List<WvWeightingType> wvWeightingType = new ArrayList<>();
    	
	
	/**
	* Constructor for WvAccounts
	**/
    public WvAccounts() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WvAccounts. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvAccounts(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
