package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501RecordRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf501RecordRedefined extends Sf501RecordRedefinedSerialized { 
   

						@Getter @Setter private char[] sf501Class = Field.fillLowValue(1);

						@Getter @Setter private char[] sf501Type = Field.fillLowValue(1);
				@Getter @Setter private Sf501Header sf501Header = new Sf501Header();

						@Getter @Setter private char[] sf501JIcSeqNo = Field.fillLowValue(4);

								@Getter @Setter private long sf501JIcSeqNoComp;

						@Getter @Setter private char[] sf501JIsoData = Field.fillLowValue(7939);
				@Getter @Setter private Sf501JIsoDataRedefined sf501JIsoDataRedefined = new Sf501JIsoDataRedefined();
	
	/**
	* Constructor for Sf501RecordRedefined
	**/
    public Sf501RecordRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf501RecordRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501RecordRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSf501Header().setParent(this,getStartOffset() + 2);
					getSf501JIsoDataRedefined().setParent(this,getStartOffset() + 61);
    } 



}
  
