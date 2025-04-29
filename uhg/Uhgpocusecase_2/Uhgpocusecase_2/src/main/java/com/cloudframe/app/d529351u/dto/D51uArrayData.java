package com.cloudframe.app.d529351u.dto;

/**
*  The class D51uArrayData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uArrayData extends D51uArrayDataSerialized { 
   
				@Getter @Setter private D51uRetData d51uRetData = new D51uRetData();
				@Getter @Setter private D51uRetRulKeys d51uRetRulKeys = new D51uRetRulKeys();
				@Getter @Setter private D51uRetRulFrToSvc d51uRetRulFrToSvc = new D51uRetRulFrToSvc();
				@Getter @Setter private D51uRetRulProvTyp d51uRetRulProvTyp = new D51uRetRulProvTyp();
				@Getter @Setter private D51uRetRulIpa d51uRetRulIpa = new D51uRetRulIpa();
				@Getter @Setter private D51uRetRulCauseData d51uRetRulCauseData = new D51uRetRulCauseData();
				@Getter @Setter private D51uRetRulFrCondPos d51uRetRulFrCondPos = new D51uRetRulFrCondPos();
				@Getter @Setter private D51uRetRulIcd d51uRetRulIcd = new D51uRetRulIcd();
				@Getter @Setter private D51uRetRulCpeFlgData d51uRetRulCpeFlgData = new D51uRetRulCpeFlgData();
	
	/**
	* Constructor for D51uArrayData
	**/
    public D51uArrayData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uArrayData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uArrayData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getD51uRetData().setParent(this,getStartOffset() + 0);
					getD51uRetRulKeys().setParent(this,getStartOffset() + 409959);
					getD51uRetRulFrToSvc().setParent(this,getStartOffset() + 411642);
					getD51uRetRulProvTyp().setParent(this,getStartOffset() + 631620);
					getD51uRetRulIpa().setParent(this,getStartOffset() + 632709);
					getD51uRetRulCauseData().setParent(this,getStartOffset() + 636372);
					getD51uRetRulFrCondPos().setParent(this,getStartOffset() + 638055);
					getD51uRetRulIcd().setParent(this,getStartOffset() + 639243);
					getD51uRetRulCpeFlgData().setParent(this,getStartOffset() + 879219);
    } 



}
  
