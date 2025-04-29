package com.cloudframe.app.cfdate02.file.records;

/**
*  The class OldcrLnShrGrpRemHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class OldcrLnShrGrpRemHdr extends OldcrLnShrGrpRemHdrSerialized { 
   

						@Getter @Setter private char[] oldcrCustomerHeaderRec = Field.fillLowValue(152);
	
	/**
	* Constructor for OldcrLnShrGrpRemHdr
	**/
    public OldcrLnShrGrpRemHdr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for OldcrLnShrGrpRemHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OldcrLnShrGrpRemHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
