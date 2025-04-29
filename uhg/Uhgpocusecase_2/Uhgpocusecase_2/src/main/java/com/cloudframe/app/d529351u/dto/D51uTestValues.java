package com.cloudframe.app.d529351u.dto;

/**
*  The class D51uTestValues is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uTestValues extends D51uTestValuesSerialized { 
   

						@Getter @Setter private char[] d51uTestCaus = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uTestProvTyp = Field.fillLowValue(2);

						@Getter @Setter private char[] d51uTestPos = Field.fillLowValue(2);

						@Getter @Setter private char[] d51uTestSvcCd = Field.fillLowValue(6);
				@Getter @Setter private D51uTestDiagArea d51uTestDiagArea = new D51uTestDiagArea();

						@Getter @Setter private char[] d51uTestCpeDescCd = Field.fillLowValue(4);
	
	/**
	* Constructor for D51uTestValues
	**/
    public D51uTestValues() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uTestValues. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uTestValues(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getD51uTestDiagArea().setParent(this,getStartOffset() + 11);
    } 



}
  
