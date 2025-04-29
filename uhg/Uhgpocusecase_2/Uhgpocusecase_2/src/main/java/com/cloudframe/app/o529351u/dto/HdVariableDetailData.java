package com.cloudframe.app.o529351u.dto;

/**
*  The class HdVariableDetailData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HdVariableDetailData extends HdVariableDetailDataSerialized { 
   
				@Getter @Setter private HdPmtiProvX hdPmtiProvX = new HdPmtiProvX();

								@Getter @Setter private long hdPmtiTin;
	
	/**
	* Constructor for HdVariableDetailData
	**/
    public HdVariableDetailData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HdVariableDetailData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HdVariableDetailData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getHdPmtiProvX().setParent(this,getStartOffset() + 28);
    } 



}
  
