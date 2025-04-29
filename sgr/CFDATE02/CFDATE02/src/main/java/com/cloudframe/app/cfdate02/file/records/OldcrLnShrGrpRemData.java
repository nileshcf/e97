package com.cloudframe.app.cfdate02.file.records;

/**
*  The class OldcrLnShrGrpRemData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class OldcrLnShrGrpRemData extends OldcrLnShrGrpRemDataSerialized {
   
				@Getter @Setter private OldcrLnShrGrpRemDtl oldcrLnShrGrpRemDtl = new OldcrLnShrGrpRemDtl();
				@Getter @Setter private OldcrLnShrGrpRemHdr oldcrLnShrGrpRemHdr = new OldcrLnShrGrpRemHdr();
				@Getter @Setter private OldcrLnShrGrpRemTlr oldcrLnShrGrpRemTlr = new OldcrLnShrGrpRemTlr();
	
	/**
	* Constructor for OldcrLnShrGrpRemData
	**/
    public OldcrLnShrGrpRemData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getOldcrLnShrGrpRemDtl().setParent(this,getStartOffset() + 0);
					getOldcrLnShrGrpRemHdr().setParent(this,getStartOffset() + 0);
					getOldcrLnShrGrpRemTlr().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
