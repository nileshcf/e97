package com.cloudframe.app.o529351u.dto;

/**
*  The class MedPmtiVariableDetailData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MedPmtiVariableDetailData extends MedPmtiVariableDetailDataSerialized { 
   
				@Getter @Setter private MedPmtiProvX medPmtiProvX = new MedPmtiProvX();

								@Getter @Setter private long medPmtiProvTin;
				@Getter @Setter private MedPmtiSpecPayeeX medPmtiSpecPayeeX = new MedPmtiSpecPayeeX();

								@Getter @Setter private long medPmtiSpecPayeeTin;
	
	/**
	* Constructor for MedPmtiVariableDetailData
	**/
    public MedPmtiVariableDetailData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MedPmtiVariableDetailData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MedPmtiVariableDetailData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMedPmtiProvX().setParent(this,getStartOffset() + 33);
					getMedPmtiSpecPayeeX().setParent(this,getStartOffset() + 119);
    } 



}
  
