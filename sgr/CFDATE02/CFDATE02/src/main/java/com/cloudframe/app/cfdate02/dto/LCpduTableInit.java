package com.cloudframe.app.cfdate02.dto;

/**
*  The class LCpduTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class LCpduTableInit extends LCpduTableInitSerialized {
   
				@Getter @Setter private LCpduUbInit lCpduUbInit = new LCpduUbInit();

						@Getter @Setter private char[] lCpduErrorInit = new char[6];
				@Getter @Setter private LCpduVisionInit lCpduVisionInit = new LCpduVisionInit();
	
	/**
	* Constructor for LCpduTableInit
	**/
    public LCpduTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getLCpduUbInit().setParent(this,getStartOffset() + 0);
					getLCpduVisionInit().setParent(this,getStartOffset() + 168);
	   	/*  end of offset */
								setLCpduErrorInit(fillSpace(6));
    }





}
  
