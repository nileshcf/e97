package com.cloudframe.app.ip606130.dto;

/**
*  The class Table36Bsl600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Table36Bsl600 extends Table36Bsl600Serialized { 
   

						@Getter @Setter private char[] region600 = Field.fillLowValue(1);

						@Getter @Setter private char[] fromRegion600 = Field.fillLowValue(1);

						@Getter @Setter private char[] toRegion600 = Field.fillLowValue(1);

						@Getter @Setter private char[] accBrand600 = Field.fillLowValue(3);

								@Getter @Setter private int bsPriority600;

						@Getter @Setter private char[] busSrvLvl600 = Field.fillLowValue(1);

						@Getter @Setter private char[] busSrvId600 = Field.fillLowValue(6);

						@Getter @Setter private char[] bsLifecylInd600 = Field.fillLowValue(1);

						@Getter @Setter private char[] bsBsseCd600 = Field.fillLowValue(1);
	
	/**
	* Constructor for Table36Bsl600
	**/
    public Table36Bsl600() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Table36Bsl600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Table36Bsl600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
