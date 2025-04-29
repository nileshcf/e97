package com.cloudframe.app.o529351u.dto;

/**
*  The class HoldTransData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HoldTransData extends HoldTransDataSerialized { 
   

						@Getter @Setter private char[] holdPs = new char[2];

						@Getter @Setter private char[] holdSvc = new char[6];

						@Getter @Setter private char[] holdCauseCd = new char[1];

						@Getter @Setter private char[] holdSpiTblId = new char[7];

						@Getter @Setter private char[] hold1SpiTblId = new char[7];

						@Getter @Setter private char[] holdPosTierCd = new char[1];

						@Getter @Setter private char[] holdDiagElgInd = new char[1];
	
	/**
	* Constructor for HoldTransData
	**/
    public HoldTransData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HoldTransData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HoldTransData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHoldPs(fillSpace(2));
								setHoldSvc(fillSpace(6));
								setHoldCauseCd(fillSpace(1));
								setHoldSpiTblId(fillSpace(7));
								setHold1SpiTblId(fillSpace(7));
								setHoldPosTierCd(fillSpace(1));
								setHoldDiagElgInd(fillSpace(1));
    } 



}
  
