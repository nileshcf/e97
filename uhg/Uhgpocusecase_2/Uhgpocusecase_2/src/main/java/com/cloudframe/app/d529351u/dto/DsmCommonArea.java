package com.cloudframe.app.d529351u.dto;

/**
*  The class DsmCommonArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DsmCommonArea extends DsmCommonAreaSerialized { 
   

								@Getter @Setter private int dsmFuncCd01;

								@Getter @Setter private int dsmReturnCode;

						@Getter @Setter private char[] dsmEditErrorField = new char[30];

								@Getter @Setter private long dsmEditErrorOccurs;
				@Getter @Setter private DsmEditErrorValueTxt dsmEditErrorValueTxt = new DsmEditErrorValueTxt();

								@Getter @Setter private short dsmSqlcode;

								@Getter @Setter private int dsmSqlErrorLevel;

						@Getter @Setter private char[] dsmSqlErrorMessage = Field.fillLowValue(120);
				@Getter @Setter private DsmFormattedSqlErrMsg dsmFormattedSqlErrMsg = new DsmFormattedSqlErrMsg();
	
	/**
	* Constructor for DsmCommonArea
	**/
    public DsmCommonArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DsmCommonArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmCommonArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getDsmEditErrorValueTxt().setParent(this,getStartOffset() + 40);
					getDsmFormattedSqlErrMsg().setParent(this,getStartOffset() + 186);
								setDsmReturnCode(0);
								setDsmEditErrorField(fillSpace(30));
								setDsmEditErrorOccurs(0L);
								setDsmSqlErrorLevel(0);
    } 



}
  
