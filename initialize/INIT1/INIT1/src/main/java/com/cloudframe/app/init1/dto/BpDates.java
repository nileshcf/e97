package com.cloudframe.app.init1.dto;

/**
*  The class BpDates is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BpDates extends BpDatesSerialized { 
   
				@Getter @Setter private StartDt startDt = new StartDt();
				@Getter @Setter private EndDt endDt = new EndDt();

								@Getter @Setter private long startDtIso;

								@Getter @Setter private long endDtIso;
	
	/**
	* Constructor for BpDates
	**/
    public BpDates() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BpDates. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BpDates(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getStartDt().setParent(this,getStartOffset() + 0);
					getEndDt().setParent(this,getStartOffset() + 10);
    } 

	/**
	 * 	initializes BpDates
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getStartDt().initialize();
     
          getEndDt().initialize();
     
                     setStartDtIso(0);
                     setEndDtIso(0);
   }


}
  
