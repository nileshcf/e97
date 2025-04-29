package com.cloudframe.app.search2.dto;

/**
*  The class SbidGroupEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SbidGroupEntries extends SbidGroupEntriesSerialized { 
   

								@Getter @Setter private long tblSbid;

						@Getter @Setter private char[] tblEcp = Field.fillLowValue(6);
	
	/**
	* Constructor for SbidGroupEntries
	**/
    public SbidGroupEntries() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SbidGroupEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SbidGroupEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
