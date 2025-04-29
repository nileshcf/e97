package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360OtherDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360OtherDataFields extends X360OtherDataFieldsSerialized { 
   

						@Getter @Setter private char[] x360TjfRecType = Field.fillLowValue(2);

						@Getter @Setter private char[] x360PlusSettDate = Field.fillLowValue(4);

						@Getter @Setter private char[] x360BatchFeeKey = Field.fillLowValue(14);

						@Getter @Setter private char[] x360Report211NeededSwitch = Field.fillLowValue(1);

								@Getter @Setter private int x360McsImpDec;

						@Getter @Setter private char[] x360InstName = Field.fillLowValue(25);

						@Getter @Setter private char[] x360ProcName = Field.fillLowValue(25);

						@Getter @Setter private char[] x360AtmPosFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] x360SetlTyp = Field.fillLowValue(1);

						@Getter @Setter private char[] x360InstId = Field.fillLowValue(10);
				@Getter @Setter private X360AdditionalSortingFields x360AdditionalSortingFields = new X360AdditionalSortingFields();

								@Getter @Setter private int x360TransactionCnt;

								@Getter @Setter private long x360BatchSendingIca;

						@Getter @Setter private char[] x360SrtMcsSeqNum = Field.fillLowValue(6);

						@Getter @Setter private char[] x360SpecialProcessor = Field.fillLowValue(1);

	
	/**
	* Constructor for X360OtherDataFields
	**/
    public X360OtherDataFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360OtherDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360OtherDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getX360AdditionalSortingFields().setParent(this,getStartOffset() + 84);
    } 



}
  
