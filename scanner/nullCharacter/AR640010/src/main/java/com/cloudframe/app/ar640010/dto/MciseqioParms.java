package com.cloudframe.app.ar640010.dto;

/**
*  The class MciseqioParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MciseqioParms extends MciseqioParmsSerialized { 
   

						@Getter @Setter private char[] mciseqioDdname = Field.fillLowValue(8);

								@Getter @Setter private short mciseqioRequest;

						@Getter @Setter private char[] mciseqioSysid = Field.fillLowValue(2);

						@Getter @Setter private char[] mciseqioApplid = Field.fillLowValue(8);

						@Getter @Setter private char[] mciseqioDsn = new char[44];

						@Getter @Setter private char[] mciseqioTapser = new char[6];

						@Getter @Setter private char[] mciseqioVolser = new char[6];

						@Getter @Setter private char[] mciseqioLabel = new char[2];

						@Getter @Setter private char[] mciseqioRecfm = new char[2];

								@Getter @Setter private short mciseqioLrecl;

								@Getter @Setter private short mciseqioBlksize;
	
	/**
	* Constructor for MciseqioParms
	**/
    public MciseqioParms() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MciseqioParms. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioParms(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMciseqioDsn(fillSpace(44));
								setMciseqioTapser(fillSpace(6));
								setMciseqioVolser(fillSpace(6));
								setMciseqioLabel(fillSpace(2));
								setMciseqioRecfm(fillSpace(2));
								setMciseqioLrecl((short)0);
								setMciseqioBlksize((short)0);
    } 



}
  
