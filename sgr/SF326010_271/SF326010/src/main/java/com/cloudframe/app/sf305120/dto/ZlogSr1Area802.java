package com.cloudframe.app.sf305120.dto;

/**
*  The class ZlogSr1Area802 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ZlogSr1Area802 extends ZlogSr1Area802Serialized {
   
				@Getter @Setter private SrvreqHeader802 srvreqHeader802 = new SrvreqHeader802();

						@Getter @Setter private char[] zlogVariableData802 = new char[8167];
	
	/**
	* Constructor for ZlogSr1Area802
	**/
    public ZlogSr1Area802() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSrvreqHeader802().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setZlogVariableData802(fillLowValue(8167));
    }





}
  
