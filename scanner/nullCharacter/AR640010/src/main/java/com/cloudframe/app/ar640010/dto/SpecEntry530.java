package com.cloudframe.app.ar640010.dto;

/**
*  The class SpecEntry530 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SpecEntry530 extends SpecEntry530Serialized { 
   

						@Getter @Setter private char[] specDd530 = new char[8];
				@Getter @Setter private SpecFile530 specFile530 = new SpecFile530();

						@Getter @Setter private char[] specUseCode530 = new char[1];

						@Getter @Setter private char[] specStatStatus530 = new char[1];

						@Getter @Setter private char[] specIdCode530 = new char[1];

						@Getter @Setter private char[] specAtype530 = new char[1];
				@Getter @Setter private SpecRecfm530 specRecfm530 = new SpecRecfm530();

								@Getter @Setter private int specUnits530;

								@Getter @Setter private int specPspace530;

								@Getter @Setter private int specSspace530;

								@Getter @Setter private int specLrecl530;

								@Getter @Setter private int specBlksz530;

						@Getter @Setter private char[] specSeqio530 = new char[84];
	
	/**
	* Constructor for SpecEntry530
	**/
    public SpecEntry530() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SpecEntry530. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SpecEntry530(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSpecFile530().setParent(this,getStartOffset() + 8);
					getSpecRecfm530().setParent(this,getStartOffset() + 64);
								setSpecDd530(fillSpace(8));
							getSpecFile530().setString(fillSpace(52));
								setSpecUseCode530(fillSpace(1));
								setSpecStatStatus530(fillSpace(1));
								setSpecIdCode530(fillSpace(1));
								setSpecAtype530(fillSpace(1));
							getSpecRecfm530().setString(fillSpace(3));
								setSpecUnits530(0);
								setSpecPspace530(0);
								setSpecSspace530(0);
								setSpecLrecl530(0);
								setSpecBlksz530(0);
								setSpecSeqio530(pad(84," ".toCharArray(),' ',RIGHT_PAD));
    } 



}
  
