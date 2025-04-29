package com.cloudframe.app.ar640010.dto;

/**
*  The class MciseqioRecfmCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MciseqioRecfmCodes extends MciseqioRecfmCodesSerialized { 
   

						@Getter @Setter private char[] mciseqioRecfmOnDd = new char[2];

						@Getter @Setter private char[] mciseqioRecfmU = new char[2];

						@Getter @Setter private char[] mciseqioRecfmF = new char[2];

						@Getter @Setter private char[] mciseqioRecfmFb = new char[2];

						@Getter @Setter private char[] mciseqioRecfmFs = new char[2];

						@Getter @Setter private char[] mciseqioRecfmV = new char[2];

						@Getter @Setter private char[] mciseqioRecfmVb = new char[2];

						@Getter @Setter private char[] mciseqioRecfmVs = new char[2];
	
	/**
	* Constructor for MciseqioRecfmCodes
	**/
    public MciseqioRecfmCodes() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MciseqioRecfmCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioRecfmCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMciseqioRecfmOnDd(fillSpace(2));
								setMciseqioRecfmU(("U ").toCharArray());
								setMciseqioRecfmF(("F ").toCharArray());
								setMciseqioRecfmFb(("FB").toCharArray());
								setMciseqioRecfmFs(("FS").toCharArray());
								setMciseqioRecfmV(("V ").toCharArray());
								setMciseqioRecfmVb(("VB").toCharArray());
								setMciseqioRecfmVs(("VS").toCharArray());
    } 



}
  
