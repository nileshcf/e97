package com.cloudframe.app.d529351u.dto;

/**
*  The class D51uReturnSw is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uReturnSw extends D51uReturnSwSerialized { 
   

						@Getter @Setter private char[] planFoundSw = Field.fillLowValue(1);

						@Getter @Setter private char[] posFoundSw = Field.fillLowValue(1);

						@Getter @Setter private char[] svcFoundSw = Field.fillLowValue(1);

						@Getter @Setter private char[] provFoundSw = Field.fillLowValue(1);

						@Getter @Setter private char[] icdFoundSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ipaFoundSw = Field.fillLowValue(1);

						@Getter @Setter private char[] causFoundSw = Field.fillLowValue(1);

						@Getter @Setter private char[] moreIcdFoundSw = Field.fillLowValue(1);

						@Getter @Setter private char[] cflgFoundSw = Field.fillLowValue(1);
				@Getter @Setter private D51uTableCounts d51uTableCounts = new D51uTableCounts();

						@Getter @Setter private char[] d51uReturnFiller = Field.fillLowValue(2);
	
	/**
	* Constructor for D51uReturnSw
	**/
    public D51uReturnSw() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uReturnSw. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uReturnSw(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getD51uTableCounts().setParent(this,getStartOffset() + 9);
    } 



}
  
