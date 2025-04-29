package com.cloudframe.app.o529351u.dto;

/**
*  The class XrefRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;


@Data
public class XrefRecord extends XrefRecordSerialized { 
   
				@Getter @Setter private XrfEeDataKey xrfEeDataKey = new XrfEeDataKey();

								@Getter @Setter private int xrfAdjstrNum;
      private List<char[]> xrfCmData; 


								@Getter @Setter private short xrfBankAcctEe;

						@Getter @Setter private char[] xrfRegionIndEe = Field.fillLowValue(1);
      private List<char[]> xrfPrsInd; 

				@Getter @Setter private XrfUpdLog xrfUpdLog = new XrfUpdLog();

								@Getter @Setter private short xrfPortDate;

						@Getter @Setter private char[] xrfLcaInd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfSourceSysInd = Field.fillLowValue(1);

	
	/**
	* Constructor for XrefRecord
	**/
    public XrefRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for XrefRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrefRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getXrfEeDataKey().setParent(this,getStartOffset() + 0);
					getXrfUpdLog().setParent(this,getStartOffset() + 2296);
    } 



}
  
