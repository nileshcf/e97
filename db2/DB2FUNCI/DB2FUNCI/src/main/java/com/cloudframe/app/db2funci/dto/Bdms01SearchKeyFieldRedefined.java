package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01SearchKeyFieldRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Bdms01SearchKeyFieldRedefined extends Bdms01SearchKeyFieldRedefinedSerialized { 
   
				@Getter @Setter private Bdms01SearchOptExpCcyymmdd bdms01SearchOptExpCcyymmdd = new Bdms01SearchOptExpCcyymmdd();

						@Getter @Setter private char[] bdms01SearchOptPutCallCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SearchOptStyleCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SearchOptOpenClose = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01SearchKeyFieldRedefined
	**/
    public Bdms01SearchKeyFieldRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01SearchKeyFieldRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SearchKeyFieldRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getBdms01SearchOptExpCcyymmdd().setParent(this,getStartOffset() + 0);
    } 



}
  
