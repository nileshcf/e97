package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360Financials is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360Financials extends X360FinancialsSerialized { 
   
				@Getter @Setter private X360FSurchrgFields x360FSurchrgFields = new X360FSurchrgFields();
				@Getter @Setter private X360FMcsMdsBase x360FMcsMdsBase = new X360FMcsMdsBase();
				@Getter @Setter private X360FMcsAcqSetl x360FMcsAcqSetl = new X360FMcsAcqSetl();
				@Getter @Setter private X360FMcsIssSetl x360FMcsIssSetl = new X360FMcsIssSetl();
	
	/**
	* Constructor for X360Financials
	**/
    public X360Financials() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360Financials. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360Financials(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getX360FSurchrgFields().setParent(this,getStartOffset() + 0);
					getX360FMcsMdsBase().setParent(this,getStartOffset() + 5);
					getX360FMcsAcqSetl().setParent(this,getStartOffset() + 124);
					getX360FMcsIssSetl().setParent(this,getStartOffset() + 124);
    } 



}
  
