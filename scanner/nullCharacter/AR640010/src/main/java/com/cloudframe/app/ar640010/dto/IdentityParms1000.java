package com.cloudframe.app.ar640010.dto;

/**
*  The class IdentityParms1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class IdentityParms1000 extends IdentityParms1000Serialized {
   

						@Getter @Setter private char[] programId1000 = new char[8];
				@Getter @Setter private VersionId1000 versionId1000 = new VersionId1000();
				@Getter @Setter private ExecutionOptions1000 executionOptions1000 = new ExecutionOptions1000();
	
	/**
	* Constructor for IdentityParms1000
	**/
    public IdentityParms1000() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getVersionId1000().setParent(this,getStartOffset() + 8);
					getExecutionOptions1000().setParent(this,getStartOffset() + 20);
	   	/*  end of offset */
								setProgramId1000(("AR640010").toCharArray());
    }





}
  
