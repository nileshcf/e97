package com.cloudframe.app.o529351u.dto;

/**
*  The class DrstReturnArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DrstReturnArea extends DrstReturnAreaSerialized { 
   

								@Getter @Setter private int drstReturnCode;

						@Getter @Setter private char[] drstEditErrorField = new char[20];
				@Getter @Setter private DrstEditErrorValueTxt drstEditErrorValueTxt = new DrstEditErrorValueTxt();
	
	/**
	* Constructor for DrstReturnArea
	**/
    public DrstReturnArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DrstReturnArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DrstReturnArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getDrstEditErrorValueTxt().setParent(this,getStartOffset() + 23);
								setDrstReturnCode(0);
								setDrstEditErrorField(fillSpace(20));
    } 



}
  
