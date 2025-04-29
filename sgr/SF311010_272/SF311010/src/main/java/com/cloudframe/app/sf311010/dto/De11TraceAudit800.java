package com.cloudframe.app.sf311010.dto;

/**
*  The class De11TraceAudit800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class De11TraceAudit800 extends De11TraceAudit800Serialized {
   


								@Getter @Setter private long traceAudit800;
	
	/**
	* Constructor for De11TraceAudit800
	**/
    public De11TraceAudit800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue(pad(2,"0","0",LEFT_PAD),getStartOffset() + 0,2);
    }





}
  
