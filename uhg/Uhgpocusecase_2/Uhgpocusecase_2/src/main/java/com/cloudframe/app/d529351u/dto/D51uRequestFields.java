package com.cloudframe.app.d529351u.dto;

/**
*  The class D51uRequestFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uRequestFields extends D51uRequestFieldsSerialized { 
   

						@Getter @Setter private char[] d51uReqCallerType = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uReqCallingProgram = Field.fillLowValue(8);

								@Getter @Setter private int d51uReqFuncCd;

						@Getter @Setter private char[] d51uReqType = Field.fillLowValue(1);
				@Getter @Setter private D51uKey d51uKey = new D51uKey();
				@Getter @Setter private D51uOtherReq d51uOtherReq = new D51uOtherReq();
				@Getter @Setter private D51uLstIcdKey d51uLstIcdKey = new D51uLstIcdKey();
				@Getter @Setter private D51uTestValues d51uTestValues = new D51uTestValues();
	
	/**
	* Constructor for D51uRequestFields
	**/
    public D51uRequestFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uRequestFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRequestFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getD51uKey().setParent(this,getStartOffset() + 12);
					getD51uOtherReq().setParent(this,getStartOffset() + 30);
					getD51uLstIcdKey().setParent(this,getStartOffset() + 38);
					getD51uTestValues().setParent(this,getStartOffset() + 48);
    } 



}
  
