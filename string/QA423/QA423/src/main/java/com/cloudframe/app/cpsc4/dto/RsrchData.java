package com.cloudframe.app.cpsc4.dto;

/**
*  The class RsrchData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RsrchData extends RsrchDataSerialized { 
   

						@Getter @Setter private char[] cusipOrSmaId = Field.fillLowValue(9);

						@Getter @Setter private char[] filler1Ws = new char[1];

						@Getter @Setter private char[] prodInvstObjCd = Field.fillLowValue(1);

						@Getter @Setter private char[] filler2Ws = new char[1];

								@Getter @Setter private char[] prodInvstAllocPct = Field.fillLowValue(7);

						@Getter @Setter private char[] filler3Ws = new char[1];

								@Getter @Setter private char[] prodMinTrgtDriftPct = Field.fillLowValue(7);

						@Getter @Setter private char[] filler4Ws = new char[1];

								@Getter @Setter private char[] prodMaxTrgtDriftPct = Field.fillLowValue(7);

						@Getter @Setter private char[] filler5Ws = new char[1];
	
	/**
	* Constructor for RsrchData
	**/
    public RsrchData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RsrchData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RsrchData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setFiller1Ws((";").toCharArray());
								setFiller2Ws((";").toCharArray());
								setFiller3Ws((";").toCharArray());
								setFiller4Ws((";").toCharArray());
								setFiller5Ws((";").toCharArray());
    } 



}
  
