package com.cloudframe.app.d529351u.dto;

/**
*  The class TestVariables is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TestVariables extends TestVariablesSerialized {
   

						@Getter @Setter private char[] testCaus = Field.fillLowValue(1);

						@Getter @Setter private char[] testProvTyp = Field.fillLowValue(2);

						@Getter @Setter private char[] testPos = Field.fillLowValue(2);

						@Getter @Setter private char[] testSvcCd = Field.fillLowValue(6);
				@Getter @Setter private TestDiagArea testDiagArea = new TestDiagArea();

						@Getter @Setter private char[] testCpeDescCd = Field.fillLowValue(6);
	
	/**
	* Constructor for TestVariables
	**/
    public TestVariables() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getTestDiagArea().setParent(this,getStartOffset() + 11);
	   	/*  end of offset */
    }





}
  
