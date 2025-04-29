package com.cloudframe.app.cfdate02.dto;

/**
*  The class TCpduTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class TCpduTableInit extends TCpduTableInitSerialized {
   
				@Getter @Setter private TCpduUbInit tCpduUbInit = new TCpduUbInit();

						@Getter @Setter private char[] tCpduErrorInit = new char[6];
				@Getter @Setter private TCpduVisionInit tCpduVisionInit = new TCpduVisionInit();
	
	/**
	* Constructor for TCpduTableInit
	**/
    public TCpduTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getTCpduUbInit().setParent(this,getStartOffset() + 0);
					getTCpduVisionInit().setParent(this,getStartOffset() + 168);
	   	/*  end of offset */
								setTCpduErrorInit(fillSpace(6));
    }





}
  
