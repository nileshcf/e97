package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamWorkAreas850 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class DynamWorkAreas850 extends DynamWorkAreas850Serialized {
   

								@Getter @Setter private int dynamPointer850;
				@Getter @Setter private DynamFunctionGroup850 dynamFunctionGroup850 = new DynamFunctionGroup850();
				@Getter @Setter private DynamAllocParms850 dynamAllocParms850 = new DynamAllocParms850();
				@Getter @Setter private DynamInfoIdent850 dynamInfoIdent850 = new DynamInfoIdent850();
				@Getter @Setter private DynamInfoParms850 dynamInfoParms850 = new DynamInfoParms850();
	
	/**
	* Constructor for DynamWorkAreas850
	**/
    public DynamWorkAreas850() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDynamFunctionGroup850().setParent(this,getStartOffset() + 4);
					getDynamAllocParms850().setParent(this,getStartOffset() + 12);
					getDynamInfoIdent850().setParent(this,getStartOffset() + 236);
					getDynamInfoParms850().setParent(this,getStartOffset() + 248);
	   	/*  end of offset */
    }





}
  
