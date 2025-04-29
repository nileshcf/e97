package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip90354TableDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip90354TableDataKey extends Ip90354TableDataKeySerialized { 
   

								@Getter @Setter private int ip90354L1CtlTableType;
				@Getter @Setter private Ip90354L1Ctlmtifunc ip90354L1Ctlmtifunc = new Ip90354L1Ctlmtifunc();
				@Getter @Setter private Ip90354L1CtldataInd ip90354L1CtldataInd = new Ip90354L1CtldataInd();

						@Getter @Setter private char[] ip90354L1Ctldata = Field.fillLowValue(26);

						@Getter @Setter private char[] ip90354L1Ctlexclusionind = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip90354TableDataKey
	**/
    public Ip90354TableDataKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip90354TableDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90354TableDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp90354L1Ctlmtifunc().setParent(this,getStartOffset() + 1);
					getIp90354L1CtldataInd().setParent(this,getStartOffset() + 8);
    } 



}
  
