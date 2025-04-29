package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501Header is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf501Header extends Sf501HeaderSerialized { 
   

						@Getter @Setter private char[] sf501BkntRefNo = Field.fillLowValue(6);
				@Getter @Setter private Sf501HdrTime sf501HdrTime = new Sf501HdrTime();
				@Getter @Setter private Sf501HdrDate sf501HdrDate = new Sf501HdrDate();

						@Getter @Setter private char[] sf501JResponseInd = Field.fillLowValue(1);

						@Getter @Setter private char[] sf501JDownOption = Field.fillLowValue(1);

						@Getter @Setter private char[] sf501JMotoOption = Field.fillLowValue(1);

						@Getter @Setter private char[] sf501JPosEntryPoint = Field.fillLowValue(2);
	
	/**
	* Constructor for Sf501Header
	**/
    public Sf501Header() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf501Header. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501Header(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSf501HdrTime().setParent(this,getStartOffset() + 9);
					getSf501HdrDate().setParent(this,getStartOffset() + 12);
    } 



}
  
