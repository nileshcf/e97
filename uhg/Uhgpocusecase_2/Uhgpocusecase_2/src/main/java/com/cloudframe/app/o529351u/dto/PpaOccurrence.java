package com.cloudframe.app.o529351u.dto;

/**
*  The class PpaOccurrence is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class PpaOccurrence extends PpaOccurrenceSerialized { 
   

						@Getter @Setter private char[] ppaProduct = Field.fillLowValue(3);

								@Getter @Setter private short ppaMarketType;

								@Getter @Setter private int ppaMarket;

								@Getter @Setter private int ppaIpa;

						@Getter @Setter private char[] ppaGrpTabNo = Field.fillLowValue(4);

						@Getter @Setter private char[] ppaContractArrange = Field.fillLowValue(1);

								@Getter @Setter private int ppaFirstEffDate;

								@Getter @Setter private int ppaLastCanDate;

						@Getter @Setter private char[] ppaFacContr = Field.fillLowValue(1);
	
	/**
	* Constructor for PpaOccurrence
	**/
    public PpaOccurrence() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for PpaOccurrence. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PpaOccurrence(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
