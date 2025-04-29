package com.cloudframe.app.o529351u.dto;

/**
*  The class SavRecTyp1Fixed is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SavRecTyp1Fixed extends SavRecTyp1FixedSerialized { 
   

								@Getter @Setter private short savNbrClminf;

								@Getter @Setter private short savNbrHist;

								@Getter @Setter private short savNbrOfLines;

								@Getter @Setter private short savNbrRec4;

								@Getter @Setter private short savNbrRec4Ins;
	
	/**
	* Constructor for SavRecTyp1Fixed
	**/
    public SavRecTyp1Fixed() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SavRecTyp1Fixed. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavRecTyp1Fixed(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
